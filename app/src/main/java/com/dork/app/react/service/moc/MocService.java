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
        user.setUsername("florian@wurm.com");
        USERS.add(user);

        user = new User();
        user.setUsername("franz@sisi.com");
        USERS.add(user);

        user = new User();
        user.setUsername("dork@dork.com");
        USERS.add(user);

        user = new User();
        user.setUsername("ran@tastic.com");
        USERS.add(user);

        user = new User();
        user.setUsername("test@test.com");
        USERS.add(user);

        ActMessage actMessage;

        actMessage = new ActMessage();
        actMessage.setDescription("Nice pics man!");
        ACT_MESSAGES.add(actMessage);

    }

}
