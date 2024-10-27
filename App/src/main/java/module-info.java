module com.example.app {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.app to javafx.fxml;
    exports com.example.app;
    exports com.example.app.controller;
    opens com.example.app.controller to javafx.fxml;
}