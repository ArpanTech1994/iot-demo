package com.company.entities;

import java.util.UUID;

public class Ticket {
    private UUID ticketId;
    private Vehicle vehicle;
    private Long entryTime;

    public Ticket(Vehicle vehicle){
        this.ticketId = UUID.randomUUID();
        this.vehicle = vehicle;
        this.entryTime = System.currentTimeMillis();
    }

    public UUID getTicketId(){
        return ticketId;
    }

    public Vehicle getVehicle(){
        return vehicle;
    }

    public Long getEntryTime(){
        return entryTime;
    }
}
