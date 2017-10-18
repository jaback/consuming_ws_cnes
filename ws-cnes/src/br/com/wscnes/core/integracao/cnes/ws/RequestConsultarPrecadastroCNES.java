
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
 *         &lt;element ref="{http://servicos.saude.gov.br/wsdl/mensageria/v1r0/filtropesquisaprecadastrocnes}FiltroPesquisaPrecadastroCnes"/>
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
    "filtroPesquisaPrecadastroCnes"
})
@XmlRootElement(name = "requestConsultarPrecadastroCNES")
public class RequestConsultarPrecadastroCNES {

    @XmlElement(name = "FiltroPesquisaPrecadastroCnes", namespace = "http://servicos.saude.gov.br/wsdl/mensageria/v1r0/filtropesquisaprecadastrocnes", required = true)
    protected FiltroPesquisaPrecadastroCnesType filtroPesquisaPrecadastroCnes;

    /**
     * Filtro Pesquisa Precadastro CNES.
     * 
     * @return
     *     possible object is
     *     {@link FiltroPesquisaPrecadastroCnesType }
     *     
     */
    public FiltroPesquisaPrecadastroCnesType getFiltroPesquisaPrecadastroCnes() {
        return filtroPesquisaPrecadastroCnes;
    }

    /**
     * Sets the value of the filtroPesquisaPrecadastroCnes property.
     * 
     * @param value
     *     allowed object is
     *     {@link FiltroPesquisaPrecadastroCnesType }
     *     
     */
    public void setFiltroPesquisaPrecadastroCnes(FiltroPesquisaPrecadastroCnesType value) {
        this.filtroPesquisaPrecadastroCnes = value;
    }

}
