package com.ironyard.day_care_project.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.ArrayList;

@Entity
@Table(name = "report")
public class Report {


    @Id
    @GeneratedValue
    private Integer id;
    private ArrayList<DiaperChange> diaperChange;
    private ArrayList<ItemNeeded> itemsNeeded;
    private ArrayList<Meal> meals;
    private ArrayList<Nap> naps;
    private String note;

    public Report() {
    }

    public Report(Integer id, ArrayList<DiaperChange> diaperChange, ArrayList<ItemNeeded> itemsNeeded, ArrayList<Meal> meals, ArrayList<Nap> naps, String note) {
        this.id = id;
        this.diaperChange = diaperChange;
        this.itemsNeeded = itemsNeeded;
        this.meals = meals;
        this.naps = naps;
        this.note = note;
    }

    public ArrayList<DiaperChange> getDiaperChange() {
        return diaperChange;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDiaperChange(ArrayList<DiaperChange> diaperChange) {
        this.diaperChange = diaperChange;
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


