
package moive;

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
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "Movie", targetNamespace = "http://Moive/", wsdlLocation = "http://localhost:8080/MovieServer/Movie?wsdl")
public class Movie_Service
    extends Service
{

    private final static URL MOVIE_WSDL_LOCATION;
    private final static WebServiceException MOVIE_EXCEPTION;
    private final static QName MOVIE_QNAME = new QName("http://Moive/", "Movie");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/MovieServer/Movie?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MOVIE_WSDL_LOCATION = url;
        MOVIE_EXCEPTION = e;
    }

    public Movie_Service() {
        super(__getWsdlLocation(), MOVIE_QNAME);
    }

    public Movie_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), MOVIE_QNAME, features);
    }

    public Movie_Service(URL wsdlLocation) {
        super(wsdlLocation, MOVIE_QNAME);
    }

    public Movie_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MOVIE_QNAME, features);
    }

    public Movie_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Movie_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Movie
     */
    @WebEndpoint(name = "MoviePort")
    public Movie getMoviePort() {
        return super.getPort(new QName("http://Moive/", "MoviePort"), Movie.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Movie
     */
    @WebEndpoint(name = "MoviePort")
    public Movie getMoviePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://Moive/", "MoviePort"), Movie.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MOVIE_EXCEPTION!= null) {
            throw MOVIE_EXCEPTION;
        }
        return MOVIE_WSDL_LOCATION;
    }

}