module org.bugkiller.proyectofinalp2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.bugkiller.proyectofinalp2 to javafx.fxml;
    exports org.bugkiller.proyectofinalp2;
}