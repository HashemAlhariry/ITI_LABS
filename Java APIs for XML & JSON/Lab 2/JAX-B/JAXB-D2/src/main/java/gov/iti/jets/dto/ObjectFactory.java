//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.07 at 12:50:54 PM EET
//


package gov.iti.jets.dto;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;

import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the gov.iti.jets.dto package.
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

    private final static QName _BOOKSTORE_QNAME = new QName("http://jets.iti.gov/schemas/person", "bookstore");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gov.iti.jets.dto
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BookStore }
     *
     */
    public BookStore createBookStoreType() {
        return new BookStore();
    }

    /**
     * Create an instance of {@link BookType }
     *
     */
    public BookType createBookType() {
        return new BookType();
    }

    /**
     * Create an instance of {@link AddressType }
     *
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link PersonType }
     *
     */
    public PersonType createPersonType() {
        return new PersonType();
    }

    @XmlElementDecl(namespace = "http://jets.iti.gov/schemas/person", name = "bookstore")
    public JAXBElement<BookStore> createBookStore(BookStore value) {
        return new JAXBElement<BookStore>(_BOOKSTORE_QNAME, BookStore.class, null, value);
    }

}