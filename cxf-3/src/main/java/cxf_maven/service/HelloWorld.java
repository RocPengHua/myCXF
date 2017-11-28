package cxf_maven.service;

import javax.jws.WebService;

/**
 * Created by pengp on 2017/11/27.
 */
@WebService
public class HelloWorld implements IHelloWorld {

    @Override
    public String say(String name) {
        return "hello," + name;
    }
}
