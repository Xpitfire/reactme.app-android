package com.dork.app.react.service.moc;

import com.dork.app.react.api.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Xpitfire on 26.02.2017.
 */

public class UserMoc {

    public static List<User> USERS = new ArrayList<>();

    static {
        User user;

        user = new User();
        user.email("florian@wurm.com");
        user.username("flow");
        USERS.add(user);

        user = new User();
        user.email("franz@sisi.com");
        user.username("franz");
        USERS.add(user);

        user = new User();
        user.email("dork@dork.com");
        user.username("dork");
        USERS.add(user);

        user = new User();
        user.email("ran@tastic.com");
        user.username("rantastic");
        USERS.add(user);

        user = new User();
        user.email("test@test.com");
        user.username("test");
        USERS.add(user);
    }

}
