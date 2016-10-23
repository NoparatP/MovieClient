
package moive;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the moive package. 
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

    private final static QName _Hello_QNAME = new QName("http://Moive/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://Moive/", "helloResponse");
    private final static QName _Movie_QNAME = new QName("http://Moive/", "movie");
    private final static QName _MovieResponse_QNAME = new QName("http://Moive/", "movieResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: moive
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Movie_Type }
     * 
     */
    public Movie_Type createMovie_Type() {
        return new Movie_Type();
    }

    /**
     * Create an instance of {@link MovieResponse }
     * 
     */
    public MovieResponse createMovieResponse() {
        return new MovieResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Moive/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Moive/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Movie_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Moive/", name = "movie")
    public JAXBElement<Movie_Type> createMovie(Movie_Type value) {
        return new JAXBElement<Movie_Type>(_Movie_QNAME, Movie_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MovieResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Moive/", name = "movieResponse")
    public JAXBElement<MovieResponse> createMovieResponse(MovieResponse value) {
        return new JAXBElement<MovieResponse>(_MovieResponse_QNAME, MovieResponse.class, null, value);
    }

}
