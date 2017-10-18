
package br.com.wscnes.core.integracao.cnes.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiretorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiretorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CPF" type="{http://servicos.saude.gov.br/schema/corporativo/documento/v1r2/cpf}CPFType"/>
 *         &lt;element name="nome" type="{http://servicos.saude.gov.br/schema/corporativo/pessoafisica/v1r2/nomecompleto}NomeCompletoType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiretorType", namespace = "http://servicos.saude.gov.br/schema/cnes/v1r0/diretor", propOrder = {
    "cpf",
    "nome"
})
public class DiretorType {

    @XmlElement(name = "CPF", required = true)
    protected CPFType cpf;
    @XmlElement(required = true)
    protected NomeCompletoType nome;

    /**
     * Gets the value of the cpf property.
     * 
     * @return
     *     possible object is
     *     {@link CPFType }
     *     
     */
    public CPFType getCPF() {
        return cpf;
    }

    /**
     * Sets the value of the cpf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CPFType }
     *     
     */
    public void setCPF(CPFType value) {
        this.cpf = value;
    }

    /**
     * Gets the value of the nome property.
     * 
     * @return
     *     possible object is
     *     {@link NomeCompletoType }
     *     
     */
    public NomeCompletoType getNome() {
        return nome;
    }

    /**
     * Sets the value of the nome property.
     * 
     * @param value
     *     allowed object is
     *     {@link NomeCompletoType }
     *     
     */
    public void setNome(NomeCompletoType value) {
        this.nome = value;
    }

}
