package com.dork.app.react.model;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by Xpitfire on 12.03.2017.
 */

@IgnoreExtraProperties
public abstract class EntityBase {

    public String id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EntityBase)) return false;

        EntityBase that = (EntityBase) o;

        return id != null ? id.equals(that.id) : that.id == null;

    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "EntityBase{" +
                "id='" + id + '\'' +
                '}';
    }
}
