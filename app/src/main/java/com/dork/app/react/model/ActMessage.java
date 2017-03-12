package com.dork.app.react.model;

import java.util.List;

/**
 * Created by Xpitfire on 12.03.2017.
 */

public final class ActMessage extends MessageBase {

    private List<String> receiversIds;
    private String description;
    private ActType type = ActType.PRIVATE_ACT;

    public List<String> getReceiversIds() {
        return receiversIds;
    }

    public void setReceiversIds(List<String> receiversIds) {
        this.receiversIds = receiversIds;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ActType getType() {
        return type;
    }

    public void setType(ActType type) {
        this.type = type;
    }
}
