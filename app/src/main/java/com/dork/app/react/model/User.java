package com.dork.app.react.model;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by Xpitfire on 12.03.2017.
 */

@IgnoreExtraProperties
public final class User extends EntityBase {

    public String username;
    public String email;
    public Profile profile;
    public UserStatus status = UserStatus.INACTIVE;

}
