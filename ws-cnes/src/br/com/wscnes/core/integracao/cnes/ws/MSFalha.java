
package br.com.wscnes.core.integracao.cnes.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element name="identificador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Mensagem" type="{http://servicos.saude.gov.br/wsdl/mensageria/falha/v5r0/mensagem}MensagemType" maxOccurs="unbounded" minOccurs="0"/>
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
    "identificador",
    "mensagem"
})
@XmlRootElement(name = "MSFalha", namespace = "http://servicos.saude.gov.br/wsdl/mensageria/falha/v5r0/msfalha")
public class MSFalha {

    @XmlElementRef(name = "identificador", namespace = "http://servicos.saude.gov.br/wsdl/mensageria/falha/v5r0/msfalha", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identificador;
    @XmlElement(name = "Mensagem", namespace = "http://servicos.saude.gov.br/wsdl/mensageria/falha/v5r0/msfalha")
    protected List<MensagemType> mensagem;

    /**
     * Gets the value of the identificador property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdentificador() {
        return identificador;
    }

    /**
     * Sets the value of the identificador property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdentificador(JAXBElement<String> value) {
        this.identificador = value;
    }

    /**
     * Gets the value of the mensagem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mensagem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMensagem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MensagemType }
     * 
     * 
     */
    public List<MensagemType> getMensagem() {
        if (mensagem == null) {
            mensagem = new ArrayList<MensagemType>();
        }
        return this.mensagem;
    }

}
