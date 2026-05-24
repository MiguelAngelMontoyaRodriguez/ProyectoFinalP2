package org.bugkiller.proyectofinalp2;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class VistaDetalleEvento {

    public Parent crearVista(){

        VBox root = new VBox(20);
        root.setPadding(new Insets(30));
        root.setAlignment(Pos.TOP_CENTER);

        Rectangle banner = new Rectangle(900,250);

        banner.setArcWidth(20);
        banner.setArcHeight(20);

        banner.setStyle("-fx-fill: #CBD5E1;");

        Label titulo = new Label("Concierto Rock");
        titulo.setFont(new Font(30));

        titulo.setStyle( "-fx-font-weight: bold;" + "-fx-text-fill: #0F172A;");

        Label fecha = new Label("Fecha: 20 junio 2026");
        Label lugar = new Label("Lugar: Bogotá");

        Label descripcion = new Label("Prepárate para vivir una noche llena de energía, guitarras eléctricas y pura" +
                " adrenalina. Rock Night Fest reúne a bandas increíbles en un espectáculo donde la música, las luces" +
                " y la emoción se combinan para crear una experiencia inolvidable. Ven a cantar, saltar y sentir cada" +
                " acorde en un concierto diseñado para los verdaderos amantes del rock.");

        descripcion.setWrapText(true);

        descripcion.setStyle("-fx-font-size: 15px;" + "-fx-text-fill: #334155;");

        Label precio = new Label("Precio: $250.000");

        Label zonas = new Label("Zonas Disponibles");

        zonas.setStyle("-fx-font-size: 18px;" + "-fx-font-weight: bold;");

        ComboBox<String> comboZonas = new ComboBox<>();

        comboZonas.getItems().addAll("VIP - $400.000", "Preferencial - $250.000", "General - $120.000");

        comboZonas.setPromptText("Seleccione una zona");

        Button botonComprar = new Button("Comprar Entrada");

        botonComprar.setStyle("-fx-background-color: #2563EB;" + "-fx-text-fill: white;" + "-fx-font-size: 15px;" +
                "-fx-background-radius: 10;");

        botonComprar.setPrefWidth(250);
        botonComprar.setPrefHeight(45);

        botonComprar.setOnAction(e -> {

            VistaCompra vistaCompra = new VistaCompra();

            Scene escena = new Scene(vistaCompra.crearVista(),1200, 700);

            escena.getStylesheets().add(getClass().getResource("/css/styles.css").toExternalForm());

            Stage escenario = (Stage) botonComprar.getScene().getWindow();

            escenario.setScene(escena);

        });

        root.getChildren().addAll(banner, titulo, fecha, lugar, descripcion, precio, zonas, comboZonas, botonComprar);

        return root;
    }
}
