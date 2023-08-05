package com.example.parcialprogra2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Personaliza a tu Cheems");
        stage.setFullScreen(true);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

    //Sintaxis para crear un nuevo stage
        //Stage stage = new Stage();

        //Para la escena se necesita una raiz
        //Se importa javafx.scene
        //Group root = new Group();

        //Se crea una escena para el stage
        //Agregue un color de fondo
        //Scene scene = new Scene(root, Color.CADETBLUE);

        //Agregue un titulo
        //stage.setTitle("Cheems");

        //Para que se abra en pantalla completa
        //stage.setFullScreen(true);

        //Para agregar una imagen se pega en el folder resources
        //Image image = new Image("cheems.png");
        //Import image javafx.scene.image

        //Para poner la imagen como icono
        //stage.getIcons().add(image);

        //Para agregar un tamaño
        //stage.setWidth(500);
        //stage.setHeight(500);

        //Para que la ventana no pueda cambiar de tamaño
        //stage.setResizable(false);

        //Para ajustar en que parte de la pantalla se abrira
        //stage.setX(50);
        //stage.setY(50);

        //Se agrega la raiz a la escena que se agregara al stage
        //stage.setScene(scene);

        //Aqui se carga el archivo fxml
        //stage.show();