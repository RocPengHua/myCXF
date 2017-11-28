package cxfEasy.service;


import javax.xml.ws.Endpoint;

/**
 * Created by Administrator on 2017/11/24.
 */
public class WebServiceApp {
    public static void main(String[] args) {
        System.out.println("web service start");
        HelloWorldImpl implementor = new HelloWorldImpl();
        String address = "http://172.19.3.93:8080/ws/service/HelloWorld";
        Endpoint.publish(address, implementor);
        System.out.println("web service started");
    }
}
