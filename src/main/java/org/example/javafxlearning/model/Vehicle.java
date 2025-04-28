package org.example.javafxlearning.model;

public class Vehicle {
    private String name;
    private String model;
    private String license;
    private VehicleType vehicleType;

    public Vehicle(String name, String model, String license, VehicleType vehicleType) {
        this.name = name;
        this.model = model;
        this.license = license;
        this.vehicleType = vehicleType;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ",license='" + license + '\'' +
                ", vehicletype='" + vehicleType + '\'' +
                '}';
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
}
