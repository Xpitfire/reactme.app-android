package com.dork.app.react.service;

import android.os.AsyncTask;

import com.dork.app.react.model.User;

/**
 * Created by Xpitfire on 12.03.2017.
 */

public interface ProfileService {

    AsyncTask<User, Void, User> Register(User user);

}
