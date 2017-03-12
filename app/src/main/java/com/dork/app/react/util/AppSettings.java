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
    public static final String DEFAULT_STRING = "<EMPTY_STRING>";

    private final SharedPreferences mPrefApp;
    private final Context mContext;

    /**
     * Constructor
     *
     * @param context Android _context
     */
    public AppSettings(Context context) {
        this.mContext = context.getApplicationContext();
        mPrefApp = this.mContext.getSharedPreferences(SHARED_PREF_APP, Context.MODE_PRIVATE);
    }

    private String tr(int stringResourceId) {
        return mContext.getString(stringResourceId);
    }

    @SuppressLint("CommitPrefEdits")
    public void resetSettings() {
        mPrefApp.edit().clear().commit();
    }

    private void setString(int keyResId, String value) {
        mPrefApp.edit().putString(tr(keyResId), value).apply();
    }

    private String getString(int keyResId, String defaultValue) {
        return mPrefApp.getString(tr(keyResId), defaultValue);
    }

    private void setInt(int keyResId, int value) {
        mPrefApp.edit().putInt(tr(keyResId), value).apply();
    }

    private int getInt(int keyResId, int defaultValue) {
        return mPrefApp.getInt(tr(keyResId), defaultValue);
    }

    private void setLong(int keyResId, long value) {
        mPrefApp.edit().putLong(tr(keyResId), value).apply();
    }

    private long getLong(int keyResId, long defaultValue) {
        return mPrefApp.getLong(tr(keyResId), defaultValue);
    }

    private void setBool(int keyResId, boolean value) {
        mPrefApp.edit().putBoolean(tr(keyResId), value).apply();
    }

    private boolean getBool(int keyResId, boolean defaultValue) {
        return mPrefApp.getBoolean(tr(keyResId), defaultValue);
    }

    private void setDouble(int keyResId, double value) {
        mPrefApp.edit().putLong(tr(keyResId), Double.doubleToRawLongBits(value)).apply();
    }

    private double getDouble(int keyResId, double defaultValue) {
        if (!mPrefApp.contains(tr(keyResId))) {
            return defaultValue;
        }
        return Double.longBitsToDouble(mPrefApp.getLong(tr(keyResId), 0));
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
        String value = mPrefApp.getString(tr(keyResId), ARRAY_SEPARATOR);
        if (value.equals(ARRAY_SEPARATOR)) {
            return ret;
        }
        for (String s : value.split(ARRAY_SEPARATOR)) {
            ret.add(Integer.parseInt(s));
        }
        return ret;
    }

    public String getReactServer() {
        return getString(R.string.pref_key__react_server, mContext.getString(R.string.pref_key__server_default));
    }

    public String getUserId() {
        return getString(R.string.pref_key__user_id, DEFAULT_STRING);
    }

    public boolean hasUserId() {
        return getUserId() != null && !getUserId().equals(DEFAULT_STRING);
    }
}
