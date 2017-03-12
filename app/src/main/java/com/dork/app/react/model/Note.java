package com.dork.app.react.model;

/**
 * Created by Xpitfire on 12.03.2017.
 */

public final class Note extends EntityBase {

    private String text;
    private RankType rank = RankType.UNRANKED;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public RankType getRank() {
        return rank;
    }

    public void setRank(RankType rank) {
        this.rank = rank;
    }
}
