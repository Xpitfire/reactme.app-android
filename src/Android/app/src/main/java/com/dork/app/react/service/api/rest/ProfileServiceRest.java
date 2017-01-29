package com.dork.app.react.service.api.rest;

import com.dork.app.react.model.domain.User;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by mcd on 23.01.2017.
 */

public interface ProfileServiceRest {

    @GET("/api/values/{id}")
    Call<User> getUser(@Path("id") String id);

}