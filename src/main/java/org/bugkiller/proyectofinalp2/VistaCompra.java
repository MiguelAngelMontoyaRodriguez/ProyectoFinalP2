package org.bugkiller.proyectofinalp2;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;



public class VistaCompra {

    public Parent crearVista(){

        VBox root = new VBox(20);
        root.setPadding(new Insets(30));
        root.setAlignment(Pos.TOP_CENTER);

        Label titulo = new Label("Compra de Entradas");
        titulo.setFont(new Font(28));
        titulo.setStyle("-fx-font-weight: bold;" + "-fx-text-fill: #0F172A;");

        VBox tarjeta = new VBox(15);

        tarjeta.setPadding(new Insets(25));
        tarjeta.setMaxWidth(500);
        tarjeta.getStyleClass().add("tarjeta");

        Label evento = new Label("Evento: Concierto Rock");

        ComboBox<String> comboZona = new ComboBox<>();

        comboZona.getItems().addAll("VIP", "Preferencial", "General");

        comboZona.setPromptText("Seleccione una zona");

        Spinner<Integer> spinnerCantidad = new Spinner<>(1, 10, 1);

        Label subtotal = new Label("Subtotal: $150.000");
        Label impuestos = new Label("Impuestos: $10.000");
        Label servicios = new Label("Servicios adicionales");

        CheckBox vip = new CheckBox("Acceso VIP");
        CheckBox seguro = new CheckBox("Seguro del evento");
        CheckBox parqueadero = new CheckBox("Parqueadero");

        Label total = new Label("Total: $160.000");

        total.setStyle("-fx-font-size: 20px;" + "-fx-font-weight: bold;" + "-fx-text-fill: #2563EB;");

        Button botonContinuar = new Button("Continuar al pago");

        botonContinuar.setPrefWidth(250);
        botonContinuar.setPrefHeight(45);
        botonContinuar.setStyle("-fx-background-color: #2563EB;" + "-fx-text-fill: white;" + "-fx-font-size: 15px;" +
                "-fx-background-radius: 10;");

        botonContinuar.setOnAction(e -> {

            VistaPago vistaPago = new VistaPago();

            Scene escena = new Scene(vistaPago.crearVista(), 1200, 700);

            CssUtil.aplicar(escena);

            Stage escenario = (Stage) botonContinuar.getScene().getWindow();

            escenario.setScene(escena);

        });

        root.getChildren().addAll(evento, comboZona, spinnerCantidad, servicios, vip, seguro, parqueadero,
                subtotal, impuestos, total, botonContinuar);

        root.getChildren().addAll(titulo, tarjeta);

        return root;
    }
}
