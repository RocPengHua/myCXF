package cxf_spring.service;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by pengp on 2017/11/24.
 */
@WebService
public interface HelloWorld {
    public String say(@WebParam(name = "name") String name);
}
