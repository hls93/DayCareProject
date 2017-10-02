package com.ironyard.day_care_project.Entity;

import com.ironyard.day_care_project.Entity.Children;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table( name = "groups")
public class Groups {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private String teachers;

    private Children childrens;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Children> children = new HashSet<>();

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

    public Children getChildrens() {
        return childrens;
    }

    public void setChildrens(Children childrens) {
        this.childrens = childrens;
    }

    public Set<Children> getChildren() {
        return children;
    }

    public void setChildren(Set<Children> children) {
        this.children = children;
    }
}
