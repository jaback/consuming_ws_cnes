
package br.com.wscnes.core.integracao.cnes.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoTelefoneType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TipoTelefoneType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoTipoTelefone">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *               &lt;pattern value="[0-9]*"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="descricaoTipoTelefone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoTelefoneType", namespace = "http://servicos.saude.gov.br/schema/corporativo/telefone/v1r1/tipotelefone", propOrder = {
    "codigoTipoTelefone",
    "descricaoTipoTelefone"
})
public class TipoTelefoneType {

    @XmlElement(required = true)
    protected String codigoTipoTelefone;
    protected String descricaoTipoTelefone;

    /**
     * Gets the value of the codigoTipoTelefone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoTipoTelefone() {
        return codigoTipoTelefone;
    }

    /**
     * Sets the value of the codigoTipoTelefone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoTipoTelefone(String value) {
        this.codigoTipoTelefone = value;
    }

    /**
     * Gets the value of the descricaoTipoTelefone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoTipoTelefone() {
        return descricaoTipoTelefone;
    }

    /**
     * Sets the value of the descricaoTipoTelefone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoTipoTelefone(String value) {
        this.descricaoTipoTelefone = value;
    }

}
