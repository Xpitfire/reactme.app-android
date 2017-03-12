package com.dork.app.react.model;

import com.google.firebase.database.IgnoreExtraProperties;

import java.util.List;

/**
 * Created by Xpitfire on 12.03.2017.
 */

@IgnoreExtraProperties
public final class ActMessage extends MessageBase {

    public List<String> receiversIds;
    public String description;
    public ActType type = ActType.PRIVATE_ACT;

}
