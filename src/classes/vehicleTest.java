package com.example.vehicle;

public class vehicleTest {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("BMW", 120, 8);


        VehicleInfo(vehicle);
    }

    public static void VehicleInfo(Vehicle vehicle){
        System.out.println("time = " + vehicle.getTime(480.0));
        System.out.println("fuel = " + vehicle.getFuel(360.0));

    }
}
