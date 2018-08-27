package com.latecoere.app.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FabricationOrder {

    @Id
    private String id;
    private String box;
    private String dateAdded;

    public FabricationOrder(String id, String dateAdded) {
        this.id = id;
        this.dateAdded = dateAdded;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBox() {
        return box;
    }

    public void setBox(String box) {
        this.box = box;
    }

    public String getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
    }
}
