package org.example.setTask;

import java.util.*;

class Vehicle{
    private String name;
    private String type;

    public Vehicle(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}

public class VehicleProgram {
    private List<Vehicle> vehicleList;

    public VehicleProgram(){
        vehicleList=new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle){
        vehicleList.add(vehicle);
    }

    public void typeRemoval(String type){
        for(Vehicle vehicle: vehicleList) {
            if (Objects.equals(vehicle.getType(), type)) vehicleList.remove(vehicle);
        }
    }

    public boolean typeChecking(String type){
        boolean isPresent=false;
        for(Vehicle vehicle: vehicleList) {
            if (Objects.equals(vehicle.getType(), type)) isPresent=true;
        }
        return isPresent;
    }

    public void availableTypes(){
        Set<String> availableVehicleType=new HashSet<>();
        for(Vehicle vehicle: vehicleList) {
            availableVehicleType.add(vehicle.getType());
        }
        System.out.println(availableVehicleType);
    }


    public static void main(String[] args) {
        VehicleProgram vehicleProgram=new VehicleProgram();

        //Adding of vehicles
        vehicleProgram.addVehicle(new Vehicle("Scoprio","Car"));
        vehicleProgram.addVehicle(new Vehicle("Toyota Corolla", "Car"));
        vehicleProgram.addVehicle( new Vehicle("Yamaha FZ", "Bike"));
        vehicleProgram.addVehicle(new Vehicle("HeroHonda", "Bike"));
        vehicleProgram.addVehicle(new Vehicle("Mncoasn", "Truck"));

        //Remove of particular type
        vehicleProgram.typeRemoval("Truck");

        //Type checking
        vehicleProgram.typeChecking("Car");

        //Available types
        vehicleProgram.availableTypes();

    }
}
