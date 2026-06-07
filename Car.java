package com.mycompany.main;

public class Car extends Vehicle {

//    Attributes :
    private int seats;
    private String fuelType;
    private boolean airConditioned;

//    Constructor :
    public Car(int seats, String fuelType, boolean airConditioned, String plateNum, String brand, String model, float dailyPrice, boolean availability) {
        super(plateNum, brand, model, dailyPrice, availability);
        this.seats = seats;
        this.fuelType = fuelType;
        this.airConditioned = airConditioned;
    }

    //    Setters And Getters :
    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public boolean isAirConditioned() {
        return airConditioned;
    }

    public void setAirConditioned(boolean airConditioned) {
        this.airConditioned = airConditioned;
    }

}
