
package ml.paulobatista.projetosoap;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "NotaDBService", targetNamespace = "http://projetosoap.paulobatista.ml/", wsdlLocation = "http://localhost:8080/ProjetoSoap/NotaDBService?WSDL")
public class NotaDBService
    extends Service
{

    private final static URL NOTADBSERVICE_WSDL_LOCATION;
    private final static WebServiceException NOTADBSERVICE_EXCEPTION;
    private final static QName NOTADBSERVICE_QNAME = new QName("http://projetosoap.paulobatista.ml/", "NotaDBService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/ProjetoSoap/NotaDBService?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        NOTADBSERVICE_WSDL_LOCATION = url;
        NOTADBSERVICE_EXCEPTION = e;
    }

    public NotaDBService() {
        super(__getWsdlLocation(), NOTADBSERVICE_QNAME);
    }

    public NotaDBService(WebServiceFeature... features) {
        super(__getWsdlLocation(), NOTADBSERVICE_QNAME, features);
    }

    public NotaDBService(URL wsdlLocation) {
        super(wsdlLocation, NOTADBSERVICE_QNAME);
    }

    public NotaDBService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, NOTADBSERVICE_QNAME, features);
    }

    public NotaDBService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public NotaDBService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns NotaDB
     */
    @WebEndpoint(name = "NotaDBPort")
    public NotaDB getNotaDBPort() {
        return super.getPort(new QName("http://projetosoap.paulobatista.ml/", "NotaDBPort"), NotaDB.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns NotaDB
     */
    @WebEndpoint(name = "NotaDBPort")
    public NotaDB getNotaDBPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://projetosoap.paulobatista.ml/", "NotaDBPort"), NotaDB.class, features);
    }

    private static URL __getWsdlLocation() {
        if (NOTADBSERVICE_EXCEPTION!= null) {
            throw NOTADBSERVICE_EXCEPTION;
        }
        return NOTADBSERVICE_WSDL_LOCATION;
    }

}
