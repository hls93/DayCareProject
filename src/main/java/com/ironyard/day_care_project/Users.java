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

    private String email;

    private String password;

    private Groups groups;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Groups> group = new HashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Groups getGroups() {
        return groups;
    }

    public void setGroups(Groups groups) {
        this.groups = groups;
    }

    public Set<Groups> getGroup() {
        return group;
    }

    public void setGroup(Set<Groups> group) {
        this.group = group;
    }
}
