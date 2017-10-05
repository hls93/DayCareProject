package com.ironyard.day_care_project.Entity;

import javax.persistence.*;

@Entity
@Table( name = "children")
public class Child {

    @Id
    @GeneratedValue
    private Integer id;

    private String firstName;

    private String lastName;

    private String dob;

    private String parentFirstName;

    private String parentLastName;

    private String parentEmail;

//    private String group;



    public Child(String firstName, String lastName, String dob, String parentFirstName, String parentLastName, String parentEmail, String group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.parentFirstName = parentFirstName;
        this.parentLastName = parentLastName;
        this.parentEmail = parentEmail;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getParentFirstName() {
        return parentFirstName;
    }

    public void setParentFirstName(String parentFirstName) {
        this.parentFirstName = parentFirstName;
    }

    public String getParentLastName() {
        return parentLastName;
    }

    public void setParentLastName(String parentLastName) {
        this.parentLastName = parentLastName;
    }

    public String getParentEmail() {
        return parentEmail;
    }

    public void setParentEmail(String parentEmail) {
        this.parentEmail = parentEmail;
    }

//    public String getGroup() {
//        return group;
//    }
//
//    public void setGroup(String group) {
//        this.group = group;
//    }
}

