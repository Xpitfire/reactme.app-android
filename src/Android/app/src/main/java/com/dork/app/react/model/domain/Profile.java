package com.dork.app.react.model.domain;

import java.util.List;

/**
 * Created by mcd on 26.01.2017.
 */

public class Profile extends EntityBase {

    public enum InvitationStatus {
        NATIVE_APP_USER,
        INVITED_BY_EMAIL,
        INVITED_BY_SMS,
        INVITED_BY_WHATSAPP,
        INVITED_BY_FACEBOOK,
        INVITED_BY_GOOGLEPLUS
    }

    private String firstName;
    private String lastName;
    private ContentBase image;
    private List<User> friends;
    private List<InvitationStatus> InvitationOptions;
    private ContactInfo contactInfo;

}
