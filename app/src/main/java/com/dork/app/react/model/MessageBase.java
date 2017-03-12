package com.dork.app.react.model;

import com.google.firebase.database.IgnoreExtraProperties;

import java.util.List;

/**
 * Created by Xpitfire on 12.03.2017.
 */

@IgnoreExtraProperties
public abstract class MessageBase extends EntityBase {

    public Content content;
    public String senderId;
    public List<String> tags;
    public long dateCreated;
    public long dateReceived;
    public long dateViewed;

}
