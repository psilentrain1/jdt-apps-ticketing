module ticketing {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens com.jamesdraketech.ticketing to javafx.fxml;
    exports com.jamesdraketech.ticketing;
}
