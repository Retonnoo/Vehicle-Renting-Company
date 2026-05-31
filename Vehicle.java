package com.mycompany.main;

public abstract class Vehicle {

//    Parent for all vehicles (essential attributes for all vehicle)
    private String plateNum;
    private String brand;
    private String model;
    private float dailyPrice;
    private boolean availability;

//    Constructor
    public Vehicle(String plateNum, String brand, String model, float dailyPrice, boolean availability) {
        this.plateNum = plateNum;
        this.brand = brand;
        this.model = model;

        if (dailyPrice < 0) {
            this.dailyPrice = 0 ;
        } else {
            this.dailyPrice = dailyPrice;
        }
        this.availability = availability;
    }

//Setters and Getters
    public String getPlateNum() {
        return plateNum;
    }

    public void setPlateNum(String plateNum) {
        this.plateNum = plateNum;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getDailyPrice() {
        return dailyPrice;
    }

    public void setDailyPrice(float dailyPrice) {
        this.dailyPrice = dailyPrice;
    }

    public boolean isAvailable() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

}
