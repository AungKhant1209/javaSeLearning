package org.example.javafxlearning.model;

public class Vehicle {
    private String name;
    private String model;
    private String license;
    private int maxPassengers;
    private double priceParDay;
    private Owner owner;

    private VehicleType vehicleType;

    public Vehicle(String name, String model, String license, VehicleType vehicleType) {
        this.name = name;
        this.model = model;
        this.license = license;
        this.vehicleType = vehicleType;
    }

    public Vehicle(String name, String model, String license, int maxPassengers, double priceParDay, Owner owner, VehicleType vehicleType) {
        this.name = name;
        this.model = model;
        this.license = license;
        this.maxPassengers = maxPassengers;
        this.priceParDay = priceParDay;
        this.owner = owner;
        this.vehicleType = vehicleType;
    }


    public String getName() {
        return name;
    }

    public String getTypeName(){
        return vehicleType.getName();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public double getPriceParDay() {
        return priceParDay;
    }

    public void setPriceParDay(double priceParDay) {
        this.priceParDay = priceParDay;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", license='" + license + '\'' +
                ", maxPassengers=" + maxPassengers +
                ", priceParDay=" + priceParDay +
                ", owner=" + owner +
                ", vehicleType=" + vehicleType +
                '}';
    }
}
