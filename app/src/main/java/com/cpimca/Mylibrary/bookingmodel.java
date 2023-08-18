package com.cpimca.Mylibrary;

public class bookingmodel {

    String date,name,email;

    public bookingmodel() {

    }

    public bookingmodel(String date, String name, String email) {

        this.date = date;
        this.name = name;
        this.email = email;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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
}
