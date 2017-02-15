package com.dork.app.react.service;

import com.dork.app.react.service.moc.ProfileServiceMoc;

/**
 * Created by mcd on 05.02.2017.
 */

public final class ServiceLocator {

    private static final ProfileService _profileService;

    static {
        _profileService = new ProfileServiceMoc();
    }

    public static synchronized ProfileService getProfileService() {
        return _profileService;
    }

}
