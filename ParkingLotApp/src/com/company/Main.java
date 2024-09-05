package com.company;

import com.company.entities.ParkingLot;
import com.company.entities.Ticket;
import com.company.entities.Vehicle;
import com.company.enums.VehicleType;

public class Main {

    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot(10);
        Vehicle vehicle = new Vehicle("Hyundai Verna X12", VehicleType.SEDAN);
        Ticket ticket = parkingLot.parkVehicle(vehicle);
        System.out.println("Vehicle with ID : "+vehicle.getVehicleNumber()+"is Parked " + ticket.getTicketId());
        parkingLot.exitVehicle(ticket);
        System.out.println("Available space: "+parkingLot.getAvailableSpace());
    }
}
