package org.bugkiller.proyectofinalp2;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class VistaPago {

    public Parent crearVista(){

        VBox root = new VBox(20);
        root.setPadding(new Insets(30));
        root.setAlignment(Pos.TOP_CENTER);

        Label titulo = new Label("Pasarela de Pago");
        titulo.setFont(new Font(28));
        titulo.setStyle("-fx-font-size: 30px;" + "-fx-font-weight: bold;");

        ComboBox<String> metodoPago = new ComboBox<>();
        metodoPago.getItems().addAll("Tarjeta", "PSE", "Nequi", "Daviplata");

        metodoPago.setPromptText("Método de pago");
        metodoPago.setMaxWidth(400);

        VBox tarjeta = new VBox(20);
        tarjeta.setPadding(new Insets(25));
        tarjeta.setMaxWidth(550);
        tarjeta.getStyleClass().add("tarjeta");

        GridPane formulario = new GridPane();
        formulario.setHgap(10);
        formulario.setVgap(10);
        formulario.setAlignment(Pos.CENTER);

        TextField txtNumero = new TextField();
        txtNumero.setPromptText("Número de tarjeta");

        TextField txtNombre = new TextField();
        txtNombre.setPromptText("Titular");

        TextField txtFecha = new TextField();
        txtFecha.setPromptText("MM/YY");

        PasswordField txtCVV = new PasswordField();
        txtCVV.setPromptText("cvv");

        txtNumero.setPrefWidth(220);
        txtNombre.setPrefWidth(220);
        txtFecha.setPrefWidth(220);
        txtCVV.setPrefWidth(220);

        formulario.add(txtNumero, 0, 0);
        formulario.add(txtNombre, 1, 0);
        formulario.add(txtFecha, 0, 1);
        formulario.add(txtCVV, 1, 1);

        Label resumenCompra = new Label("Resumen compra");

        resumenCompra.setStyle("-fx-font-size: 18px;" + "-fx-font-weight: bold;");

        Label evento = new Label("Evento: Concierto Rock");

        Label total = new Label("Total: 260.000");

        total.setStyle("-fx-font-size: 20px;" + "-fx-font-weight: bold;" + "-fx-text-fill: #16A34A;");

        Button botonPagar = new Button("Pagar");
        botonPagar.setPrefWidth(250);
        botonPagar.setPrefHeight(45);
        botonPagar.setStyle("-fx-background-color: #16A34A;" + "-fx-text-fill: white;" + "-fx-font-size: 15px;" +
                "-fx-background-radius: 10;");

        botonPagar.setOnAction(e -> {

            Alert alerta = new Alert(Alert.AlertType.INFORMATION);

            alerta.setTitle("Pago exitoso");

            alerta.setHeaderText(null);

            alerta.setContentText("La compra fue realizada correctamente");

            alerta.showAndWait();

        });

        tarjeta.getChildren().addAll(metodoPago, formulario, resumenCompra, evento, total, botonPagar);

        root.getChildren().addAll(titulo, tarjeta);

        return root;
    }
}
