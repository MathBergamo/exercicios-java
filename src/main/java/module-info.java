module com.example.exerciciosjava {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.exerciciosjava to javafx.fxml;
    exports com.exerciciosjava;
    exports com.exerciciosjava.controller;
    opens com.exerciciosjava.controller to javafx.fxml;
}