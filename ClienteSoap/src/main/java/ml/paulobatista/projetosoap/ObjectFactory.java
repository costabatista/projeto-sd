
package ml.paulobatista.projetosoap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ml.paulobatista.projetosoap package. 
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

    private final static QName _Edit_QNAME = new QName("http://projetosoap.paulobatista.ml/", "edit");
    private final static QName _CreateEntidadeResponse_QNAME = new QName("http://projetosoap.paulobatista.ml/", "createEntidadeResponse");
    private final static QName _FindRange_QNAME = new QName("http://projetosoap.paulobatista.ml/", "findRange");
    private final static QName _CountRESTResponse_QNAME = new QName("http://projetosoap.paulobatista.ml/", "countRESTResponse");
    private final static QName _RemoveResponse_QNAME = new QName("http://projetosoap.paulobatista.ml/", "removeResponse");
    private final static QName _FindResponse_QNAME = new QName("http://projetosoap.paulobatista.ml/", "findResponse");
    private final static QName _FindAll_QNAME = new QName("http://projetosoap.paulobatista.ml/", "findAll");
    private final static QName _Remove_QNAME = new QName("http://projetosoap.paulobatista.ml/", "remove");
    private final static QName _CreateEntidade_QNAME = new QName("http://projetosoap.paulobatista.ml/", "createEntidade");
    private final static QName _FindRangeResponse_QNAME = new QName("http://projetosoap.paulobatista.ml/", "findRangeResponse");
    private final static QName _CountREST_QNAME = new QName("http://projetosoap.paulobatista.ml/", "countREST");
    private final static QName _EditResponse_QNAME = new QName("http://projetosoap.paulobatista.ml/", "editResponse");
    private final static QName _Find_QNAME = new QName("http://projetosoap.paulobatista.ml/", "find");
    private final static QName _FindAllResponse_QNAME = new QName("http://projetosoap.paulobatista.ml/", "findAllResponse");
    private final static QName _Nota_QNAME = new QName("http://projetosoap.paulobatista.ml/", "nota");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ml.paulobatista.projetosoap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Edit }
     * 
     */
    public Edit createEdit() {
        return new Edit();
    }

    /**
     * Create an instance of {@link CreateEntidadeResponse }
     * 
     */
    public CreateEntidadeResponse createCreateEntidadeResponse() {
        return new CreateEntidadeResponse();
    }

    /**
     * Create an instance of {@link FindRange }
     * 
     */
    public FindRange createFindRange() {
        return new FindRange();
    }

    /**
     * Create an instance of {@link CountRESTResponse }
     * 
     */
    public CountRESTResponse createCountRESTResponse() {
        return new CountRESTResponse();
    }

    /**
     * Create an instance of {@link RemoveResponse }
     * 
     */
    public RemoveResponse createRemoveResponse() {
        return new RemoveResponse();
    }

    /**
     * Create an instance of {@link FindResponse }
     * 
     */
    public FindResponse createFindResponse() {
        return new FindResponse();
    }

    /**
     * Create an instance of {@link FindAll }
     * 
     */
    public FindAll createFindAll() {
        return new FindAll();
    }

    /**
     * Create an instance of {@link Remove }
     * 
     */
    public Remove createRemove() {
        return new Remove();
    }

    /**
     * Create an instance of {@link CreateEntidade }
     * 
     */
    public CreateEntidade createCreateEntidade() {
        return new CreateEntidade();
    }

    /**
     * Create an instance of {@link FindRangeResponse }
     * 
     */
    public FindRangeResponse createFindRangeResponse() {
        return new FindRangeResponse();
    }

    /**
     * Create an instance of {@link CountREST }
     * 
     */
    public CountREST createCountREST() {
        return new CountREST();
    }

    /**
     * Create an instance of {@link EditResponse }
     * 
     */
    public EditResponse createEditResponse() {
        return new EditResponse();
    }

    /**
     * Create an instance of {@link Find }
     * 
     */
    public Find createFind() {
        return new Find();
    }

    /**
     * Create an instance of {@link FindAllResponse }
     * 
     */
    public FindAllResponse createFindAllResponse() {
        return new FindAllResponse();
    }

    /**
     * Create an instance of {@link Nota }
     * 
     */
    public Nota createNota() {
        return new Nota();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Edit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://projetosoap.paulobatista.ml/", name = "edit")
    public JAXBElement<Edit> createEdit(Edit value) {
        return new JAXBElement<Edit>(_Edit_QNAME, Edit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateEntidadeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://projetosoap.paulobatista.ml/", name = "createEntidadeResponse")
    public JAXBElement<CreateEntidadeResponse> createCreateEntidadeResponse(CreateEntidadeResponse value) {
        return new JAXBElement<CreateEntidadeResponse>(_CreateEntidadeResponse_QNAME, CreateEntidadeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindRange }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://projetosoap.paulobatista.ml/", name = "findRange")
    public JAXBElement<FindRange> createFindRange(FindRange value) {
        return new JAXBElement<FindRange>(_FindRange_QNAME, FindRange.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountRESTResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://projetosoap.paulobatista.ml/", name = "countRESTResponse")
    public JAXBElement<CountRESTResponse> createCountRESTResponse(CountRESTResponse value) {
        return new JAXBElement<CountRESTResponse>(_CountRESTResponse_QNAME, CountRESTResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://projetosoap.paulobatista.ml/", name = "removeResponse")
    public JAXBElement<RemoveResponse> createRemoveResponse(RemoveResponse value) {
        return new JAXBElement<RemoveResponse>(_RemoveResponse_QNAME, RemoveResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://projetosoap.paulobatista.ml/", name = "findResponse")
    public JAXBElement<FindResponse> createFindResponse(FindResponse value) {
        return new JAXBElement<FindResponse>(_FindResponse_QNAME, FindResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://projetosoap.paulobatista.ml/", name = "findAll")
    public JAXBElement<FindAll> createFindAll(FindAll value) {
        return new JAXBElement<FindAll>(_FindAll_QNAME, FindAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Remove }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://projetosoap.paulobatista.ml/", name = "remove")
    public JAXBElement<Remove> createRemove(Remove value) {
        return new JAXBElement<Remove>(_Remove_QNAME, Remove.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateEntidade }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://projetosoap.paulobatista.ml/", name = "createEntidade")
    public JAXBElement<CreateEntidade> createCreateEntidade(CreateEntidade value) {
        return new JAXBElement<CreateEntidade>(_CreateEntidade_QNAME, CreateEntidade.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindRangeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://projetosoap.paulobatista.ml/", name = "findRangeResponse")
    public JAXBElement<FindRangeResponse> createFindRangeResponse(FindRangeResponse value) {
        return new JAXBElement<FindRangeResponse>(_FindRangeResponse_QNAME, FindRangeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountREST }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://projetosoap.paulobatista.ml/", name = "countREST")
    public JAXBElement<CountREST> createCountREST(CountREST value) {
        return new JAXBElement<CountREST>(_CountREST_QNAME, CountREST.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://projetosoap.paulobatista.ml/", name = "editResponse")
    public JAXBElement<EditResponse> createEditResponse(EditResponse value) {
        return new JAXBElement<EditResponse>(_EditResponse_QNAME, EditResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Find }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://projetosoap.paulobatista.ml/", name = "find")
    public JAXBElement<Find> createFind(Find value) {
        return new JAXBElement<Find>(_Find_QNAME, Find.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://projetosoap.paulobatista.ml/", name = "findAllResponse")
    public JAXBElement<FindAllResponse> createFindAllResponse(FindAllResponse value) {
        return new JAXBElement<FindAllResponse>(_FindAllResponse_QNAME, FindAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Nota }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://projetosoap.paulobatista.ml/", name = "nota")
    public JAXBElement<Nota> createNota(Nota value) {
        return new JAXBElement<Nota>(_Nota_QNAME, Nota.class, null, value);
    }

}
