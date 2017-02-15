package com.dork.app.react.service;

import com.dork.app.react.model.domain.User;

import java.util.List;

/**
 * Created by mcd on 26.01.2017.
 */

public interface ProfileService {
    List<User> getFriends();
}
