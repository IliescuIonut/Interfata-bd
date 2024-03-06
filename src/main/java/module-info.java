module com.example.interfata1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.example.interfata1 to javafx.fxml;
    exports com.example.interfata1;
}