package com.dork.app.react.service.moc;

import com.dork.app.react.model.ActMessage;
import com.dork.app.react.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Xpitfire on 26.02.2017.
 */

public class MocService {

    public static final List<ActMessage> ACT_MESSAGES = new ArrayList<>();
    public static final List<User> USERS = new ArrayList<>();

    static {
        User user;

        user = new User();
        user.setEmail("florian@wurm.com");
        user.setUsername("flow");
        USERS.add(user);

        user = new User();
        user.setEmail("franz@sisi.com");
        user.setUsername("franz");
        USERS.add(user);

        user = new User();
        user.setEmail("dork@dork.com");
        user.setUsername("dork");
        USERS.add(user);

        user = new User();
        user.setEmail("ran@tastic.com");
        user.setUsername("rantastic");
        USERS.add(user);

        user = new User();
        user.setEmail("test@test.com");
        user.setUsername("test");
        USERS.add(user);

        ActMessage actMessage;

        actMessage = new ActMessage();
        actMessage.setDescription("Nice pics man!");
        ACT_MESSAGES.add(actMessage);

    }

}
