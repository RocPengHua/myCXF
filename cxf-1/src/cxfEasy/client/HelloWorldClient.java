package cxfEasy.client;

import cxfEasy.service.HelloWorld;
import cxfEasy.service.User;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/11/24.
 */
public class HelloWorldClient {
    public static void main(String[] args) {
        JaxWsProxyFactoryBean jwpfb = new JaxWsProxyFactoryBean();
        jwpfb.setServiceClass(HelloWorld.class);
        jwpfb.setAddress("http://172.19.3.93:8080/ws/service/HelloWorld");
        HelloWorld hw = (HelloWorld) jwpfb.create();
        User user = new User();
        user.setName(new Scanner(System.in).nextLine());
        System.out.println(hw.sayHiToUser(user));
    }
}
