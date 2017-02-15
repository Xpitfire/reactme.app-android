package com.dork.app.react.service.moc;

import com.dork.app.react.model.domain.User;
import com.dork.app.react.service.ProfileService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mcd on 26.01.2017.
 */

public class ProfileServiceMoc implements ProfileService {
    private static final List<User> _users = new ArrayList<>();

    static {
        // TODO: remove code on productive system
        User user;
        user = new User();
        user.setUsername("Xpitfire");
        user.setEmail("xpitfire@hotmail.com");
        user.setPasswordHash("test");
        user.setStatus(User.UserStatus.Active);
        _users.add(user);
        user = new User();
        user.setUsername("Flow");
        user.setEmail("flow@hotmail.com");
        user.setPasswordHash("test");
        user.setStatus(User.UserStatus.Active);
        _users.add(user);
    }

    @Override
    public List<User> getFriends() {
        return _users;
    }
}
