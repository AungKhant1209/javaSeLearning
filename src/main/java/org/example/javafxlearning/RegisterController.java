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

        //prepare for vehicle type choice box
        List<VehicleType> vehicleTypes=vehicleTypeDao.getVehicleTypes();
        vehicleTypeChoiceBox.setValue(vehicleTypes.getFirst().getName());
        for(VehicleType vehicleType:vehicleTypes){
            vehicleTypeChoiceBox.getItems().add(vehicleType.getName());
        }

        //prepare for owner choice box
        List<Owner> owners=ownerDao.getOwners();
        ownerChoiceBox.setValue(owners.getFirst().getName());
        for(Owner owner:owners){
            ownerChoiceBox.getItems().add(owner.getName());
        }

        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        licenseColumn.setCellValueFactory(new PropertyValueFactory<>("license"));
        modelColumn.setCellValueFactory(new PropertyValueFactory<>("model"));
        typeColumn.setCellValueFactory(new PropertyValueFactory<>("typeName"));
        vehicleObservableList.addAll(vehicles);
        vehicleDataTable.setItems(vehicleObservableList);
        vehicleObservableList.addAll(vehicleDao.getVehicles());
        vehicleDataTable.setItems(vehicleObservableList);
    }
    @FXML
    protected void onRegisterClicked() {
        String name = nameTextField.getText();
        String model = modelTextField.getText();
        String license = licenseTextField.getText();
        Double  price = Double.parseDouble(pricePerDayTextField.getText());
        int passengers = Integer.parseInt(passengerNumTextField.getText());


        String typeName = vehicleTypeChoiceBox.getValue();
        VehicleType vehicleType=vehicleTypeDao.getVehicleTypeByName(typeName);

        Vehicle newVehicle = new Vehicle(name, model, license, vehicleType);
        newVehicle.setPriceParDay(price);
        newVehicle.setMaxPassengers(passengers);

        vehicles.add(newVehicle);
        vehicleObservableList.add(newVehicle);
        vehicleDataTable.setItems(vehicleObservableList);
        vehicleDao.addVehicle(newVehicle);
        System.out.println("On Register Button Click");
    }


}
