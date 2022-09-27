module com.learn.oops {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.learn.oops to javafx.fxml;
    exports com.learn.oops;
}