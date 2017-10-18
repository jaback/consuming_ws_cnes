
package br.com.wscnes.core.integracao.cnes.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "EstabelecimentoSaudeServicePortType", targetNamespace = "http://servicos.saude.gov.br/cnes/v1r0/estabelecimentosaudeservice")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface EstabelecimentoSaudeServicePortType {


    /**
     * 
     * 				Consultar os dados básicos do Estabelecimento de Saude pelo código do CNES.
     * 			
     * 
     * @param requestConsultarEstabelecimentoSaude
     * @return
     *     returns client.ResponseConsultarEstabelecimentoSaude
     * @throws EstabelecimentoSaudeFault
     */
    @WebMethod
    @WebResult(name = "responseConsultarEstabelecimentoSaude", targetNamespace = "http://servicos.saude.gov.br/cnes/v1r0/estabelecimentosaudeservice", partName = "responseConsultarEstabelecimentoSaude")
    public ResponseConsultarEstabelecimentoSaude consultarEstabelecimentoSaude(
        @WebParam(name = "requestConsultarEstabelecimentoSaude", targetNamespace = "http://servicos.saude.gov.br/cnes/v1r0/estabelecimentosaudeservice", partName = "requestConsultarEstabelecimentoSaude")
        RequestConsultarEstabelecimentoSaude requestConsultarEstabelecimentoSaude)
        throws EstabelecimentoSaudeFault
    ;

    /**
     * 
     * 				Localiza os Estabelecimentos de Saude pelas coordenadas.
     * 			
     * 
     * @param requestLocalizarEstabelecimentoSaude
     * @return
     *     returns client.ResponseLocalizarEstabelecimentoSaude
     * @throws EstabelecimentoSaudeFault
     */
    @WebMethod
    @WebResult(name = "responseLocalizarEstabelecimentoSaude", targetNamespace = "http://servicos.saude.gov.br/cnes/v1r0/estabelecimentosaudeservice", partName = "responseLocalizarEstabelecimentoSaude")
    public ResponseLocalizarEstabelecimentoSaude localizarEstabelecimentoSaude(
        @WebParam(name = "requestLocalizarEstabelecimentoSaude", targetNamespace = "http://servicos.saude.gov.br/cnes/v1r0/estabelecimentosaudeservice", partName = "requestLocalizarEstabelecimentoSaude")
        RequestLocalizarEstabelecimentoSaude requestLocalizarEstabelecimentoSaude)
        throws EstabelecimentoSaudeFault
    ;

    /**
     * 
     * 				Consultar os dados básicos do precadastro do Estabelecimento de Saude pelo código do CNES.
     * 			
     * 
     * @param requestConsultarPrecadastroCNES
     * @return
     *     returns client.ResponseConsultarPrecadastroCNES
     * @throws EstabelecimentoSaudeFault
     */
    @WebMethod
    @WebResult(name = "responseConsultarPrecadastroCNES", targetNamespace = "http://servicos.saude.gov.br/cnes/v1r0/estabelecimentosaudeservice", partName = "responseConsultarPrecadastroCNES")
    public ResponseConsultarPrecadastroCNES consultarPrecadastroCNES(
        @WebParam(name = "requestConsultarPrecadastroCNES", targetNamespace = "http://servicos.saude.gov.br/cnes/v1r0/estabelecimentosaudeservice", partName = "requestConsultarPrecadastroCNES")
        RequestConsultarPrecadastroCNES requestConsultarPrecadastroCNES)
        throws EstabelecimentoSaudeFault
    ;

}