package com.mycompany.main;

public class Truck extends Vehicle {
//    Attributes :

    private double cargoCapacity;
    private boolean refrigerated;

//    Constructor :
    public Truck(double cargoCapacity, boolean refrigerated, String plateNum, String brand, String model, float dailyPrice, boolean availability) {
        super(plateNum, brand, model, dailyPrice, availability);
        this.cargoCapacity = cargoCapacity;
        this.refrigerated = refrigerated;
    }

//    Setters And Getters :
    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public boolean isRefrigerated() {
        return refrigerated;
    }

    public void setRefrigerated(boolean refrigerated) {
        this.refrigerated = refrigerated;
    }

}

