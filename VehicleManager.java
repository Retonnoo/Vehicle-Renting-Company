package com.mycompany.main;

import java.util.ArrayList;

public class VehicleManager {

    private ArrayList<Vehicle> vehicles;

    public VehicleManager() {
        vehicles = new ArrayList<>();
    }
//adding Vehicles :

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);

    }
//Remove Vehicles :

    public void removeVehicle(Vehicle vehicle) {

        vehicles.remove(vehicle);
    }
//Searching Vehicles by plate number 

    public Vehicle searchVehicle(String plateNum) {
        for (Vehicle v : vehicles) {

            if (v.getPlateNum().equals(plateNum)) {
                return v;
            }

        }
        return null;
    }
    //presenting All Vehicles

    public ArrayList<Vehicle> presentingVehicles() {
        return vehicles;
    }
}

