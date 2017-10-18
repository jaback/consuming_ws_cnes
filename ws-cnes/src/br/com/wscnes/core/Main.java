package br.com.wscnes.core;

import br.com.wscnes.core.model.dto.HospitalDto;
import br.com.wscnes.core.service.EstabelecimentoSaudeServico;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.doTest("9142614");
	}

	private void doTest(String cnes) {
		EstabelecimentoSaudeServico e = new EstabelecimentoSaudeServico();
		HospitalDto h = e.consultarEstabelecimentoSaude(cnes);
		System.out.println(h.getCompanyName() + " - " + h.getUf());
	}

}
