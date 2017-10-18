
package br.com.wscnes.core.integracao.cnes.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UFType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UFType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoUF" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="siglaUF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoRegiao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeUF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFType", namespace = "http://servicos.saude.gov.br/schema/corporativo/v1r1/uf", propOrder = {
    "codigoUF",
    "siglaUF",
    "codigoRegiao",
    "nomeUF"
})
public class UFType {

    @XmlElement(required = true)
    protected String codigoUF;
    protected String siglaUF;
    protected String codigoRegiao;
    protected String nomeUF;

    /**
     * Gets the value of the codigoUF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoUF() {
        return codigoUF;
    }

    /**
     * Sets the value of the codigoUF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoUF(String value) {
        this.codigoUF = value;
    }

    /**
     * Gets the value of the siglaUF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiglaUF() {
        return siglaUF;
    }

    /**
     * Sets the value of the siglaUF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiglaUF(String value) {
        this.siglaUF = value;
    }

    /**
     * Gets the value of the codigoRegiao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoRegiao() {
        return codigoRegiao;
    }

    /**
     * Sets the value of the codigoRegiao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoRegiao(String value) {
        this.codigoRegiao = value;
    }

    /**
     * Gets the value of the nomeUF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeUF() {
        return nomeUF;
    }

    /**
     * Sets the value of the nomeUF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeUF(String value) {
        this.nomeUF = value;
    }

}
