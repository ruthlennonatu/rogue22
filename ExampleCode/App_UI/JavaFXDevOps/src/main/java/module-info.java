module com.example.javafxdevops {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.javafxdevops to javafx.fxml;
    exports com.example.javafxdevops;
}