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
        user.username = "florian@wurm.com";
        USERS.add(user);

        user = new User();
        user.username = "franz@sisi.com";
        USERS.add(user);

        user = new User();
        user.username = "dork@dork.com";
        USERS.add(user);

        user = new User();
        user.username = "ran@tastic.com";
        USERS.add(user);

        user = new User();
        user.username = "test@test.com";
        USERS.add(user);

        ActMessage actMessage;

        actMessage = new ActMessage();
        actMessage.description = "Nice pics man!";
        ACT_MESSAGES.add(actMessage);

    }

}
