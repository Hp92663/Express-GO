package com.cpimca.Mylibrary;

public class UserData {

    String name, email,phoneno,address1,vehicleno;


    public UserData() {
    }

    public UserData(String name, String email, String phoneno, String address1, String vehicleno) {
        this.name = name;
        this.email = email;
        this.phoneno = phoneno;
        this.address1 = address1;
        this.vehicleno = vehicleno;
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

    public String getVehicleno() {
        return vehicleno;
    }

    public void setVehicleno(String vehicleno) {
        this.vehicleno = vehicleno;
    }
}

