package com.dork.app.react.model;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by Xpitfire on 12.03.2017.
 */

@IgnoreExtraProperties
public final class Content extends EntityBase {

    public String mimeType;
    public int size;
    public String mediaId;
    public String thumbnailId;

}
