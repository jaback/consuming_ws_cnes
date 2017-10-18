
package br.com.wscnes.core.integracao.cnes.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaginacaoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaginacaoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="posicaoRegistroInicio" type="{http://servicos.saude.gov.br/wsdl/mensageria/v1r0/paginacao}numero"/>
 *         &lt;element name="quantidadeRegistrosPorPagina" type="{http://servicos.saude.gov.br/wsdl/mensageria/v1r0/paginacao}numero"/>
 *         &lt;element name="quantidadeRegistros" type="{http://servicos.saude.gov.br/wsdl/mensageria/v1r0/paginacao}numero" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaginacaoType", namespace = "http://servicos.saude.gov.br/wsdl/mensageria/v1r0/paginacao", propOrder = {
    "posicaoRegistroInicio",
    "quantidadeRegistrosPorPagina",
    "quantidadeRegistros"
})
public class PaginacaoType {

    @XmlElement(required = true)
    protected String posicaoRegistroInicio;
    @XmlElement(required = true)
    protected String quantidadeRegistrosPorPagina;
    protected String quantidadeRegistros;

    /**
     * Gets the value of the posicaoRegistroInicio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosicaoRegistroInicio() {
        return posicaoRegistroInicio;
    }

    /**
     * Sets the value of the posicaoRegistroInicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosicaoRegistroInicio(String value) {
        this.posicaoRegistroInicio = value;
    }

    /**
     * Gets the value of the quantidadeRegistrosPorPagina property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantidadeRegistrosPorPagina() {
        return quantidadeRegistrosPorPagina;
    }

    /**
     * Sets the value of the quantidadeRegistrosPorPagina property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantidadeRegistrosPorPagina(String value) {
        this.quantidadeRegistrosPorPagina = value;
    }

    /**
     * Gets the value of the quantidadeRegistros property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantidadeRegistros() {
        return quantidadeRegistros;
    }

    /**
     * Sets the value of the quantidadeRegistros property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantidadeRegistros(String value) {
        this.quantidadeRegistros = value;
    }

}
