package com.ironyard.day_care_project.Entity;


public class Meal {

    private String type;
    private String food;
    private String amount;

    public Meal() {
    }

    public Meal(String type, String food, String amount) {
        this.type = type;
        this.food = food;
        this.amount = amount;
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
