package com.dork.app.react.model;

/**
 * Created by Xpitfire on 12.03.2017.
 */

public final class ContactInfo extends EntityBase {

    private String facebookAccountToken;
    private String googlePlusAccountToken;
    private String phoneNumber;
    private String email;

    public String getFacebookAccountToken() {
        return facebookAccountToken;
    }

    public void setFacebookAccountToken(String facebookAccountToken) {
        this.facebookAccountToken = facebookAccountToken;
    }

    public String getGooglePlusAccountToken() {
        return googlePlusAccountToken;
    }

    public void setGooglePlusAccountToken(String googlePlusAccountToken) {
        this.googlePlusAccountToken = googlePlusAccountToken;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
