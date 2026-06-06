package com.mycompany.main;

public class Motorcycle extends Vehicle {
//    Attributes :

    private float engineCapacity;
    private String sidedCabinet;

//    Constructor :
    public Motorcycle(float engineCapacity, String sidedCabinet, String plateNum, String brand, String model, float dailyPrice, boolean availability) {
        super(plateNum, brand, model, dailyPrice, availability);
        this.engineCapacity = engineCapacity;
        this.sidedCabinet = sidedCabinet;
    }

    //    Setters And Getters :
    public float getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(float engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String getSidedCabinet() {
        return sidedCabinet;
    }

    public void setSidedCabinet(String sidedCabinet) {
        this.sidedCabinet = sidedCabinet;
    }

}
