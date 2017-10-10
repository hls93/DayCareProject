package com.ironyard.day_care_project.Entity;

import javax.persistence.Entity;

@Entity
public class Nap {
    private Integer napStart;
    private Integer napEnd;

    public Nap() {
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
