package com.latecoere.app.models;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "box_tbl")
public class Box {

    @Id
    private String id;

    @OneToMany(targetEntity = FabricationOrder.class, mappedBy = "box")
    private List<FabricationOrder> FabricationOrders = new LinkedList<>();

    public Box() { }

    public void addFabricationOrder (FabricationOrder newFabricationOrder){
        FabricationOrders.add(newFabricationOrder);
    }

    public List<FabricationOrder> getFabricationOrders(){
        return FabricationOrders;
    }

    public String getId(){
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
