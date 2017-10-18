
package br.com.wscnes.core.integracao.cnes.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://servicos.saude.gov.br/schema/cnes/v1r0/dadosgeraiscnes}DadosGeraisEstabelecimentoSaude" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dadosGeraisEstabelecimentoSaude"
})
@XmlRootElement(name = "responseConsultarEstabelecimentoSaude")
public class ResponseConsultarEstabelecimentoSaude {

    @XmlElement(name = "DadosGeraisEstabelecimentoSaude", namespace = "http://servicos.saude.gov.br/schema/cnes/v1r0/dadosgeraiscnes")
    protected DadosGeraisEstabelecimentoSaudeType dadosGeraisEstabelecimentoSaude;

    /**
     * Gets the value of the dadosGeraisEstabelecimentoSaude property.
     * 
     * @return
     *     possible object is
     *     {@link DadosGeraisEstabelecimentoSaudeType }
     *     
     */
    public DadosGeraisEstabelecimentoSaudeType getDadosGeraisEstabelecimentoSaude() {
        return dadosGeraisEstabelecimentoSaude;
    }

    /**
     * Sets the value of the dadosGeraisEstabelecimentoSaude property.
     * 
     * @param value
     *     allowed object is
     *     {@link DadosGeraisEstabelecimentoSaudeType }
     *     
     */
    public void setDadosGeraisEstabelecimentoSaude(DadosGeraisEstabelecimentoSaudeType value) {
        this.dadosGeraisEstabelecimentoSaude = value;
    }

}
