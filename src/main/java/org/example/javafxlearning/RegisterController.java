package org.example.javafxlearning;

import javafx.beans.property.Property;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.cell.PropertyValueFactory;
import org.example.javafxlearning.Dao.OwnerDao;
import org.example.javafxlearning.Dao.VehicleDao;
import org.example.javafxlearning.Dao.VehicleTypeDao;
import org.example.javafxlearning.model.Owner;
import org.example.javafxlearning.model.Vehicle;
import org.example.javafxlearning.model.VehicleType;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class RegisterController {
    @FXML
    private TextField nameTextField;
    @FXML
    private TextField modelTextField;
    @FXML
    private TextField licenseTextField;
    @FXML
    private TextField pricePerDayTextField;
    @FXML
    private TextField passengerNumTextField;
    @FXML
    private ChoiceBox<String> vehicleTypeChoiceBox;
    @FXML
    private ChoiceBox<String> ownerChoiceBox;
    @FXML
    private TableView<Vehicle> vehicleDataTable;
    @FXML
    private TableColumn<Vehicle, String> nameColumn;
    @FXML
    private TableColumn<Vehicle, String> licenseColumn;
    @FXML
    private TableColumn<Vehicle, String> modelColumn;
    @FXML
    private TableColumn<Vehicle, String> typeColumn;
    @FXML
    private TableColumn<Vehicle, Integer> pricePerDayColumn;
    @FXML
    private TableColumn<Vehicle, String> ownerColumn;
    @FXML
    private TableColumn<Vehicle, String> passengerColumn;
    @FXML
    private TableColumn<Vehicle, String> addressColumn;


    @FXML
    private ObservableList<Vehicle> vehicleObservableList = FXCollections.observableArrayList();

    private static List<Vehicle> vehicles = new ArrayList<Vehicle>();
    public VehicleDao vehicleDao;
    private VehicleTypeDao vehicleTypeDao;
    private OwnerDao ownerDao;

    @FXML
    protected void initialize() {
        vehicleDao = new VehicleDao();
        vehicleTypeDao = new VehicleTypeDao();
        ownerDao = new OwnerDao();

        List<VehicleType> vehicleTypes=vehicleTypeDao.getVehicleTypes();
        vehicleTypeChoiceBox.setValue(vehicleTypes.getFirst().getName());
        for(VehicleType vehicleType:vehicleTypes){
            vehicleTypeChoiceBox.getItems().add(vehicleType.getName());
        }

        List<Owner> owners=ownerDao.getOwners();
        ownerChoiceBox.setValue(owners.getFirst().getName());
        for(Owner owner:owners){
            ownerChoiceBox.getItems().add(owner.getName());
        }

        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        licenseColumn.setCellValueFactory(new PropertyValueFactory<>("license"));
        modelColumn.setCellValueFactory(new PropertyValueFactory<>("model"));
        typeColumn.setCellValueFactory(new PropertyValueFactory<>("typeName"));
        pricePerDayColumn.setCellValueFactory(new PropertyValueFactory<>("pricePerDay"));
        ownerColumn.setCellValueFactory(new PropertyValueFactory<>("ownerName"));
        passengerColumn.setCellValueFactory(new PropertyValueFactory<>("maxPassengers"));
        addressColumn.setCellValueFactory(new PropertyValueFactory<>("address"));
        vehicleObservableList.addAll(vehicles);
        vehicleDataTable.setItems(vehicleObservableList);
        vehicleObservableList.addAll(vehicleDao.getVehicles());
        vehicleDataTable.setItems(vehicleObservableList);
    }
    @FXML
    protected void onRegisterClicked() {
        try {
            String name = nameTextField.getText();
            String model = modelTextField.getText();
            String license = licenseTextField.getText();
            double pricePerDay = Double.parseDouble(pricePerDayTextField.getText());
            int maxPassengers = Integer.parseInt(passengerNumTextField.getText());

            String typeName = vehicleTypeChoiceBox.getValue();
            String ownerName = ownerChoiceBox.getValue();
            System.out.println("typeName--> " + typeName);
            System.out.println("ownerName--> " + ownerName);
            VehicleType vehicleType = vehicleTypeDao.getVehicleTypeByName(typeName);
            System.out.println("Vehicle Type: "+vehicleType);
            Owner owner = ownerDao.getOwnerByName(ownerName);

            Vehicle newVehicle = new Vehicle(name, model, license, maxPassengers, pricePerDay, owner, vehicleType);
            System.out.println("Vehicle : "+newVehicle);
            System.out.println("owner : "+owner);
            vehicles.add(newVehicle);
            vehicleObservableList.add(newVehicle);
            vehicleDataTable.setItems(vehicleObservableList);
            vehicleDao.addVehicle(newVehicle);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
