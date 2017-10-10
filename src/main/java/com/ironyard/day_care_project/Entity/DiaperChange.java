package com.ironyard.day_care_project.Entity;

import javax.persistence.Entity;

//@Entity
public class DiaperChange {

    private Integer time;
    private String type;

    public DiaperChange() {
    }

    public DiaperChange(Integer time, String type) {
        this.time = time;
        this.type = type;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
