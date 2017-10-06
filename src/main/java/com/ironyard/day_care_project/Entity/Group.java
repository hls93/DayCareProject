package com.ironyard.day_care_project.Entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table( name = "groups")
public class Group {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private String teachers;

    @ManyToOne
    private Daycare owner;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "group_id")
    private Set<Child> children = new HashSet<>();

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

    public String getTeachers() {
        return teachers;
    }

    public void setTeachers(String teachers) {
        this.teachers = teachers;
    }

    public Set<Child> getChildren() {
        return children;
    }

    public void setChildren(Set<Child> children) {
        this.children = children;
    }

    public Daycare getOwner() {
        return owner;
    }

    public void setOwner(Daycare owner) {
        this.owner = owner;
    }
}
