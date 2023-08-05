package com.example.parcialprogra2;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    ImageView myImage;
    @FXML
    Button myDerecha, myIzquierda, myPBButton;
    @FXML
    private Label myLabel, mySLabel;
    @FXML
    private ChoiceBox<String> myChoiceBox;
    @FXML
    private ComboBox<String> myComboBox;
    @FXML
    private RadioButton rButton1, rButton2, rButton3;
    public String chamba;
    @FXML
    private ProgressBar myPBar;
    double progress;
    @FXML
    private Slider mySlider;
    int temperature;
    @FXML
    private CheckBox myCheckBox;
    private Stage stage;
    private Scene scene;
    private Parent root;

    Image imageD = new Image(getClass().getResourceAsStream("@derecha.jpg"));
    Image imageI = new Image(getClass().getResourceAsStream("@izquierda.jpg"));
    Image imageC = new Image(getClass().getResourceAsStream("@default.jpg"));
    Image imageM = new Image(getClass().getResourceAsStream("@mamado.jpg"));

    public void pasoDerecha() {
        myImage.setImage(imageD);
    }

    public void pasoIzquierda() {
        myImage.setImage(imageI);
    }

    private String[] TipoCheems = {"chiquito", "mamado"};
    private String[] TipoCheems2 = {"Hembra", "Macho"};

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        myChoiceBox.getItems().addAll(TipoCheems);
        myChoiceBox.setValue(TipoCheems[0]);
        myChoiceBox.setOnAction(this::getCheems);

        myComboBox.getItems().addAll(TipoCheems2);
        myComboBox.setValue(TipoCheems2[0]);

        mySlider.valueProperty().addListener(new ChangeListener<Number>(){
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number oldValue, Number newValue){
                mySLabel.setText(Integer.toString(temperature)+ "°C");
            }
        });
    }

    public void getCheems(ActionEvent event) {
        String TipoCheems = myChoiceBox.getValue();
        myLabel.setText("Hola, soy Cheems " + TipoCheems);

        if (TipoCheems.equals("chiquito")) {
            myImage.setImage(imageC);
        } else if (TipoCheems.equals("mamado")) {

        }
    }

    public void getChamba(ActionEvent event) {
        if (rButton1.isSelected()) {
            myLabel.setText("Hola, soy Cheems " + TipoCheems + " inge");
            chamba = "Inge";
        } else if (rButton2.isSelected()) {
            myLabel.setText("Hola, soy Cheems " + TipoCheems + " licenciado");
            chamba = "Licenciado";
        } else {
            chamba = "Sin chamba";
        }
    }

    public void increaseProgress(){
        progress += 0.1;
        myPBar.setProgress(progress);
    }

    public void switchToStats(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("stats.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}