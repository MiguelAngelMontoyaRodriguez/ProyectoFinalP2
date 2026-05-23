package org.bugkiller.proyectofinalp2;

import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class VistaPago {

    public Parent crearVista(){

        VBox root = new VBox(20);
        root.setPadding(new Insets(30));

        Label titulo = new Label("Procesar pago");
        titulo.setFont(new Font(28));

        ComboBox<String> metodoPago = new ComboBox<>();
        metodoPago.getItems().addAll("Tarjeta", "PSE", "Nequi", "Daviplata");

        metodoPago.setPromptText("Método de pago");

        GridPane formulario = new GridPane();
        formulario.setHgap(10);
        formulario.setVgap(10);

        TextField txtNumero = new TextField();
        txtNumero.setPromptText("Número de tarjeta");

        TextField txtNombre = new TextField();
        txtNombre.setPromptText("Titular");

        TextField txtFecha = new TextField();
        txtFecha.setPromptText("MM/YY");

        PasswordField txtCVV = new PasswordField();
        txtCVV.setPromptText("cvv");

        formulario.add(txtNumero, 0, 0);
        formulario.add(txtNombre, 1, 0);
        formulario.add(txtFecha, 0, 1);
        formulario.add(txtCVV, 1, 1);

        Button botonPagar = new Button("Pagar");

        root.getChildren().addAll(titulo, metodoPago, formulario, botonPagar);

        return root;
    }
}
