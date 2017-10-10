package com.ironyard.day_care_project.Entity;

import javax.persistence.Entity;

@Entity
public class Meal {

    private String type;
    private String food;
    private String amount;

    public Meal() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
