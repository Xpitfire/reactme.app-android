package com.dork.app.react.model;

import java.util.List;

/**
 * Created by Xpitfire on 12.03.2017.
 */

public final class Profile extends EntityBase {

    private String firstName;
    private String lastName;
    private Content image;
    private List<String> friendIds;
    private InvitationStatus invitationStatus = InvitationStatus.NATIVE_APP_USER;
    private ContactInfo contactInfo;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Content getImage() {
        return image;
    }

    public void setImage(Content image) {
        this.image = image;
    }

    public List<String> getFriendIds() {
        return friendIds;
    }

    public void setFriendIds(List<String> friendIds) {
        this.friendIds = friendIds;
    }

    public InvitationStatus getInvitationStatus() {
        return invitationStatus;
    }

    public void setInvitationStatus(InvitationStatus invitationStatus) {
        this.invitationStatus = invitationStatus;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }
}
