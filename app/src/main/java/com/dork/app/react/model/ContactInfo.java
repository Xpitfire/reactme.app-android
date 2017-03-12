package com.dork.app.react.model;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by Xpitfire on 12.03.2017.
 */

@IgnoreExtraProperties
public final class ContactInfo extends EntityBase {

    public String facebookAccountToken;
    public String googlePlusAccountToken;
    public String phoneNumber;
    public String email;

}
