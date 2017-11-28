package cxf_maven.service;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by pengp on 2017/11/27.
 */
@WebService
public interface IHelloWorld {
    public String say(@WebParam(name = "name") String name);
}
