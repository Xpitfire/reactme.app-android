package com.dork.app.react;

import android.app.Application;
import android.support.v7.app.AppCompatDelegate;
import android.text.TextUtils;
import android.util.Log;

import com.dork.app.react.api.invoker.Configuration;
import com.dork.app.react.util.AppSettings;

/**
 * Created by Xpitfire on 16.02.2017.
 */

public class App extends Application {

    public static final boolean LOGGING_ENABLED = true;

    /**
     * Log to console
     *
     * @param classWhereHappening Class where error occurred
     * @param text                text to log
     */
    public static void log(Class classWhereHappening, String text) {
        if (LOGGING_ENABLED && classWhereHappening != null && !TextUtils.isEmpty(text)) {
            Log.d(classWhereHappening.getName(), text);
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
