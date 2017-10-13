package com.ironyard.day_care_project.Entity;


public class Nap {

    private Integer napStart;
    private Integer napEnd;

    public Nap() {
    }

    public Nap(Integer napStart, Integer napEnd) {
        this.napStart = napStart;
        this.napEnd = napEnd;
    }

    public Integer getNapStart() {
        return napStart;
    }

    public void setNapStart(Integer napStart) {
        this.napStart = napStart;
    }

    public Integer getNapEnd() {
        return napEnd;
    }

    public void setNapEnd(Integer napEnd) {
        this.napEnd = napEnd;
    }


}
