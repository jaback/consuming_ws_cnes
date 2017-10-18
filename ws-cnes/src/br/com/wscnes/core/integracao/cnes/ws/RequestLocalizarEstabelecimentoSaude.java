
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
 *         &lt;element ref="{http://servicos.saude.gov.br/wsdl/mensageria/v1r0/filtrolocalizacaoestabelecimentosaude}FiltroLocalizacaoEstabelecimentoSaude"/>
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
    "filtroLocalizacaoEstabelecimentoSaude"
})
@XmlRootElement(name = "requestLocalizarEstabelecimentoSaude")
public class RequestLocalizarEstabelecimentoSaude {

    @XmlElement(name = "FiltroLocalizacaoEstabelecimentoSaude", namespace = "http://servicos.saude.gov.br/wsdl/mensageria/v1r0/filtrolocalizacaoestabelecimentosaude", required = true)
    protected FiltroLocalizacaoEstabelecimentoSaudeType filtroLocalizacaoEstabelecimentoSaude;

    /**
     * Filtro de Localização.
     * 
     * @return
     *     possible object is
     *     {@link FiltroLocalizacaoEstabelecimentoSaudeType }
     *     
     */
    public FiltroLocalizacaoEstabelecimentoSaudeType getFiltroLocalizacaoEstabelecimentoSaude() {
        return filtroLocalizacaoEstabelecimentoSaude;
    }

    /**
     * Sets the value of the filtroLocalizacaoEstabelecimentoSaude property.
     * 
     * @param value
     *     allowed object is
     *     {@link FiltroLocalizacaoEstabelecimentoSaudeType }
     *     
     */
    public void setFiltroLocalizacaoEstabelecimentoSaude(FiltroLocalizacaoEstabelecimentoSaudeType value) {
        this.filtroLocalizacaoEstabelecimentoSaude = value;
    }

}
