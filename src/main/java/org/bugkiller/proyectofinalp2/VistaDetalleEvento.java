package org.bugkiller.proyectofinalp2;

import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class VistaDetalleEvento {

    public Parent crearVista(){

        VBox root = new VBox(20);
        root.setPadding(new Insets(30));

        Label titulo = new Label("Concierto Rock");
        titulo.setFont(new Font(30));

        Label fecha = new Label("Fecha: 20 junio 2026");
        Label lugar = new Label("Lugar: Bogotá");

        Label descripcion = new Label("Prepárate para vivir una noche llena de energía, guitarras eléctricas y pura" +
                " adrenalina. Rock Night Fest reúne a bandas increíbles en un espectáculo donde la música, las luces" +
                " y la emoción se combinan para crear una experiencia inolvidable. Ven a cantar, saltar y sentir cada" +
                " acorde en un concierto diseñado para los verdaderos amantes del rock.");

        descripcion.setWrapText(true);

        Label precio = new Label("Precio: $250.000");

        Button botonComprar = new Button("Comprar Entrada");

        root.getChildren().addAll(titulo, fecha, lugar, descripcion, precio, botonComprar);

        return root;
    }
}
