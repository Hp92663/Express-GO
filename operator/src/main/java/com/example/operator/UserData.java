package com.example.operator;

public class UserData {

    String name, email, gender, phoneno, Address, vehicleno, fuel;

    public UserData() {
    }

    public UserData(String name, String email, String gender, String phoneno, String address, String vehicleno, String fuel) {
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.phoneno = phoneno;
        Address = address;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
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
