package com.pluralsight.portfoliomanager.model;

import java.util.ArrayList;
import java.util.List;

public class Portfolio {

    private String name;
    private String owner;
    private List<Valuable> valuables;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.valuables = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public void add(Valuable valuable) {
        valuables.add(valuable);
    }
}


