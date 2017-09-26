package com.ironyard.day_care_project;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Groups> group = new HashSet<>();

}
