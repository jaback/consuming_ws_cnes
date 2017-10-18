
package br.com.wscnes.core.integracao.cnes.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FiltroPesquisaPrecadastroCnesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FiltroPesquisaPrecadastroCnesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://servicos.saude.gov.br/schema/cnes/v1r0/codigocnes}CodigoCNES" minOccurs="0"/>
 *         &lt;element name="situacao" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="A"/>
 *               &lt;enumeration value="D"/>
 *               &lt;enumeration value="E"/>
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
@XmlType(name = "FiltroPesquisaPrecadastroCnesType", namespace = "http://servicos.saude.gov.br/wsdl/mensageria/v1r0/filtropesquisaprecadastrocnes", propOrder = {
    "codigoCNES",
    "situacao"
})
public class FiltroPesquisaPrecadastroCnesType {

    @XmlElement(name = "CodigoCNES", namespace = "http://servicos.saude.gov.br/schema/cnes/v1r0/codigocnes")
    protected CodigoCNESType codigoCNES;
    @XmlElementRef(name = "situacao", namespace = "http://servicos.saude.gov.br/wsdl/mensageria/v1r0/filtropesquisaprecadastrocnes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> situacao;

    /**
     * Código do CNES.
     * 
     * @return
     *     possible object is
     *     {@link CodigoCNESType }
     *     
     */
    public CodigoCNESType getCodigoCNES() {
        return codigoCNES;
    }

    /**
     * Sets the value of the codigoCNES property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodigoCNESType }
     *     
     */
    public void setCodigoCNES(CodigoCNESType value) {
        this.codigoCNES = value;
    }

    /**
     * Gets the value of the situacao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSituacao() {
        return situacao;
    }

    /**
     * Sets the value of the situacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSituacao(JAXBElement<String> value) {
        this.situacao = value;
    }

}
