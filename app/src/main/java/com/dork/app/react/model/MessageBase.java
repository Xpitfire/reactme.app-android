package com.dork.app.react.model;

import java.util.List;

/**
 * Created by Xpitfire on 12.03.2017.
 */

public abstract class MessageBase extends EntityBase {

    private Content content;
    private String senderId;
    private List<String> tags;
    private long dateCreated;
    private long dateReceived;
    private long dateViewed;

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public long getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(long dateCreated) {
        this.dateCreated = dateCreated;
    }

    public long getDateReceived() {
        return dateReceived;
    }

    public void setDateReceived(long dateReceived) {
        this.dateReceived = dateReceived;
    }

    public long getDateViewed() {
        return dateViewed;
    }

    public void setDateViewed(long dateViewed) {
        this.dateViewed = dateViewed;
    }
}
