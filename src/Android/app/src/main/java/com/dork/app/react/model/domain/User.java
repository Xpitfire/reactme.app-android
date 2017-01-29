package com.dork.app.react.model.domain;

/**
 * Created by mcd on 23.01.2017.
 */

public class User extends EntityBase {

    public enum UserStatus {
        Active,
        DEACTIVATED,
        DELETED,
        BLOCKED
    }

    private String username;
    private String email;
    private String passwordHash;
    private Profile profile;
    private UserStatus status;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public UserStatus getStatus() {
        return status;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return username.equals(user.username);

    }

    @Override
    public int hashCode() {
        return username.hashCode();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("id='").append(id).append('\'');
        sb.append(", username='").append(username).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", passwordHash='").append(passwordHash).append('\'');
        sb.append(", profile=").append(profile);
        sb.append(", status=").append(status);
        sb.append('}');
        return sb.toString();
    }
}
