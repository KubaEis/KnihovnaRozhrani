module com.example.demolistview {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demolistview to javafx.fxml;
    opens com.example.demolistview.controller to javafx.fxml;
    exports com.example.demolistview;
    exports com.example.demolistview.controller to javafx.fxml;
}