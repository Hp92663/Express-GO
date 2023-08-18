package com.example.operator;

import java.io.Serializable;

public class dataholder implements Serializable {
    String jobno;
    String cname;
    String dob;
    String mobileno;
    String carregino;
    String year;
    String mileage;
    String carmake;
    String carmodel;
    String engineno;
    String requirement;

    public dataholder() {
    }

    public dataholder(String jobno, String dob, String cname, String mobileno, String carregino, String year, String mileage, String carmake, String carmodel, String engineno, String requirement) {
        this.jobno = jobno;
        this.dob = dob;
        this.cname = cname;
        this.mobileno = mobileno;
        this.carregino = carregino;
        this.year = year;
        this.mileage = mileage;
        this.carmake = carmake;
        this.carmodel = carmodel;
        this.engineno = engineno;
        this.requirement = requirement;
    }

    public String getJobno() {
        return jobno;
    }

    public void setJobno(String jobno) {
        this.jobno = jobno;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getMobileno() {
        return mobileno;
    }

    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    public String getCarregino() {
        return carregino;
    }

    public void setCarregino(String carregino) {
        this.carregino = carregino;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    public String getCarmake() {
        return carmake;
    }

    public void setCarmake(String carmake) {
        this.carmake = carmake;
    }

    public String getCarmodel() {
        return carmodel;
    }

    public void setCarmodel(String carmodel) {
        this.carmodel = carmodel;
    }

    public String getEngineno() {
        return engineno;
    }

    public void setEngineno(String engineno) {
        this.engineno = engineno;
    }

    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }
}
