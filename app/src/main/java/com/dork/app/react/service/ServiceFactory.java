package com.dork.app.react.service;

import com.dork.app.react.service.firebase.FirebaseMessageService;
import com.dork.app.react.service.firebase.FirebaseProfileService;

/**
 * Created by Xpitfire on 13.03.2017.
 */

public final class ServiceFactory {

    public static ProfileService getProfileService() {
        return new FirebaseProfileService();
    }
    public static MessageService getMessageService() {
        return new FirebaseMessageService();
    }

}
