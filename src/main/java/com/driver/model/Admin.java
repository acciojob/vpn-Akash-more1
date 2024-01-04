package com.driver.model;


import javax.persistence.*;
import java.util.List;

@Entity
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String userName;

    String password;

    @OneToMany
    List<ServiceProvider> serviceProviders;

    public Admin() {
    }

    public Admin(int id, String userName, String password, List<ServiceProvider> serviceProviders) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.serviceProviders = serviceProviders;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUsername(String userName) {
        this.userName = userName;
    } //setUsername

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<ServiceProvider> getServiceProviders() {
        return serviceProviders;
    }

    public void setServiceProviders(List<ServiceProvider> serviceProviders) {
        this.serviceProviders = serviceProviders;
    }
}
