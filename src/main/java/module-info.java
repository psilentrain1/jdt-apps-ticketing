module ticketing {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;
    requires java.sql;

    opens com.jamesdraketech.ticketing to javafx.fxml;
    exports com.jamesdraketech.ticketing;
}
