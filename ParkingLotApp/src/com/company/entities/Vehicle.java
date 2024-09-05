package com.company.entities;

import com.company.enums.VehicleType;

public class Vehicle {
    private String vehicleNumber;
    private VehicleType vehicleType;

    public Vehicle(String vehicleNumber,VehicleType vehicleType){
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
    }

    public String getVehicleNumber(){
        return vehicleNumber;
    }

    public VehicleType getVehicleType(){
        return vehicleType;
    }
}
