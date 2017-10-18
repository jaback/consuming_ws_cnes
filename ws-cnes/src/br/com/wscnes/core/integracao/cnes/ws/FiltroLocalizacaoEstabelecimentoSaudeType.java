
package br.com.wscnes.core.integracao.cnes.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FiltroLocalizacaoEstabelecimentoSaudeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FiltroLocalizacaoEstabelecimentoSaudeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://servicos.saude.gov.br/schema/cnes/v1r0/localizacao}Localizacao"/>
 *         &lt;element ref="{http://servicos.saude.gov.br/schema/cnes/v1r0/tipounidade}tipoUnidade"/>
 *         &lt;element ref="{http://servicos.saude.gov.br/wsdl/mensageria/v1r0/paginacao}Paginacao" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FiltroLocalizacaoEstabelecimentoSaudeType", namespace = "http://servicos.saude.gov.br/wsdl/mensageria/v1r0/filtrolocalizacaoestabelecimentosaude", propOrder = {
    "localizacao",
    "tipoUnidade",
    "paginacao"
})
public class FiltroLocalizacaoEstabelecimentoSaudeType {

    @XmlElement(name = "Localizacao", namespace = "http://servicos.saude.gov.br/schema/cnes/v1r0/localizacao", required = true)
    protected LocalizacaoType localizacao;
    @XmlElement(namespace = "http://servicos.saude.gov.br/schema/cnes/v1r0/tipounidade", required = true)
    protected TipoUnidadeType tipoUnidade;
    @XmlElement(name = "Paginacao", namespace = "http://servicos.saude.gov.br/wsdl/mensageria/v1r0/paginacao")
    protected PaginacaoType paginacao;

    /**
     * Localização do estabelecimento.
     * 
     * @return
     *     possible object is
     *     {@link LocalizacaoType }
     *     
     */
    public LocalizacaoType getLocalizacao() {
        return localizacao;
    }

    /**
     * Sets the value of the localizacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalizacaoType }
     *     
     */
    public void setLocalizacao(LocalizacaoType value) {
        this.localizacao = value;
    }

    /**
     * Tipo de Unidade do Estabelecimento de Saúde.
     * 
     * @return
     *     possible object is
     *     {@link TipoUnidadeType }
     *     
     */
    public TipoUnidadeType getTipoUnidade() {
        return tipoUnidade;
    }

    /**
     * Sets the value of the tipoUnidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoUnidadeType }
     *     
     */
    public void setTipoUnidade(TipoUnidadeType value) {
        this.tipoUnidade = value;
    }

    /**
     * Paginação enviada para uma consulta.
     * 
     * @return
     *     possible object is
     *     {@link PaginacaoType }
     *     
     */
    public PaginacaoType getPaginacao() {
        return paginacao;
    }

    /**
     * Sets the value of the paginacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaginacaoType }
     *     
     */
    public void setPaginacao(PaginacaoType value) {
        this.paginacao = value;
    }

}
