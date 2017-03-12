package com.dork.app.react.model;

import com.google.firebase.database.IgnoreExtraProperties;

import java.util.List;

/**
 * Created by Xpitfire on 12.03.2017.
 */

@IgnoreExtraProperties
public final class Profile {

    public String firstName;
    public String lastName;
    public Content image;
    public List<String> friendIds;
    public InvitationStatus invitationStatus = InvitationStatus.NATIVE_APP_USER;
    public ContactInfo contactInfo;

}
