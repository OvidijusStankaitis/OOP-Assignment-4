module main.oopassignment4 {
    requires javafx.controls;
    requires javafx.fxml;
    requires poi;
    requires poi.ooxml;
    requires layout;
    requires io;
    requires kernel;

    opens main.Main to javafx.fxml, javafx.base;
    opens Data to javafx.base;
    exports main.Main;
}
