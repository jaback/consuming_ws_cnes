package br.com.wscnes.core.service;

import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;

import br.com.wscnes.core.integracao.cnes.WSSUsernameTokenSecurityHandler;
import br.com.wscnes.core.integracao.cnes.ws.CodigoCNESType;
import br.com.wscnes.core.integracao.cnes.ws.EstabelecimentoSaudeFault;
import br.com.wscnes.core.integracao.cnes.ws.EstabelecimentoSaudeService;
import br.com.wscnes.core.integracao.cnes.ws.EstabelecimentoSaudeServicePortType;
import br.com.wscnes.core.integracao.cnes.ws.FiltroPesquisaEstabelecimentoSaudeType;
import br.com.wscnes.core.integracao.cnes.ws.ObjectFactory;
import br.com.wscnes.core.integracao.cnes.ws.RequestConsultarEstabelecimentoSaude;
import br.com.wscnes.core.integracao.cnes.ws.ResponseConsultarEstabelecimentoSaude;
import br.com.wscnes.core.model.dto.HospitalDto;

public class EstabelecimentoSaudeServico {

	public HospitalDto consultarEstabelecimentoSaude(String codigoCnes) {

		HospitalDto hospital = null;
		EstabelecimentoSaudeService ws = new EstabelecimentoSaudeService();

		// Setar cabeçalho
		final WSSUsernameTokenSecurityHandler handler = new WSSUsernameTokenSecurityHandler("CNES.PUBLICO",
				"cnes#2015public");
		ws.setHandlerResolver(new HandlerResolver() {
			@Override
			@SuppressWarnings("rawtypes")
			public List<Handler> getHandlerChain(PortInfo arg0) {
				List<Handler> handlerList = new ArrayList<Handler>();
				handlerList.add(handler);
				return handlerList;
			}
		});

		EstabelecimentoSaudeServicePortType service = ws.getPort(EstabelecimentoSaudeServicePortType.class);

		ObjectFactory factory = new ObjectFactory();
		RequestConsultarEstabelecimentoSaude request = factory.createRequestConsultarEstabelecimentoSaude();
		FiltroPesquisaEstabelecimentoSaudeType filtroPesquisaEstabelecimentoSaudeType = factory
				.createFiltroPesquisaEstabelecimentoSaudeType();
		CodigoCNESType codigoCNESType = factory.createCodigoCNESType();
		codigoCNESType.setCodigo(codigoCnes);
		filtroPesquisaEstabelecimentoSaudeType.setCodigoCNES(codigoCNESType);
		request.setFiltroPesquisaEstabelecimentoSaude(filtroPesquisaEstabelecimentoSaudeType);

		ResponseConsultarEstabelecimentoSaude response;
		try {
			response = service.consultarEstabelecimentoSaude(request);
			if (response != null) {
				hospital = converter(response);
			}
		} catch (EstabelecimentoSaudeFault e) {
			e.printStackTrace();
		}

		return hospital;
	}

	public HospitalDto converter(ResponseConsultarEstabelecimentoSaude response) {

		HospitalDto dto = new HospitalDto();
		dto.setCnes(Long.valueOf(response.getDadosGeraisEstabelecimentoSaude().getCodigoCNES().getCodigo()));
		dto.setCompanyName(response.getDadosGeraisEstabelecimentoSaude().getNomeEmpresarial().getNome());
		dto.setTradingName(response.getDadosGeraisEstabelecimentoSaude().getNomeFantasia().getNome());
		dto.setUf(response.getDadosGeraisEstabelecimentoSaude().getEndereco().getMunicipio().getUF().getSiglaUF());
		dto.setCity(response.getDadosGeraisEstabelecimentoSaude().getEndereco().getMunicipio().getNomeMunicipio());

		return dto;
	}

}