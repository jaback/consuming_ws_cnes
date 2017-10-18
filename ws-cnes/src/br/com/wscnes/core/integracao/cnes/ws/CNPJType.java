
package br.com.wscnes.core.integracao.cnes.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CNPJType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CNPJType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroCNPJ">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="14"/>
 *               &lt;maxLength value="14"/>
 *               &lt;pattern value="[0-9]*"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CNPJType", namespace = "http://servicos.saude.gov.br/schema/corporativo/pessoajuridica/v1r0/cnpj", propOrder = {
    "numeroCNPJ"
})
public class CNPJType {

    @XmlElement(required = true)
    protected String numeroCNPJ;

    /**
     * Gets the value of the numeroCNPJ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCNPJ() {
        return numeroCNPJ;
    }

    /**
     * Sets the value of the numeroCNPJ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCNPJ(String value) {
        this.numeroCNPJ = value;
    }

}
