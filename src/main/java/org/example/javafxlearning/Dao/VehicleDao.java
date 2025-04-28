package org.example.javafxlearning.Dao;

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
        String query = "INSERT INTO vehicles (name, model, license, type_id) VALUES (?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, vehicle.getName());
            ps.setString(2, vehicle.getModel());
            ps.setString(3, vehicle.getLicense());
            ps.setInt(4,1);

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
        String query = "SELECT \n" +
                "  v.name AS vehicle_name,\n" +
                "  v.model,\n" +
                "  v.license,\n" +
                "  v.type_id,\n" +
                "  t.id AS type_id,\n" +
                "  t.name AS type_name,\n" +
                "  t.code AS type_code\n" +
                "FROM vehicles v\n" +
                "JOIN vehicle_types t ON v.type_id = t.id;";
        try{
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                VehicleType vehicleType = new VehicleType(
                        rs.getInt("type_id"),
                        rs.getString("type_code"),
                        rs.getString("type_name")
                       );
                Vehicle v=new Vehicle(
                        rs.getString("vehicle_name"),
                        rs.getString("model"),
                        rs.getString("license"),vehicleType);
                vehicles.add(v);
            }


        }catch (Exception e){
            e.printStackTrace();
        }
        return vehicles;
    }

}
