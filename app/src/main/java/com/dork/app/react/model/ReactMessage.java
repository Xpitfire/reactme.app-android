package com.dork.app.react.model;

/**
 * Created by Xpitfire on 12.03.2017.
 */

public final class ReactMessage extends MessageBase {

    private ActMessage actMessage;
    private Note comment;

    public ActMessage getActMessage() {
        return actMessage;
    }

    public void setActMessage(ActMessage actMessage) {
        this.actMessage = actMessage;
    }

    public Note getComment() {
        return comment;
    }

    public void setComment(Note comment) {
        this.comment = comment;
    }
}
