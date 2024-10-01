module com.autumn24.section1.helloworld {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.autumn24.section1.helloworld to javafx.fxml;
    exports com.autumn24.section1.helloworld;
}