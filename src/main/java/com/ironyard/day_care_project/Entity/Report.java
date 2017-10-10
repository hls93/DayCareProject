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


}
//diapers: [{time: "0800", type: "wet"}, {time: "1015", type: "dry"}],
//        itemsNeeded: {wipes: true, diapers: false, clothes: true},
//        meals: [{type: "breakfast", food: "Bacon, Eggs, Toast", amount: "most"},{type: "lunch", food: "Sandwich", amount: "all"}],
//        naps: [{napStart: "1130", napEnd: "1230"}],
//        note: 'Billy had a really great day!'
