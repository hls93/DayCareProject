package com.ironyard.day_care_project.Entity;

import javax.persistence.*;

@Entity
@Table( name = "children")
public class Child {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;



}

