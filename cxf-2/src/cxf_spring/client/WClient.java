package cxf_spring.client;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

/**
 * Created by pengp on 2017/11/24.
 */
public class WClient {
    public static void main(String[] args) throws Exception {
        JaxWsDynamicClientFactory clientFactory = JaxWsDynamicClientFactory.newInstance();
        Client client = clientFactory.createClient("http://localhost/cxf_spring/service/HelloWorld?wsdl");
        String param = "World";
        Object[] result = client.invoke("say", param);
        System.out.println(result[0]);
    }
}
