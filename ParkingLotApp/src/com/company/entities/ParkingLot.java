package com.company.entities;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ParkingLot {
    int capacity;
    int availableSpace;
    Map<UUID,Vehicle> parkedVehicle;
    public ParkingLot(int capacity){
        this.capacity = capacity;
        this.availableSpace = capacity;
        this.parkedVehicle = new HashMap<>();
    }
    public int getAvailableSpace(){
        return availableSpace;
    }

    /*Method to parkVehicle*/
    public Ticket parkVehicle(Vehicle vehicle) {
        //Check if the space is available for parking the vehicle
        if(availableSpace > 0){
            Ticket ticket = new Ticket(vehicle);
            parkedVehicle.put(ticket.getTicketId(),vehicle);
            availableSpace--;
            System.out.println("The available space is:"+availableSpace);
            return ticket;
        }else{
            System.out.println("Parking Lot is full . no available space");
            return null;
        }
    }

    public void exitVehicle(Ticket ticket){
        //If the vehicle exists in the hashmap
        if(parkedVehicle.containsKey(ticket.getTicketId())){
            parkedVehicle.remove(ticket.getTicketId());
            availableSpace++;
            //Calculate the duration of the parked vehicle
            long parkedTime = System.currentTimeMillis() - ticket.getEntryTime();
            double parkingFee = calculateFee(parkedTime);
            System.out.println("Vehicle with vehicleId: "+ticket.getVehicle().getVehicleNumber()+" has parking fee of:"+parkingFee);
        }
        else{
            System.out.println("Ticket not present in the hashmap");
        }
    }

    private double calculateFee(long parkedTime) {
        //double hours = parkedTime / 1000*60*60;
        return parkedTime * 100;
    }
}
