package com.scorpionGarage;

public class Car {
    //The car class that contain all the car attribute.

    private int price = 0;
    private String color;
    private int topSpeed;
    private String name;
    private int currentMilage;
    private int fuelCapacity;
    private int numberOfDoors;
    private boolean manual;
    private boolean automatic;
    private int taraSize;
    private int capacity;




    public Car(int price,String color,int topSpeed,String name,int currentMilage,int fuelCapacity,int numberOfDoors,boolean manual,boolean automatic,int taraSize,int capacity)
    {
        this.price = price;
        this.color = color;
        this.topSpeed = topSpeed;
        this.name = name;
        this.currentMilage = currentMilage;
        this.fuelCapacity = fuelCapacity;
        this.numberOfDoors = numberOfDoors;
        this.manual = manual;
        this.automatic = automatic;
        this.taraSize = taraSize;
        this.capacity = capacity;


    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentMilage() {
        return currentMilage;
    }

    public void setCurrentMilage(int currentMilage) {
        this.currentMilage = currentMilage;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public boolean getManual() {
        return manual;
    }

    public void setManual(boolean manual) {
        this.manual = manual;
    }

    public boolean getAutomatic() {
        return automatic;
    }

    public void setAutomatic(boolean automatic) {
        this.automatic = automatic;
    }

    public int getTaraSize() {
        return taraSize;
    }

    public void setTaraSize(int taraSize) {
        this.taraSize = taraSize;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
