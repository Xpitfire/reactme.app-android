package com.dork.app.react.service;

/**
 * Created by Xpitfire on 12.03.2017.
 */

public final class Page {

    private long timeSpan;
    private int startPosition;
    private int count;

    public long getTimeSpan() {
        return timeSpan;
    }

    public void setTimeSpan(long timeSpan) {
        this.timeSpan = timeSpan;
    }

    public int getStartPosition() {
        return startPosition;
    }

    public void setStartPosition(int startPosition) {
        this.startPosition = startPosition;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
