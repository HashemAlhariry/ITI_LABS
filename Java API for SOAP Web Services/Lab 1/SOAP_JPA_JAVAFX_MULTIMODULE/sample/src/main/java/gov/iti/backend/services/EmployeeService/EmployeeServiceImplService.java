
package gov.iti.backend.services.EmployeeService;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.0-M2
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "EmployeeServiceImplService", targetNamespace = "http://impl.services.backend.iti.gov/", wsdlLocation = "http://localhost:9090/soapwithjpa/ws/testing?wsdl")
public class EmployeeServiceImplService
    extends Service
{

    private final static URL EMPLOYEESERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException EMPLOYEESERVICEIMPLSERVICE_EXCEPTION;
    private final static QName EMPLOYEESERVICEIMPLSERVICE_QNAME = new QName("http://impl.services.backend.iti.gov/", "EmployeeServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:9090/soapwithjpa/ws/testing?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        EMPLOYEESERVICEIMPLSERVICE_WSDL_LOCATION = url;
        EMPLOYEESERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public EmployeeServiceImplService() {
        super(__getWsdlLocation(), EMPLOYEESERVICEIMPLSERVICE_QNAME);
    }

    public EmployeeServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), EMPLOYEESERVICEIMPLSERVICE_QNAME, features);
    }

    public EmployeeServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, EMPLOYEESERVICEIMPLSERVICE_QNAME);
    }

    public EmployeeServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, EMPLOYEESERVICEIMPLSERVICE_QNAME, features);
    }

    public EmployeeServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EmployeeServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns EmployeeService
     */
    @WebEndpoint(name = "EmployeeServiceImplPort")
    public EmployeeService getEmployeeServiceImplPort() {
        return super.getPort(new QName("http://impl.services.backend.iti.gov/", "EmployeeServiceImplPort"), EmployeeService.class);
    }

    /**
     * 
     * @param features
     *     A list of {&#064;link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the &lt;code&gt;features&lt;/code&gt; parameter will have their default values.
     * @return
     *     returns EmployeeService
     */
    @WebEndpoint(name = "EmployeeServiceImplPort")
    public EmployeeService getEmployeeServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://impl.services.backend.iti.gov/", "EmployeeServiceImplPort"), EmployeeService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (EMPLOYEESERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw EMPLOYEESERVICEIMPLSERVICE_EXCEPTION;
        }
        return EMPLOYEESERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
