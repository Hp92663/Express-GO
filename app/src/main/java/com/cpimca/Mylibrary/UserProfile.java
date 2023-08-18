package com.cpimca.Mylibrary;

public class UserProfile {

    String name, email, phoneno, address1, gender, vehicleno, fuel;

    public UserProfile() {
    }

    public UserProfile(String name, String email, String phoneno, String address1, String gender, String vehicleno, String fuel) {
        this.name = name;
        this.email = email;
        this.phoneno = phoneno;
        this.address1 = address1;
        this.gender = gender;
        this.vehicleno = vehicleno;
        this.fuel = fuel;
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

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getVehicleno() {
        return vehicleno;
    }

    public void setVehicleno(String vehicleno) {
        this.vehicleno = vehicleno;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }
}
