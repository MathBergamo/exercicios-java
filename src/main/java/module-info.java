module com.example.exerciciosjava {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.exerciciosjava to javafx.fxml;
    exports com.example.exerciciosjava;
    exports com.example.exerciciosjava.controller;
    opens com.example.exerciciosjava.controller to javafx.fxml;
}