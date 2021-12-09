module appOne {

    requires javafx.fxml;
    requires javafx.controls;

    opens sample;

    exports sample;
    exports com.data;
    opens com.data;

}