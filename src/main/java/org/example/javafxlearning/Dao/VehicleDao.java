package org.example.javafxlearning.Dao;

import org.example.javafxlearning.model.Owner;
import org.example.javafxlearning.model.Vehicle;
import org.example.javafxlearning.model.VehicleType;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class VehicleDao {
    public Boolean addVehicle(Vehicle vehicle) {
        Connection con = DatabaseConnection.getConnection();
        String query = "INSERT INTO vehicles(name, model, license, type_id, owner_id, max_passengers, price_par_day) VALUES (?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, vehicle.getName());
            ps.setString(2, vehicle.getModel());
            ps.setString(3, vehicle.getLicense());
            ps.setInt(4,vehicle.getVehicleType().getId());
            ps.setInt(5,vehicle.getOwner().getId());
            ps.setInt(6,vehicle.getMaxPassengers());
            ps.setDouble(7,vehicle.getPricePerDay());


            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println("Vehicle inserted successfully.");
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace(); // show error message
        }
        return false;
    }
    public List<Vehicle> getVehicles() {
        Connection con = DatabaseConnection.getConnection();
        List<Vehicle> vehicles = new ArrayList<>();

        String query = "SELECT " +
                "v.name AS vehicle_name, " +
                "v.model, " +
                "v.license, " +
                "v.max_passengers, " +
                "v.price_par_day, " +
                "t.id AS type_id, " +
                "t.name AS type_name, " +
                "t.code AS type_code, " +
                "o.id AS owner_id, " +
                "o.name AS owner_name, " +
                "o.age AS owner_age, " +
                "o.email AS owner_email, " +
                "o.phone AS owner_phone, " +
                "o.passport AS owner_passport, " +
                "o.address AS owner_address " +
                "FROM vehicles v " +
                "JOIN vehicle_types t ON v.type_id = t.id " +
                "JOIN owners o ON v.owner_id = o.id";

        try {
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                VehicleType vehicleType = new VehicleType(
                        rs.getInt("type_id"),
                        rs.getString("type_code"),
                        rs.getString("type_name")
                );

                Owner owner = new Owner(
                        rs.getInt("owner_id"),
                        rs.getString("owner_name"),
                        rs.getInt("owner_age"),
                        rs.getString("owner_email"),
                        rs.getString("owner_phone"),
                        rs.getString("owner_passport"),
                        rs.getString("owner_address")
                );

                Vehicle v = new Vehicle(
                        rs.getString("vehicle_name"),
                        rs.getString("model"),
                        rs.getString("license"),
                        rs.getInt("max_passengers"),
                        rs.getDouble("price_par_day"),
                        owner,
                        vehicleType
                );
                vehicles.add(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return vehicles;
    }


}
