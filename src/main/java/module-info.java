module com.example.parcialprogra2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.parcialprogra2 to javafx.fxml;
    exports com.example.parcialprogra2;
}