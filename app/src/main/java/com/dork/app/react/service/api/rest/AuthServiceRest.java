package com.dork.app.react.service.api.rest;

import com.dork.app.react.model.domain.User;


/**
 * Created by mcd on 23.01.2017.
 */

public interface AuthServiceRest {

    User getUser(String id);

}