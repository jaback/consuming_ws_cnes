
package br.com.wscnes.core.integracao.cnes.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResultadoLocalizacaoEstabelecimentoSaudeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResultadoLocalizacaoEstabelecimentoSaudeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EstabelecimentoSaude" type="{http://servicos.saude.gov.br/schema/cnes/v1r0/dadosgeraiscnes}DadosGeraisEstabelecimentoSaudeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultadoLocalizacaoEstabelecimentoSaudeType", namespace = "http://servicos.saude.gov.br/wsdl/mensageria/v1r0/resultadolocalizacaoestabelecimentosaude", propOrder = {
    "estabelecimentoSaude"
})
public class ResultadoLocalizacaoEstabelecimentoSaudeType {

    @XmlElement(name = "EstabelecimentoSaude")
    protected DadosGeraisEstabelecimentoSaudeType estabelecimentoSaude;

    /**
     * Gets the value of the estabelecimentoSaude property.
     * 
     * @return
     *     possible object is
     *     {@link DadosGeraisEstabelecimentoSaudeType }
     *     
     */
    public DadosGeraisEstabelecimentoSaudeType getEstabelecimentoSaude() {
        return estabelecimentoSaude;
    }

    /**
     * Sets the value of the estabelecimentoSaude property.
     * 
     * @param value
     *     allowed object is
     *     {@link DadosGeraisEstabelecimentoSaudeType }
     *     
     */
    public void setEstabelecimentoSaude(DadosGeraisEstabelecimentoSaudeType value) {
        this.estabelecimentoSaude = value;
    }

}
