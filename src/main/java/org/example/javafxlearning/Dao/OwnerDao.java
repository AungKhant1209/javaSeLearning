package org.example.javafxlearning.Dao;

import org.example.javafxlearning.model.Owner;
import org.example.javafxlearning.model.VehicleType;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class OwnerDao {
    public Boolean addOwner(Owner owner) {
        Connection con = DatabaseConnection.getConnection();
        String query = "INSERT INTO owners(name,age,email,phone,passport,address ) VALUES (?,?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, owner.getName());
            ps.setInt(2, owner.getAge());
            ps.setString(3, owner.getEmail());
            ps.setString(4, owner.getPhone());
            ps.setString(5, owner.getPassport());
            ps.setString(6, owner.getAddress());


            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println("Owner inserted successfully.");
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace(); // show error message
        }
        return false;
    }
    public List<Owner> getOwners() {
        Connection con = DatabaseConnection.getConnection();
        List<Owner> owners = new ArrayList<>();
        String query = "SELECT * FROM owners";
        try{
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Owner owner=new Owner(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getString("email"),
                        rs.getString("phone"),
                        rs.getString("passport"),
                        rs.getString("address")
                       );
                owners.add(owner);
            }


        }catch (Exception e){
            e.printStackTrace();
        }
        return owners;
    }

}
