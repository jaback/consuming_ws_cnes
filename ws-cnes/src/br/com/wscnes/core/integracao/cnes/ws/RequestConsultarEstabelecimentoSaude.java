
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
 *         &lt;element ref="{http://servicos.saude.gov.br/wsdl/mensageria/v1r0/filtropesquisaestabelecimentosaude}FiltroPesquisaEstabelecimentoSaude"/>
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
    "filtroPesquisaEstabelecimentoSaude"
})
@XmlRootElement(name = "requestConsultarEstabelecimentoSaude")
public class RequestConsultarEstabelecimentoSaude {

    @XmlElement(name = "FiltroPesquisaEstabelecimentoSaude", namespace = "http://servicos.saude.gov.br/wsdl/mensageria/v1r0/filtropesquisaestabelecimentosaude", required = true)
    protected FiltroPesquisaEstabelecimentoSaudeType filtroPesquisaEstabelecimentoSaude;

    /**
     * Filtro de Pesquisa.
     * 
     * @return
     *     possible object is
     *     {@link FiltroPesquisaEstabelecimentoSaudeType }
     *     
     */
    public FiltroPesquisaEstabelecimentoSaudeType getFiltroPesquisaEstabelecimentoSaude() {
        return filtroPesquisaEstabelecimentoSaude;
    }

    /**
     * Sets the value of the filtroPesquisaEstabelecimentoSaude property.
     * 
     * @param value
     *     allowed object is
     *     {@link FiltroPesquisaEstabelecimentoSaudeType }
     *     
     */
    public void setFiltroPesquisaEstabelecimentoSaude(FiltroPesquisaEstabelecimentoSaudeType value) {
        this.filtroPesquisaEstabelecimentoSaude = value;
    }

}
