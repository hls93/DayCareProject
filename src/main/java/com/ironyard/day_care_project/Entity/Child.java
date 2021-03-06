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

    @ManyToOne(targetEntity = Group.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "group_id", referencedColumnName = "id")
    private Group owner;

    public Child() {
    }

    public Child(String firstName, String lastName, String dob, String parentFirstName, String parentLastName, String parentEmail, Group owner) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.parentFirstName = parentFirstName;
        this.parentLastName = parentLastName;
        this.parentEmail = parentEmail;
        this.owner = owner;
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

    public Group getOwner() {
        return owner;
    }

    public void setOwner(Group owner) {
        this.owner = owner;
    }


}

