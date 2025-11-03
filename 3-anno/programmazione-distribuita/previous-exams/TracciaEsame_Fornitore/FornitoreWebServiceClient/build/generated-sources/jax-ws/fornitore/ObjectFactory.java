
package fornitore;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fornitore package. 
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

    private final static QName _TrovaFornitorePerCognomeResponse_QNAME = new QName("http://fornitore/", "trovaFornitorePerCognomeResponse");
    private final static QName _Fornitore_QNAME = new QName("http://fornitore/", "fornitore");
    private final static QName _AggiungiFornitore_QNAME = new QName("http://fornitore/", "aggiungiFornitore");
    private final static QName _AggiornaFornitore_QNAME = new QName("http://fornitore/", "aggiornaFornitore");
    private final static QName _TrovaTuttiFornitoriResponse_QNAME = new QName("http://fornitore/", "trovaTuttiFornitoriResponse");
    private final static QName _AggiungiFornitoreResponse_QNAME = new QName("http://fornitore/", "aggiungiFornitoreResponse");
    private final static QName _TrovaFornitorePerId_QNAME = new QName("http://fornitore/", "trovaFornitorePerId");
    private final static QName _TrovaFornitorePerIdResponse_QNAME = new QName("http://fornitore/", "trovaFornitorePerIdResponse");
    private final static QName _TrovaTuttiFornitori_QNAME = new QName("http://fornitore/", "trovaTuttiFornitori");
    private final static QName _EliminaFornitoreResponse_QNAME = new QName("http://fornitore/", "eliminaFornitoreResponse");
    private final static QName _TrovaFornitorePerCognome_QNAME = new QName("http://fornitore/", "trovaFornitorePerCognome");
    private final static QName _EliminaFornitore_QNAME = new QName("http://fornitore/", "eliminaFornitore");
    private final static QName _AggiornaFornitoreResponse_QNAME = new QName("http://fornitore/", "aggiornaFornitoreResponse");
    private final static QName _TrovaFornitoriPerMaxordine_QNAME = new QName("http://fornitore/", "trovaFornitoriPerMaxordine");
    private final static QName _TrovaFornitoriPerMaxordineResponse_QNAME = new QName("http://fornitore/", "trovaFornitoriPerMaxordineResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fornitore
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AggiungiFornitoreResponse }
     * 
     */
    public AggiungiFornitoreResponse createAggiungiFornitoreResponse() {
        return new AggiungiFornitoreResponse();
    }

    /**
     * Create an instance of {@link TrovaFornitorePerId }
     * 
     */
    public TrovaFornitorePerId createTrovaFornitorePerId() {
        return new TrovaFornitorePerId();
    }

    /**
     * Create an instance of {@link TrovaFornitorePerIdResponse }
     * 
     */
    public TrovaFornitorePerIdResponse createTrovaFornitorePerIdResponse() {
        return new TrovaFornitorePerIdResponse();
    }

    /**
     * Create an instance of {@link TrovaTuttiFornitori }
     * 
     */
    public TrovaTuttiFornitori createTrovaTuttiFornitori() {
        return new TrovaTuttiFornitori();
    }

    /**
     * Create an instance of {@link EliminaFornitoreResponse }
     * 
     */
    public EliminaFornitoreResponse createEliminaFornitoreResponse() {
        return new EliminaFornitoreResponse();
    }

    /**
     * Create an instance of {@link TrovaFornitorePerCognome }
     * 
     */
    public TrovaFornitorePerCognome createTrovaFornitorePerCognome() {
        return new TrovaFornitorePerCognome();
    }

    /**
     * Create an instance of {@link EliminaFornitore }
     * 
     */
    public EliminaFornitore createEliminaFornitore() {
        return new EliminaFornitore();
    }

    /**
     * Create an instance of {@link AggiornaFornitoreResponse }
     * 
     */
    public AggiornaFornitoreResponse createAggiornaFornitoreResponse() {
        return new AggiornaFornitoreResponse();
    }

    /**
     * Create an instance of {@link TrovaFornitoriPerMaxordine }
     * 
     */
    public TrovaFornitoriPerMaxordine createTrovaFornitoriPerMaxordine() {
        return new TrovaFornitoriPerMaxordine();
    }

    /**
     * Create an instance of {@link TrovaFornitoriPerMaxordineResponse }
     * 
     */
    public TrovaFornitoriPerMaxordineResponse createTrovaFornitoriPerMaxordineResponse() {
        return new TrovaFornitoriPerMaxordineResponse();
    }

    /**
     * Create an instance of {@link TrovaFornitorePerCognomeResponse }
     * 
     */
    public TrovaFornitorePerCognomeResponse createTrovaFornitorePerCognomeResponse() {
        return new TrovaFornitorePerCognomeResponse();
    }

    /**
     * Create an instance of {@link Fornitore }
     * 
     */
    public Fornitore createFornitore() {
        return new Fornitore();
    }

    /**
     * Create an instance of {@link AggiungiFornitore }
     * 
     */
    public AggiungiFornitore createAggiungiFornitore() {
        return new AggiungiFornitore();
    }

    /**
     * Create an instance of {@link AggiornaFornitore }
     * 
     */
    public AggiornaFornitore createAggiornaFornitore() {
        return new AggiornaFornitore();
    }

    /**
     * Create an instance of {@link TrovaTuttiFornitoriResponse }
     * 
     */
    public TrovaTuttiFornitoriResponse createTrovaTuttiFornitoriResponse() {
        return new TrovaTuttiFornitoriResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrovaFornitorePerCognomeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fornitore/", name = "trovaFornitorePerCognomeResponse")
    public JAXBElement<TrovaFornitorePerCognomeResponse> createTrovaFornitorePerCognomeResponse(TrovaFornitorePerCognomeResponse value) {
        return new JAXBElement<TrovaFornitorePerCognomeResponse>(_TrovaFornitorePerCognomeResponse_QNAME, TrovaFornitorePerCognomeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Fornitore }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fornitore/", name = "fornitore")
    public JAXBElement<Fornitore> createFornitore(Fornitore value) {
        return new JAXBElement<Fornitore>(_Fornitore_QNAME, Fornitore.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AggiungiFornitore }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fornitore/", name = "aggiungiFornitore")
    public JAXBElement<AggiungiFornitore> createAggiungiFornitore(AggiungiFornitore value) {
        return new JAXBElement<AggiungiFornitore>(_AggiungiFornitore_QNAME, AggiungiFornitore.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AggiornaFornitore }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fornitore/", name = "aggiornaFornitore")
    public JAXBElement<AggiornaFornitore> createAggiornaFornitore(AggiornaFornitore value) {
        return new JAXBElement<AggiornaFornitore>(_AggiornaFornitore_QNAME, AggiornaFornitore.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrovaTuttiFornitoriResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fornitore/", name = "trovaTuttiFornitoriResponse")
    public JAXBElement<TrovaTuttiFornitoriResponse> createTrovaTuttiFornitoriResponse(TrovaTuttiFornitoriResponse value) {
        return new JAXBElement<TrovaTuttiFornitoriResponse>(_TrovaTuttiFornitoriResponse_QNAME, TrovaTuttiFornitoriResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AggiungiFornitoreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fornitore/", name = "aggiungiFornitoreResponse")
    public JAXBElement<AggiungiFornitoreResponse> createAggiungiFornitoreResponse(AggiungiFornitoreResponse value) {
        return new JAXBElement<AggiungiFornitoreResponse>(_AggiungiFornitoreResponse_QNAME, AggiungiFornitoreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrovaFornitorePerId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fornitore/", name = "trovaFornitorePerId")
    public JAXBElement<TrovaFornitorePerId> createTrovaFornitorePerId(TrovaFornitorePerId value) {
        return new JAXBElement<TrovaFornitorePerId>(_TrovaFornitorePerId_QNAME, TrovaFornitorePerId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrovaFornitorePerIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fornitore/", name = "trovaFornitorePerIdResponse")
    public JAXBElement<TrovaFornitorePerIdResponse> createTrovaFornitorePerIdResponse(TrovaFornitorePerIdResponse value) {
        return new JAXBElement<TrovaFornitorePerIdResponse>(_TrovaFornitorePerIdResponse_QNAME, TrovaFornitorePerIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrovaTuttiFornitori }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fornitore/", name = "trovaTuttiFornitori")
    public JAXBElement<TrovaTuttiFornitori> createTrovaTuttiFornitori(TrovaTuttiFornitori value) {
        return new JAXBElement<TrovaTuttiFornitori>(_TrovaTuttiFornitori_QNAME, TrovaTuttiFornitori.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminaFornitoreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fornitore/", name = "eliminaFornitoreResponse")
    public JAXBElement<EliminaFornitoreResponse> createEliminaFornitoreResponse(EliminaFornitoreResponse value) {
        return new JAXBElement<EliminaFornitoreResponse>(_EliminaFornitoreResponse_QNAME, EliminaFornitoreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrovaFornitorePerCognome }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fornitore/", name = "trovaFornitorePerCognome")
    public JAXBElement<TrovaFornitorePerCognome> createTrovaFornitorePerCognome(TrovaFornitorePerCognome value) {
        return new JAXBElement<TrovaFornitorePerCognome>(_TrovaFornitorePerCognome_QNAME, TrovaFornitorePerCognome.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminaFornitore }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fornitore/", name = "eliminaFornitore")
    public JAXBElement<EliminaFornitore> createEliminaFornitore(EliminaFornitore value) {
        return new JAXBElement<EliminaFornitore>(_EliminaFornitore_QNAME, EliminaFornitore.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AggiornaFornitoreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fornitore/", name = "aggiornaFornitoreResponse")
    public JAXBElement<AggiornaFornitoreResponse> createAggiornaFornitoreResponse(AggiornaFornitoreResponse value) {
        return new JAXBElement<AggiornaFornitoreResponse>(_AggiornaFornitoreResponse_QNAME, AggiornaFornitoreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrovaFornitoriPerMaxordine }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fornitore/", name = "trovaFornitoriPerMaxordine")
    public JAXBElement<TrovaFornitoriPerMaxordine> createTrovaFornitoriPerMaxordine(TrovaFornitoriPerMaxordine value) {
        return new JAXBElement<TrovaFornitoriPerMaxordine>(_TrovaFornitoriPerMaxordine_QNAME, TrovaFornitoriPerMaxordine.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrovaFornitoriPerMaxordineResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fornitore/", name = "trovaFornitoriPerMaxordineResponse")
    public JAXBElement<TrovaFornitoriPerMaxordineResponse> createTrovaFornitoriPerMaxordineResponse(TrovaFornitoriPerMaxordineResponse value) {
        return new JAXBElement<TrovaFornitoriPerMaxordineResponse>(_TrovaFornitoriPerMaxordineResponse_QNAME, TrovaFornitoriPerMaxordineResponse.class, null, value);
    }

}
