package com.pluralsight.portfoliomanager.model;

import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;

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

    public BigDecimal getValue() {

        BigDecimal total = BigDecimal.ZERO;

        for (Valuable valuable : valuables) {
            total = total.add(valuable.getValue());
        }

        return total;
    }

    public Valuable getMostValuable() {

        if (valuables.isEmpty()) {
            return null;
        }

        Valuable mostValuable = valuables.get(0);

        for (Valuable valuable : valuables) {

            if (valuable.getValue().compareTo(mostValuable.getValue()) > 0) {
                mostValuable = valuable;
            }
        }

        return mostValuable;
    }
}


