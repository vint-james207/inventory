package com.james;

/**
 * Created by jamesyburr on 5/24/16.
 */
public class Fruit extends InvItem {
    public Fruit(String name, Integer quantity) {
        this.name = name;
        this.quantity = quantity;
        this.category = "Fruits";
    }
}
