package com.sun.mdm.index.webservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.11.fuse-710022-redhat-00001
 * 2019-04-24T22:51:15.451-05:00
 * Generated source version: 3.1.11.fuse-710022-redhat-00001
 * 
 */
@WebServiceClient(name = "PersonEJBService", 
                  wsdlLocation = "file:/home/jamezqui/RedhatArgentina2019/ai_advanced_labs/agile_integration_advanced_labs/code/fuse/06_homework-assignment/core/services/integration-test-server/src/main/resources/wsdl/EMPI_18080_2.wsdl",
                  targetNamespace = "http://webservice.index.mdm.sun.com/") 
public class PersonEJBService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://webservice.index.mdm.sun.com/", "PersonEJBService");
    public final static QName PersonEJBPort = new QName("http://webservice.index.mdm.sun.com/", "PersonEJBPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/home/jamezqui/RedhatArgentina2019/ai_advanced_labs/agile_integration_advanced_labs/code/fuse/06_homework-assignment/core/services/integration-test-server/src/main/resources/wsdl/EMPI_18080_2.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(PersonEJBService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/home/jamezqui/RedhatArgentina2019/ai_advanced_labs/agile_integration_advanced_labs/code/fuse/06_homework-assignment/core/services/integration-test-server/src/main/resources/wsdl/EMPI_18080_2.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public PersonEJBService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public PersonEJBService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PersonEJBService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public PersonEJBService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public PersonEJBService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public PersonEJBService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns PersonEJB
     */
    @WebEndpoint(name = "PersonEJBPort")
    public PersonEJB getPersonEJBPort() {
        return super.getPort(PersonEJBPort, PersonEJB.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PersonEJB
     */
    @WebEndpoint(name = "PersonEJBPort")
    public PersonEJB getPersonEJBPort(WebServiceFeature... features) {
        return super.getPort(PersonEJBPort, PersonEJB.class, features);
    }

}
