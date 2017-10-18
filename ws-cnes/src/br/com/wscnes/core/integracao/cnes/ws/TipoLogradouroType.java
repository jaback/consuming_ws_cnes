
package br.com.wscnes.core.integracao.cnes.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoLogradouroType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TipoLogradouroType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoTipoLogradouro">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
 *               &lt;pattern value="[0-9]*"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="descricaoTipoLogradouro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoLogradouroType", namespace = "http://servicos.saude.gov.br/schema/corporativo/endereco/v1r1/tipologradouro", propOrder = {
    "codigoTipoLogradouro",
    "descricaoTipoLogradouro"
})
public class TipoLogradouroType {

    @XmlElement(required = true)
    protected String codigoTipoLogradouro;
    protected String descricaoTipoLogradouro;

    /**
     * Gets the value of the codigoTipoLogradouro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoTipoLogradouro() {
        return codigoTipoLogradouro;
    }

    /**
     * Sets the value of the codigoTipoLogradouro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoTipoLogradouro(String value) {
        this.codigoTipoLogradouro = value;
    }

    /**
     * Gets the value of the descricaoTipoLogradouro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoTipoLogradouro() {
        return descricaoTipoLogradouro;
    }

    /**
     * Sets the value of the descricaoTipoLogradouro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoTipoLogradouro(String value) {
        this.descricaoTipoLogradouro = value;
    }

}
