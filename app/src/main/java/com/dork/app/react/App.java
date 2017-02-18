package com.dork.app.react;

import android.support.multidex.MultiDexApplication;
import android.support.v7.app.AppCompatDelegate;
import android.text.TextUtils;
import android.util.Log;

import com.dork.app.react.api.invoker.Configuration;
import com.dork.app.react.util.AppSettings;

/**
 * Created by Xpitfire on 16.02.2017.
 */

public class App extends MultiDexApplication {

    public static final boolean LOGGING_ENABLED = true;

    /**
     * Log to console
     *
     * @param cause Class where error occurred
     * @param text                text to log
     */
    public static void log(Class cause, String text) {
        if (LOGGING_ENABLED && cause != null && !TextUtils.isEmpty(text)) {
            Log.d(cause.getName(), text);
        }
    }

    private AppSettings appSettings;

    @Override
    public void onCreate() {
        super.onCreate();

        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);

        appSettings = new AppSettings(this);
        String server = appSettings.getReactServer();
        Configuration.getDefaultApiClient().setBasePath(server);
    }

    public AppSettings getAppSettings() {
        return appSettings;
    }
}
