package Day7;

import java.util.Scanner;

public class Vehicle {
    private String make;
    private static String model;
    private static int year;
    private String color;
    private String engineCapacity;
    private String cargoCapacity;
    //this is for car and motorBike
    public Vehicle(String make, String model, int year, String color, String engineCapacity) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.engineCapacity = engineCapacity;
    }
    //this is for truck
    public Vehicle(String make, String model, String cargoCapacity,String color) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.cargoCapacity = cargoCapacity;
    }
    //this is for general purposes
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.cargoCapacity = cargoCapacity;
    }
    @Override
    public String toString() {
        return make + " " + model + " " + year + " " + color + " " + engineCapacity + " " + cargoCapacity;

    }





}
