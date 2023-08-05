package com.example.parcialprogra2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

public class StatsController implements Initializable{
    @FXML
    private TableView<User> myTableView;
    @FXML
    private TableColumn<User, String> myTVChamba;
    @FXML
    private TableColumn<User, String> myTVAmnsiendad;
    @FXML
    private TableColumn<User, String> myTVTemperature;
    @FXML
    private TreeView myTreeView;
    @FXML
    private DatePicker myDatePicker;
    @FXML
    private Label myDPLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        myTVChamba.setCellValueFactory(new PropertyValueFactory<User, String>("myTVChamba"));
        myTVAmnsiendad.setCellValueFactory(new PropertyValueFactory<User, String>("myTVAmnsiendad"));
        myTVTemperature.setCellValueFactory(new PropertyValueFactory<User, String>("myTVTemperature"));

        TreeItem<String> rootItem = new TreeItem<>("Archivos");

        TreeItem<String> branchItem1 = new TreeItem<>("Imagenes");
        TreeItem<String> branchItem2 = new TreeItem<>("S e c r e t o");
        TreeItem<String> branchItem3 = new TreeItem<>("Videos");

        TreeItem<String> leafItem1 = new TreeItem<>("Cheems.png");
        TreeItem<String> leafItem2 = new TreeItem<>("Cheems.png");
        TreeItem<String> leafItem3 = new TreeItem<>("Cheems.exe");
        TreeItem<String> leafItem4 = new TreeItem<>("Cheems.exe");
        TreeItem<String> leafItem5 = new TreeItem<>("Cheems.mp3");
        TreeItem<String> leafItem6 = new TreeItem<>("Cheems.mp3");

        branchItem1.getChildren().addAll(leafItem1, leafItem2);
        branchItem2.getChildren().addAll(leafItem3, leafItem4);
        branchItem3.getChildren().addAll(leafItem5, leafItem6);

        rootItem.getChildren().addAll(branchItem1, branchItem2, branchItem3);

        TreeItem<String> branchItem4 = new TreeItem<>("Musica");

        myTreeView.setRoot(rootItem);
    }

    ObservableList<User> list = FXCollections.observableArrayList(
            new User("Inge", "100%", "78°"),
            new User("Lic", "40%", "89°"),
            new User("Inge", "80%", "90°"),
            new User("Inge", "20%", "100°"),
            new User("Sin chamba", "60%", "70°")
    );

    public void selectItem(){
        TreeItem<String> item = (TreeItem<String>) myTreeView.getSelectionModel().getSelectedItem();
        if (item != null){
            System.out.println(item.getValue());
        }
    }

    public void getDate(ActionEvent e){
        LocalDate myDate = myDatePicker.getValue();
        String myFormattedDate = ((LocalDate) myDate).format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        myDPLabel.setText(myFormattedDate);
    }
}