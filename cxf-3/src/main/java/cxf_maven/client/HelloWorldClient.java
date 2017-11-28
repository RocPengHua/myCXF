package cxf_maven.client;

import cxf_maven.service.IHelloWorld;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by pengp on 2017/11/27.
 */
public class HelloWorldClient {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext((new String[]{"client-bean.xml"}));
        IHelloWorld client = (IHelloWorld) context.getBean("client");
        String response = client.say("world");
        System.out.println("response:" + response);
        System.exit(0);
    }
}
