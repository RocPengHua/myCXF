package cxfEasy.service;

import javax.jws.WebService;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/11/24.
 */
@WebService(endpointInterface = "cxfEasy.service.HelloWorld", serviceName = "HelloWorldImpl")
public class HelloWorldImpl implements HelloWorld {
    Map<Integer, User> users = new LinkedHashMap<Integer, User>();

    @Override
    public String sayHi(String text) {
        return "Hello," + text;
    }

    @Override
    public String sayHiToUser(User user) {
        users.put(users.size() + 1, user);
        return "Hello," + user.getName();
    }

    @Override
    public String[] SayHiToUserList(List<User> userList) {
        String[] result = new String[userList.size()];
        Integer i = 0;
        for (User u : userList) {
            result[i] = "Hello" + u.getName();
            i++;
        }
        return result;
    }

}
