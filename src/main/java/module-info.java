module org.bugkiller.proyectofinalp2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires jdk.xml.dom;
    requires java.sql;
    requires java.desktop;
    requires itextpdf;


    opens org.bugkiller.proyectofinalp2 to javafx.fxml;
    exports org.bugkiller.proyectofinalp2;
}