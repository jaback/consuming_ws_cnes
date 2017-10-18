
package br.com.wscnes.core.integracao.cnes.ws;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TelefoneType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TelefoneType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificador" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="TipoTelefone" type="{http://servicos.saude.gov.br/schema/corporativo/telefone/v1r1/tipotelefone}TipoTelefoneType" minOccurs="0"/>
 *         &lt;element name="DDI" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger">
 *               &lt;maxInclusive value="999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DDD" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger">
 *               &lt;maxInclusive value="99"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="numeroTelefone" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger">
 *               &lt;maxInclusive value="999999999"/>
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
@XmlType(name = "TelefoneType", namespace = "http://servicos.saude.gov.br/schema/corporativo/telefone/v1r2/telefone", propOrder = {
    "identificador",
    "tipoTelefone",
    "ddi",
    "ddd",
    "numeroTelefone"
})
public class TelefoneType {

    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger identificador;
    @XmlElement(name = "TipoTelefone")
    protected TipoTelefoneType tipoTelefone;
    @XmlElement(name = "DDI")
    protected Integer ddi;
    @XmlElement(name = "DDD")
    protected Integer ddd;
    protected Integer numeroTelefone;

    /**
     * Gets the value of the identificador property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIdentificador() {
        return identificador;
    }

    /**
     * Sets the value of the identificador property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIdentificador(BigInteger value) {
        this.identificador = value;
    }

    /**
     * Gets the value of the tipoTelefone property.
     * 
     * @return
     *     possible object is
     *     {@link TipoTelefoneType }
     *     
     */
    public TipoTelefoneType getTipoTelefone() {
        return tipoTelefone;
    }

    /**
     * Sets the value of the tipoTelefone property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoTelefoneType }
     *     
     */
    public void setTipoTelefone(TipoTelefoneType value) {
        this.tipoTelefone = value;
    }

    /**
     * Gets the value of the ddi property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDDI() {
        return ddi;
    }

    /**
     * Sets the value of the ddi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDDI(Integer value) {
        this.ddi = value;
    }

    /**
     * Gets the value of the ddd property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDDD() {
        return ddd;
    }

    /**
     * Sets the value of the ddd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDDD(Integer value) {
        this.ddd = value;
    }

    /**
     * Gets the value of the numeroTelefone property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroTelefone() {
        return numeroTelefone;
    }

    /**
     * Sets the value of the numeroTelefone property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroTelefone(Integer value) {
        this.numeroTelefone = value;
    }

}
