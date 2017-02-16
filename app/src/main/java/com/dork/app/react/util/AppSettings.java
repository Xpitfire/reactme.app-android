package com.dork.app.react.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;

import com.dork.app.react.R;

import java.util.ArrayList;

/**
 * Created by Xpitfire on 16.02.2017.
 */

public class AppSettings {
    private static final String ARRAY_SEPARATOR = "%%";
    public static final String SHARED_PREF_APP = "app";

    private final SharedPreferences prefApp;
    private final Context context;

    /**
     * Constructor
     *
     * @param context Android context
     */
    public AppSettings(Context context) {
        this.context = context.getApplicationContext();
        prefApp = this.context.getSharedPreferences(SHARED_PREF_APP, Context.MODE_PRIVATE);
    }

    private String tr(int stringResourceId) {
        return context.getString(stringResourceId);
    }

    @SuppressLint("CommitPrefEdits")
    public void resetSettings() {
        prefApp.edit().clear().commit();
    }

    private void setString(int keyResId, String value) {
        prefApp.edit().putString(tr(keyResId), value).apply();
    }

    private String getString(int keyResId, String defaultValue) {
        return prefApp.getString(tr(keyResId), defaultValue);
    }

    private void setInt(int keyResId, int value) {
        prefApp.edit().putInt(tr(keyResId), value).apply();
    }

    private int getInt(int keyResId, int defaultValue) {
        return prefApp.getInt(tr(keyResId), defaultValue);
    }

    private void setLong(int keyResId, long value) {
        prefApp.edit().putLong(tr(keyResId), value).apply();
    }

    private long getLong(int keyResId, long defaultValue) {
        return prefApp.getLong(tr(keyResId), defaultValue);
    }

    private void setBool(int keyResId, boolean value) {
        prefApp.edit().putBoolean(tr(keyResId), value).apply();
    }

    private boolean getBool(int keyResId, boolean defaultValue) {
        return prefApp.getBoolean(tr(keyResId), defaultValue);
    }

    private void setDouble(int keyResId, double value) {
        prefApp.edit().putLong(tr(keyResId), Double.doubleToRawLongBits(value)).apply();
    }

    private double getDouble(int keyResId, double defaultValue) {
        if (!prefApp.contains(tr(keyResId))) {
            return defaultValue;
        }
        return Double.longBitsToDouble(prefApp.getLong(tr(keyResId), 0));
    }

    private void setIntList(int keyResId, ArrayList<Integer> values) {
        StringBuilder sb = new StringBuilder();
        for (int value : values) {
            sb.append(ARRAY_SEPARATOR);
            sb.append(Integer.toString(value));
        }
        setString(keyResId, sb.toString().replaceFirst(ARRAY_SEPARATOR, ""));
    }

    private ArrayList<Integer> getIntList(int keyResId) {
        ArrayList<Integer> ret = new ArrayList<>();
        String value = prefApp.getString(tr(keyResId), ARRAY_SEPARATOR);
        if (value.equals(ARRAY_SEPARATOR)) {
            return ret;
        }
        for (String s : value.split(ARRAY_SEPARATOR)) {
            ret.add(Integer.parseInt(s));
        }
        return ret;
    }

    public String getReactServer() {
        return getString(R.string.pref_key__react_server, context.getString(R.string.server_default));
    }
}
