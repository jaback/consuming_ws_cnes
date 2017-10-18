
package br.com.wscnes.core.integracao.cnes.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ResultadoLocalizacaoEstabelecimentoSaude_QNAME = new QName("http://servicos.saude.gov.br/wsdl/mensageria/v1r0/resultadolocalizacaoestabelecimentosaude", "ResultadoLocalizacaoEstabelecimentoSaude");
    private final static QName _Localizacao_QNAME = new QName("http://servicos.saude.gov.br/schema/cnes/v1r0/localizacao", "Localizacao");
    private final static QName _DadosGeraisEstabelecimentoSaude_QNAME = new QName("http://servicos.saude.gov.br/schema/cnes/v1r0/dadosgeraiscnes", "DadosGeraisEstabelecimentoSaude");
    private final static QName _UF_QNAME = new QName("http://servicos.saude.gov.br/schema/corporativo/v1r1/uf", "UF");
    private final static QName _EsferaAdministrativa_QNAME = new QName("http://servicos.saude.gov.br/schema/cnes/v1r0/esferaadministrativa", "esferaAdministrativa");
    private final static QName _Telefone_QNAME = new QName("http://servicos.saude.gov.br/schema/corporativo/telefone/v1r2/telefone", "Telefone");
    private final static QName _TipoUnidade_QNAME = new QName("http://servicos.saude.gov.br/schema/cnes/v1r0/tipounidade", "tipoUnidade");
    private final static QName _Municipio_QNAME = new QName("http://servicos.saude.gov.br/schema/corporativo/v1r2/municipio", "Municipio");
    private final static QName _DadosPreCadastroCNES_QNAME = new QName("http://servicos.saude.gov.br/schema/cnes/v1r0/dadosprecadastrocnes", "DadosPreCadastroCNES");
    private final static QName _Bairro_QNAME = new QName("http://servicos.saude.gov.br/schema/corporativo/endereco/v1r1/bairro", "Bairro");
    private final static QName _CodigoCNES_QNAME = new QName("http://servicos.saude.gov.br/schema/cnes/v1r0/codigocnes", "CodigoCNES");
    private final static QName _CPF_QNAME = new QName("http://servicos.saude.gov.br/schema/corporativo/documento/v1r2/cpf", "CPF");
    private final static QName _Mensagem_QNAME = new QName("http://servicos.saude.gov.br/wsdl/mensageria/falha/v5r0/mensagem", "Mensagem");
    private final static QName _ResultadosLocalizacaoEstabelecimentoSaude_QNAME = new QName("http://servicos.saude.gov.br/wsdl/mensageria/v1r0/resultadoslocalizacaoestabelecimentosaude", "ResultadosLocalizacaoEstabelecimentoSaude");
    private final static QName _FiltroLocalizacaoEstabelecimentoSaude_QNAME = new QName("http://servicos.saude.gov.br/wsdl/mensageria/v1r0/filtrolocalizacaoestabelecimentosaude", "FiltroLocalizacaoEstabelecimentoSaude");
    private final static QName _CEP_QNAME = new QName("http://servicos.saude.gov.br/schema/corporativo/endereco/v1r1/cep", "CEP");
    private final static QName _Email_QNAME = new QName("http://servicos.saude.gov.br/schema/corporativo/v1r2/email", "Email");
    private final static QName _TipoTelefone_QNAME = new QName("http://servicos.saude.gov.br/schema/corporativo/telefone/v1r1/tipotelefone", "TipoTelefone");
    private final static QName _CNPJ_QNAME = new QName("http://servicos.saude.gov.br/schema/corporativo/pessoajuridica/v1r0/cnpj", "CNPJ");
    private final static QName _Endereco_QNAME = new QName("http://servicos.saude.gov.br/schema/corporativo/endereco/v1r2/endereco", "Endereco");
    private final static QName _NaturezaJuridica_QNAME = new QName("http://servicos.saude.gov.br/schema/corporativo/pessoajuridica/v1r0/naturezajuridica", "NaturezaJuridica");
    private final static QName _NomeJuridico_QNAME = new QName("http://servicos.saude.gov.br/schema/corporativo/pessoajuridica/v1r0/nomejuridico", "NomeJuridico");
    private final static QName _Paginacao_QNAME = new QName("http://servicos.saude.gov.br/wsdl/mensageria/v1r0/paginacao", "Paginacao");
    private final static QName _Pais_QNAME = new QName("http://servicos.saude.gov.br/schema/corporativo/v1r2/pais", "Pais");
    private final static QName _FiltroPesquisaEstabelecimentoSaude_QNAME = new QName("http://servicos.saude.gov.br/wsdl/mensageria/v1r0/filtropesquisaestabelecimentosaude", "FiltroPesquisaEstabelecimentoSaude");
    private final static QName _CodigoUnidade_QNAME = new QName("http://servicos.saude.gov.br/schema/cnes/v1r0/codigounidade", "CodigoUnidade");
    private final static QName _FiltroPesquisaPrecadastroCnes_QNAME = new QName("http://servicos.saude.gov.br/wsdl/mensageria/v1r0/filtropesquisaprecadastrocnes", "FiltroPesquisaPrecadastroCnes");
    private final static QName _TipoLogradouro_QNAME = new QName("http://servicos.saude.gov.br/schema/corporativo/endereco/v1r1/tipologradouro", "TipoLogradouro");
    private final static QName _NomeCompleto_QNAME = new QName("http://servicos.saude.gov.br/schema/corporativo/pessoafisica/v1r2/nomecompleto", "NomeCompleto");
    private final static QName _Diretor_QNAME = new QName("http://servicos.saude.gov.br/schema/cnes/v1r0/diretor", "Diretor");
    private final static QName _TipoNaturezaJuridica_QNAME = new QName("http://servicos.saude.gov.br/schema/corporativo/pessoajuridica/v1r0/tiponaturezajuridica", "TipoNaturezaJuridica");
    private final static QName _FiltroPesquisaPrecadastroCnesTypeSituacao_QNAME = new QName("http://servicos.saude.gov.br/wsdl/mensageria/v1r0/filtropesquisaprecadastrocnes", "situacao");
    private final static QName _MSFalhaIdentificador_QNAME = new QName("http://servicos.saude.gov.br/wsdl/mensageria/falha/v5r0/msfalha", "identificador");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ResponseLocalizarEstabelecimentoSaude }
     * 
     */
    public ResponseLocalizarEstabelecimentoSaude createResponseLocalizarEstabelecimentoSaude() {
        return new ResponseLocalizarEstabelecimentoSaude();
    }

    /**
     * Create an instance of {@link ResultadosLocalizacaoEstabelecimentoSaudeType }
     * 
     */
    public ResultadosLocalizacaoEstabelecimentoSaudeType createResultadosLocalizacaoEstabelecimentoSaudeType() {
        return new ResultadosLocalizacaoEstabelecimentoSaudeType();
    }

    /**
     * Create an instance of {@link ResponseConsultarEstabelecimentoSaude }
     * 
     */
    public ResponseConsultarEstabelecimentoSaude createResponseConsultarEstabelecimentoSaude() {
        return new ResponseConsultarEstabelecimentoSaude();
    }

    /**
     * Create an instance of {@link DadosGeraisEstabelecimentoSaudeType }
     * 
     */
    public DadosGeraisEstabelecimentoSaudeType createDadosGeraisEstabelecimentoSaudeType() {
        return new DadosGeraisEstabelecimentoSaudeType();
    }

    /**
     * Create an instance of {@link RequestLocalizarEstabelecimentoSaude }
     * 
     */
    public RequestLocalizarEstabelecimentoSaude createRequestLocalizarEstabelecimentoSaude() {
        return new RequestLocalizarEstabelecimentoSaude();
    }

    /**
     * Create an instance of {@link FiltroLocalizacaoEstabelecimentoSaudeType }
     * 
     */
    public FiltroLocalizacaoEstabelecimentoSaudeType createFiltroLocalizacaoEstabelecimentoSaudeType() {
        return new FiltroLocalizacaoEstabelecimentoSaudeType();
    }

    /**
     * Create an instance of {@link RequestConsultarPrecadastroCNES }
     * 
     */
    public RequestConsultarPrecadastroCNES createRequestConsultarPrecadastroCNES() {
        return new RequestConsultarPrecadastroCNES();
    }

    /**
     * Create an instance of {@link FiltroPesquisaPrecadastroCnesType }
     * 
     */
    public FiltroPesquisaPrecadastroCnesType createFiltroPesquisaPrecadastroCnesType() {
        return new FiltroPesquisaPrecadastroCnesType();
    }

    /**
     * Create an instance of {@link RequestConsultarEstabelecimentoSaude }
     * 
     */
    public RequestConsultarEstabelecimentoSaude createRequestConsultarEstabelecimentoSaude() {
        return new RequestConsultarEstabelecimentoSaude();
    }

    /**
     * Create an instance of {@link FiltroPesquisaEstabelecimentoSaudeType }
     * 
     */
    public FiltroPesquisaEstabelecimentoSaudeType createFiltroPesquisaEstabelecimentoSaudeType() {
        return new FiltroPesquisaEstabelecimentoSaudeType();
    }

    /**
     * Create an instance of {@link ResponseConsultarPrecadastroCNES }
     * 
     */
    public ResponseConsultarPrecadastroCNES createResponseConsultarPrecadastroCNES() {
        return new ResponseConsultarPrecadastroCNES();
    }

    /**
     * Create an instance of {@link DadosPreCadastroCNESType }
     * 
     */
    public DadosPreCadastroCNESType createDadosPreCadastroCNESType() {
        return new DadosPreCadastroCNESType();
    }

    /**
     * Create an instance of {@link CodigoCNESType }
     * 
     */
    public CodigoCNESType createCodigoCNESType() {
        return new CodigoCNESType();
    }

    /**
     * Create an instance of {@link CNPJType }
     * 
     */
    public CNPJType createCNPJType() {
        return new CNPJType();
    }

    /**
     * Create an instance of {@link TipoUnidadeType }
     * 
     */
    public TipoUnidadeType createTipoUnidadeType() {
        return new TipoUnidadeType();
    }

    /**
     * Create an instance of {@link PaginacaoType }
     * 
     */
    public PaginacaoType createPaginacaoType() {
        return new PaginacaoType();
    }

    /**
     * Create an instance of {@link LocalizacaoType }
     * 
     */
    public LocalizacaoType createLocalizacaoType() {
        return new LocalizacaoType();
    }

    /**
     * Create an instance of {@link CodigoUnidadeType }
     * 
     */
    public CodigoUnidadeType createCodigoUnidadeType() {
        return new CodigoUnidadeType();
    }

    /**
     * Create an instance of {@link NomeJuridicoType }
     * 
     */
    public NomeJuridicoType createNomeJuridicoType() {
        return new NomeJuridicoType();
    }

    /**
     * Create an instance of {@link EnderecoType }
     * 
     */
    public EnderecoType createEnderecoType() {
        return new EnderecoType();
    }

    /**
     * Create an instance of {@link MunicipioType }
     * 
     */
    public MunicipioType createMunicipioType() {
        return new MunicipioType();
    }

    /**
     * Create an instance of {@link UFType }
     * 
     */
    public UFType createUFType() {
        return new UFType();
    }

    /**
     * Create an instance of {@link PaisType }
     * 
     */
    public PaisType createPaisType() {
        return new PaisType();
    }

    /**
     * Create an instance of {@link TipoLogradouroType }
     * 
     */
    public TipoLogradouroType createTipoLogradouroType() {
        return new TipoLogradouroType();
    }

    /**
     * Create an instance of {@link BairroType }
     * 
     */
    public BairroType createBairroType() {
        return new BairroType();
    }

    /**
     * Create an instance of {@link CEPType }
     * 
     */
    public CEPType createCEPType() {
        return new CEPType();
    }

    /**
     * Create an instance of {@link EsferaAdministrativaType }
     * 
     */
    public EsferaAdministrativaType createEsferaAdministrativaType() {
        return new EsferaAdministrativaType();
    }

    /**
     * Create an instance of {@link DiretorType }
     * 
     */
    public DiretorType createDiretorType() {
        return new DiretorType();
    }

    /**
     * Create an instance of {@link CPFType }
     * 
     */
    public CPFType createCPFType() {
        return new CPFType();
    }

    /**
     * Create an instance of {@link NomeCompletoType }
     * 
     */
    public NomeCompletoType createNomeCompletoType() {
        return new NomeCompletoType();
    }

    /**
     * Create an instance of {@link TelefoneType }
     * 
     */
    public TelefoneType createTelefoneType() {
        return new TelefoneType();
    }

    /**
     * Create an instance of {@link TipoTelefoneType }
     * 
     */
    public TipoTelefoneType createTipoTelefoneType() {
        return new TipoTelefoneType();
    }

    /**
     * Create an instance of {@link EmailType }
     * 
     */
    public EmailType createEmailType() {
        return new EmailType();
    }

    /**
     * Create an instance of {@link MSFalha }
     * 
     */
    public MSFalha createMSFalha() {
        return new MSFalha();
    }

    /**
     * Create an instance of {@link MensagemType }
     * 
     */
    public MensagemType createMensagemType() {
        return new MensagemType();
    }

    /**
     * Create an instance of {@link ResultadoLocalizacaoEstabelecimentoSaudeType }
     * 
     */
    public ResultadoLocalizacaoEstabelecimentoSaudeType createResultadoLocalizacaoEstabelecimentoSaudeType() {
        return new ResultadoLocalizacaoEstabelecimentoSaudeType();
    }

    /**
     * Create an instance of {@link NaturezaJuridicaType }
     * 
     */
    public NaturezaJuridicaType createNaturezaJuridicaType() {
        return new NaturezaJuridicaType();
    }

    /**
     * Create an instance of {@link TipoNaturezaJuridicaType }
     * 
     */
    public TipoNaturezaJuridicaType createTipoNaturezaJuridicaType() {
        return new TipoNaturezaJuridicaType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultadoLocalizacaoEstabelecimentoSaudeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/wsdl/mensageria/v1r0/resultadolocalizacaoestabelecimentosaude", name = "ResultadoLocalizacaoEstabelecimentoSaude")
    public JAXBElement<ResultadoLocalizacaoEstabelecimentoSaudeType> createResultadoLocalizacaoEstabelecimentoSaude(ResultadoLocalizacaoEstabelecimentoSaudeType value) {
        return new JAXBElement<ResultadoLocalizacaoEstabelecimentoSaudeType>(_ResultadoLocalizacaoEstabelecimentoSaude_QNAME, ResultadoLocalizacaoEstabelecimentoSaudeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocalizacaoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/schema/cnes/v1r0/localizacao", name = "Localizacao")
    public JAXBElement<LocalizacaoType> createLocalizacao(LocalizacaoType value) {
        return new JAXBElement<LocalizacaoType>(_Localizacao_QNAME, LocalizacaoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DadosGeraisEstabelecimentoSaudeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/schema/cnes/v1r0/dadosgeraiscnes", name = "DadosGeraisEstabelecimentoSaude")
    public JAXBElement<DadosGeraisEstabelecimentoSaudeType> createDadosGeraisEstabelecimentoSaude(DadosGeraisEstabelecimentoSaudeType value) {
        return new JAXBElement<DadosGeraisEstabelecimentoSaudeType>(_DadosGeraisEstabelecimentoSaude_QNAME, DadosGeraisEstabelecimentoSaudeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UFType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/schema/corporativo/v1r1/uf", name = "UF")
    public JAXBElement<UFType> createUF(UFType value) {
        return new JAXBElement<UFType>(_UF_QNAME, UFType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EsferaAdministrativaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/schema/cnes/v1r0/esferaadministrativa", name = "esferaAdministrativa")
    public JAXBElement<EsferaAdministrativaType> createEsferaAdministrativa(EsferaAdministrativaType value) {
        return new JAXBElement<EsferaAdministrativaType>(_EsferaAdministrativa_QNAME, EsferaAdministrativaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TelefoneType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/schema/corporativo/telefone/v1r2/telefone", name = "Telefone")
    public JAXBElement<TelefoneType> createTelefone(TelefoneType value) {
        return new JAXBElement<TelefoneType>(_Telefone_QNAME, TelefoneType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoUnidadeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/schema/cnes/v1r0/tipounidade", name = "tipoUnidade")
    public JAXBElement<TipoUnidadeType> createTipoUnidade(TipoUnidadeType value) {
        return new JAXBElement<TipoUnidadeType>(_TipoUnidade_QNAME, TipoUnidadeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MunicipioType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/schema/corporativo/v1r2/municipio", name = "Municipio")
    public JAXBElement<MunicipioType> createMunicipio(MunicipioType value) {
        return new JAXBElement<MunicipioType>(_Municipio_QNAME, MunicipioType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DadosPreCadastroCNESType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/schema/cnes/v1r0/dadosprecadastrocnes", name = "DadosPreCadastroCNES")
    public JAXBElement<DadosPreCadastroCNESType> createDadosPreCadastroCNES(DadosPreCadastroCNESType value) {
        return new JAXBElement<DadosPreCadastroCNESType>(_DadosPreCadastroCNES_QNAME, DadosPreCadastroCNESType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BairroType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/schema/corporativo/endereco/v1r1/bairro", name = "Bairro")
    public JAXBElement<BairroType> createBairro(BairroType value) {
        return new JAXBElement<BairroType>(_Bairro_QNAME, BairroType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodigoCNESType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/schema/cnes/v1r0/codigocnes", name = "CodigoCNES")
    public JAXBElement<CodigoCNESType> createCodigoCNES(CodigoCNESType value) {
        return new JAXBElement<CodigoCNESType>(_CodigoCNES_QNAME, CodigoCNESType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CPFType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/schema/corporativo/documento/v1r2/cpf", name = "CPF")
    public JAXBElement<CPFType> createCPF(CPFType value) {
        return new JAXBElement<CPFType>(_CPF_QNAME, CPFType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensagemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/wsdl/mensageria/falha/v5r0/mensagem", name = "Mensagem")
    public JAXBElement<MensagemType> createMensagem(MensagemType value) {
        return new JAXBElement<MensagemType>(_Mensagem_QNAME, MensagemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultadosLocalizacaoEstabelecimentoSaudeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/wsdl/mensageria/v1r0/resultadoslocalizacaoestabelecimentosaude", name = "ResultadosLocalizacaoEstabelecimentoSaude")
    public JAXBElement<ResultadosLocalizacaoEstabelecimentoSaudeType> createResultadosLocalizacaoEstabelecimentoSaude(ResultadosLocalizacaoEstabelecimentoSaudeType value) {
        return new JAXBElement<ResultadosLocalizacaoEstabelecimentoSaudeType>(_ResultadosLocalizacaoEstabelecimentoSaude_QNAME, ResultadosLocalizacaoEstabelecimentoSaudeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FiltroLocalizacaoEstabelecimentoSaudeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/wsdl/mensageria/v1r0/filtrolocalizacaoestabelecimentosaude", name = "FiltroLocalizacaoEstabelecimentoSaude")
    public JAXBElement<FiltroLocalizacaoEstabelecimentoSaudeType> createFiltroLocalizacaoEstabelecimentoSaude(FiltroLocalizacaoEstabelecimentoSaudeType value) {
        return new JAXBElement<FiltroLocalizacaoEstabelecimentoSaudeType>(_FiltroLocalizacaoEstabelecimentoSaude_QNAME, FiltroLocalizacaoEstabelecimentoSaudeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CEPType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/schema/corporativo/endereco/v1r1/cep", name = "CEP")
    public JAXBElement<CEPType> createCEP(CEPType value) {
        return new JAXBElement<CEPType>(_CEP_QNAME, CEPType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/schema/corporativo/v1r2/email", name = "Email")
    public JAXBElement<EmailType> createEmail(EmailType value) {
        return new JAXBElement<EmailType>(_Email_QNAME, EmailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoTelefoneType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/schema/corporativo/telefone/v1r1/tipotelefone", name = "TipoTelefone")
    public JAXBElement<TipoTelefoneType> createTipoTelefone(TipoTelefoneType value) {
        return new JAXBElement<TipoTelefoneType>(_TipoTelefone_QNAME, TipoTelefoneType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CNPJType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/schema/corporativo/pessoajuridica/v1r0/cnpj", name = "CNPJ")
    public JAXBElement<CNPJType> createCNPJ(CNPJType value) {
        return new JAXBElement<CNPJType>(_CNPJ_QNAME, CNPJType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnderecoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/schema/corporativo/endereco/v1r2/endereco", name = "Endereco")
    public JAXBElement<EnderecoType> createEndereco(EnderecoType value) {
        return new JAXBElement<EnderecoType>(_Endereco_QNAME, EnderecoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NaturezaJuridicaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/schema/corporativo/pessoajuridica/v1r0/naturezajuridica", name = "NaturezaJuridica")
    public JAXBElement<NaturezaJuridicaType> createNaturezaJuridica(NaturezaJuridicaType value) {
        return new JAXBElement<NaturezaJuridicaType>(_NaturezaJuridica_QNAME, NaturezaJuridicaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NomeJuridicoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/schema/corporativo/pessoajuridica/v1r0/nomejuridico", name = "NomeJuridico")
    public JAXBElement<NomeJuridicoType> createNomeJuridico(NomeJuridicoType value) {
        return new JAXBElement<NomeJuridicoType>(_NomeJuridico_QNAME, NomeJuridicoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaginacaoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/wsdl/mensageria/v1r0/paginacao", name = "Paginacao")
    public JAXBElement<PaginacaoType> createPaginacao(PaginacaoType value) {
        return new JAXBElement<PaginacaoType>(_Paginacao_QNAME, PaginacaoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaisType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/schema/corporativo/v1r2/pais", name = "Pais")
    public JAXBElement<PaisType> createPais(PaisType value) {
        return new JAXBElement<PaisType>(_Pais_QNAME, PaisType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FiltroPesquisaEstabelecimentoSaudeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/wsdl/mensageria/v1r0/filtropesquisaestabelecimentosaude", name = "FiltroPesquisaEstabelecimentoSaude")
    public JAXBElement<FiltroPesquisaEstabelecimentoSaudeType> createFiltroPesquisaEstabelecimentoSaude(FiltroPesquisaEstabelecimentoSaudeType value) {
        return new JAXBElement<FiltroPesquisaEstabelecimentoSaudeType>(_FiltroPesquisaEstabelecimentoSaude_QNAME, FiltroPesquisaEstabelecimentoSaudeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodigoUnidadeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/schema/cnes/v1r0/codigounidade", name = "CodigoUnidade")
    public JAXBElement<CodigoUnidadeType> createCodigoUnidade(CodigoUnidadeType value) {
        return new JAXBElement<CodigoUnidadeType>(_CodigoUnidade_QNAME, CodigoUnidadeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FiltroPesquisaPrecadastroCnesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/wsdl/mensageria/v1r0/filtropesquisaprecadastrocnes", name = "FiltroPesquisaPrecadastroCnes")
    public JAXBElement<FiltroPesquisaPrecadastroCnesType> createFiltroPesquisaPrecadastroCnes(FiltroPesquisaPrecadastroCnesType value) {
        return new JAXBElement<FiltroPesquisaPrecadastroCnesType>(_FiltroPesquisaPrecadastroCnes_QNAME, FiltroPesquisaPrecadastroCnesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoLogradouroType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/schema/corporativo/endereco/v1r1/tipologradouro", name = "TipoLogradouro")
    public JAXBElement<TipoLogradouroType> createTipoLogradouro(TipoLogradouroType value) {
        return new JAXBElement<TipoLogradouroType>(_TipoLogradouro_QNAME, TipoLogradouroType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NomeCompletoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/schema/corporativo/pessoafisica/v1r2/nomecompleto", name = "NomeCompleto")
    public JAXBElement<NomeCompletoType> createNomeCompleto(NomeCompletoType value) {
        return new JAXBElement<NomeCompletoType>(_NomeCompleto_QNAME, NomeCompletoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiretorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/schema/cnes/v1r0/diretor", name = "Diretor")
    public JAXBElement<DiretorType> createDiretor(DiretorType value) {
        return new JAXBElement<DiretorType>(_Diretor_QNAME, DiretorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoNaturezaJuridicaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/schema/corporativo/pessoajuridica/v1r0/tiponaturezajuridica", name = "TipoNaturezaJuridica")
    public JAXBElement<TipoNaturezaJuridicaType> createTipoNaturezaJuridica(TipoNaturezaJuridicaType value) {
        return new JAXBElement<TipoNaturezaJuridicaType>(_TipoNaturezaJuridica_QNAME, TipoNaturezaJuridicaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/wsdl/mensageria/v1r0/filtropesquisaprecadastrocnes", name = "situacao", scope = FiltroPesquisaPrecadastroCnesType.class)
    public JAXBElement<String> createFiltroPesquisaPrecadastroCnesTypeSituacao(String value) {
        return new JAXBElement<String>(_FiltroPesquisaPrecadastroCnesTypeSituacao_QNAME, String.class, FiltroPesquisaPrecadastroCnesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicos.saude.gov.br/wsdl/mensageria/falha/v5r0/msfalha", name = "identificador", scope = MSFalha.class)
    public JAXBElement<String> createMSFalhaIdentificador(String value) {
        return new JAXBElement<String>(_MSFalhaIdentificador_QNAME, String.class, MSFalha.class, value);
    }

}
