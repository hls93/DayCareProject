package com.ironyard.day_care_project.Entity;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table( name = "groups")
public class Group {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private String teachers;

    @ManyToOne(targetEntity = Daycare.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "daycare", referencedColumnName = "id")
    private Daycare owner;

    public Group() {

    }

    public Group(String name, String teachers, Daycare owner, Set<Child> children) {
        this.name = name;
        this.teachers = teachers;
        this.owner = owner;
    }

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


    public Daycare getOwner() {
        return owner;
    }

    public void setOwner(Daycare owner) {
        this.owner = owner;
    }
}
