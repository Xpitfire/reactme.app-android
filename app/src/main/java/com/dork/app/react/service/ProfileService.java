package com.dork.app.react.service;

import com.dork.app.react.model.User;
import com.dork.app.react.service.task.PersistenceTask;

/**
 * Created by Xpitfire on 12.03.2017.
 */

public interface ProfileService {
    PersistenceTask<User> Register(User user);
}
