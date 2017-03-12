package com.dork.app.react.model;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by Xpitfire on 12.03.2017.
 */

@IgnoreExtraProperties
public final class Note extends EntityBase {

    public String text;
    public RankType rank = RankType.UNRANKED;

}
