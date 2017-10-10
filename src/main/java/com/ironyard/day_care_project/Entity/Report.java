package com.ironyard.day_care_project.Entity;

import javax.persistence.Entity;
import java.util.ArrayList;

@Entity
public class Report {

    private ArrayList<DiaperChange> diaperChangee;
    private ArrayList<ItemNeeded> itemsNeeded;
    private ArrayList<Meal> meals;
    private ArrayList<Nap> naps;
    private String note;

    public Report() {
    }

    public Report(ArrayList<DiaperChange> diaperChangee, ArrayList<ItemNeeded> itemsNeeded, ArrayList<Meal> meals, ArrayList<Nap> naps, String note) {
        this.diaperChangee = diaperChangee;
        this.itemsNeeded = itemsNeeded;
        this.meals = meals;
        this.naps = naps;
        this.note = note;
    }

    public ArrayList<DiaperChange> getDiaperChangee() {
        return diaperChangee;
    }

    public void setDiaperChangee(ArrayList<DiaperChange> diaperChangee) {
        this.diaperChangee = diaperChangee;
    }

    public ArrayList<ItemNeeded> getItemsNeeded() {
        return itemsNeeded;
    }

    public void setItemsNeeded(ArrayList<ItemNeeded> itemsNeeded) {
        this.itemsNeeded = itemsNeeded;
    }

    public ArrayList<Meal> getMeals() {
        return meals;
    }

    public void setMeals(ArrayList<Meal> meals) {
        this.meals = meals;
    }

    public ArrayList<Nap> getNaps() {
        return naps;
    }

    public void setNaps(ArrayList<Nap> naps) {
        this.naps = naps;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}


