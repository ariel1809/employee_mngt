module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;
    requires mongo.java.driver;
    requires java.sql;

    opens com.example.demo to javafx.fxml;
    exports com.example.demo;
}