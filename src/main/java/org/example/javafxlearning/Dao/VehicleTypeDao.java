package org.example.javafxlearning.Dao;

import org.example.javafxlearning.model.Vehicle;
import org.example.javafxlearning.model.VehicleType;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class VehicleTypeDao {
    public Boolean addVehicleType(VehicleType vehicleType) {
        Connection con = DatabaseConnection.getConnection();
        String query = "INSERT INTO vehicle_types(name, code) VALUES (?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, vehicleType.getName());
            ps.setString(2, vehicleType.getCode());

            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println("Vehicle Type inserted successfully.");
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace(); // show error message
        }
        return false;
    }
    public List<VehicleType> getVehicleTypes() {
        Connection con = DatabaseConnection.getConnection();
        List<VehicleType> vehicleTypes = new ArrayList<>();
        String query = "SELECT * FROM vehicle_types";
        try{
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                VehicleType v=new VehicleType(
                        rs.getInt("id"),
                        rs.getString("code"),
                        rs.getString("name")
                       );
                vehicleTypes.add(v);
            }


        }catch (Exception e){
            e.printStackTrace();
        }
        return vehicleTypes;
    }
    public VehicleType getVehicleTypeByName(String name) {
        Connection con = DatabaseConnection.getConnection();
        String query = "SELECT * FROM vehicle_types WHERE name = ?";
        VehicleType vehicleType = null;
        try{
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                vehicleType=new VehicleType(
                        rs.getInt("id"),
                        rs.getString("code"),
                        rs.getString("name")
                );
            }


        }catch (Exception e){
            e.printStackTrace();
        }
        return vehicleType;
    }

}
