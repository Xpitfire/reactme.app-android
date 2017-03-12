package com.dork.app.react.model;

/**
 * Created by Xpitfire on 12.03.2017.
 */

public abstract class EntityBase implements Entity<String> {

    private String id;

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

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
