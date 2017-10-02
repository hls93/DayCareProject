package com.ironyard.day_care_project;

import javax.persistence.*;

@Entity
@Table( name = "children")
public class Children {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;



}

