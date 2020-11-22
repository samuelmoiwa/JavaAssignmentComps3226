package com.scorpionGarage;

public class Human {
    private  String name;
    private String DOB;
    private String sex;

    public Human(String name,String DOB, String sex){
        this.name = name;
        this.DOB = DOB;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
