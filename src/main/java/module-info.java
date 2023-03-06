module com.example.goapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.goapp to javafx.fxml;
    exports com.example.goapp;
}