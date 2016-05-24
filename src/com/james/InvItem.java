package com.james;

/**
 * Created by jamesyburr on 5/23/16.
 */
public class InvItem {
    String name;
    Integer quantity;
    String category;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public InvItem(String name, Integer quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public InvItem() {
    }
}
