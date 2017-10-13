package com.ironyard.day_care_project.Entity;

import javax.persistence.*;



@Entity
@Table(name = "daycare")
public class Daycare {

    @Id
    @GeneratedValue
    private Integer id;

    private String address;

    private String city;

    private String state;

    private String zipcode;

    private String name;

    private String email;

    private String password;

    public Daycare() {
    }

    public Daycare(String address, String city, String state, String zipcode, String name, String email, String password) {
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.name = name;
        this.email = email;
        this.password = password;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}
