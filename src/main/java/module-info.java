module com.example.customchess {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.customchess to javafx.fxml;
    exports com.example.customchess;
}