package cxfEasy.service;

import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

/**
 * Created by Administrator on 2017/11/24.
 */
@WebService
public interface HelloWorld {
    String sayHi(@WebParam(name = "text") String text);

    String sayHiToUser(User user);

    String[] SayHiToUserList(List<User> userList);
}
