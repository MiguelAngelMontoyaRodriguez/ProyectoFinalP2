module org.bugkiller.proyectofinalp2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires jdk.xml.dom;
    requires java.sql;
    requires java.desktop;
    requires itext;

    // paquete principal (vistas)
    opens org.bugkiller.proyectofinalp2 to javafx.fxml;
    exports org.bugkiller.proyectofinalp2;

    // subpaquetes de main
    exports org.bugkiller.proyectofinalp2.entities;
    exports org.bugkiller.proyectofinalp2.strategy;
    exports org.bugkiller.proyectofinalp2.repository;

    opens org.bugkiller.proyectofinalp2.entities to javafx.fxml;
}
