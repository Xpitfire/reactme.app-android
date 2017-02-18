package com.dork.app.react.service;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;

import com.dork.app.react.App;
import com.dork.app.react.R;
import com.dork.app.react.api.AuthApi;
import com.dork.app.react.api.invoker.ApiException;
import com.dork.app.react.util.AppSettings;

/**
 * Created by Xpitfire on 17.02.2017.
 */

public class RegisterService implements Runnable {

    private final Context context;

    public RegisterService(Context context) {
        this.context = context;
    }

    @Override
    public void run() {
        if (context == null) return;

        if (!isUserValid()) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public void run() {
                    Toast.makeText(context, R.string.error_couldnt_connect_or_register, Toast.LENGTH_LONG).show();
                }
            });
        }
    }


    public boolean isUserValid() {
        AppSettings settings = new AppSettings(context);

        AuthApi authApi = new AuthApi();
        if (settings.hasUserId()) {
            String userId = settings.getUserId();
            /*
            try {
                authApi.apiAuth(userId);
            } catch (ApiException e) {
                App.log(getClass(), context.getString(R.string.error_couldnt_check_user_id));
            }
            */
            return true;
        }
        return false;
    }

}
