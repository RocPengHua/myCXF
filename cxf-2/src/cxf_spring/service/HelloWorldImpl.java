package cxf_spring.service;

/**
 * Created by pengp on 2017/11/24.
 */
public class HelloWorldImpl implements HelloWorld {
    @Override
    public String say(String name) {
        return "hello," + name;
    }
}
