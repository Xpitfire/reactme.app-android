package com.dork.app.react.model;

/**
 * Created by Xpitfire on 12.03.2017.
 */

public final class Media extends MessageBase {

    private byte[] data;

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }
}
