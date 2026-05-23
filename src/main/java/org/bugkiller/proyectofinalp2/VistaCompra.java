package org.bugkiller.proyectofinalp2;

import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class VistaCompra {

    public Parent crearVista(){

        VBox root = new VBox(20);
        root.setPadding(new Insets(30));

        Label titulo = new Label("Compra de Entradas");
        titulo.setFont(new Font(28));

        Label evento = new Label("Evento: Concierto Rock");

        Spinner<Integer> spinnerCantidad = new Spinner<>(1, 10, 1);

        Label subtotal = new Label("Subtotal: $150.000");
        Label impuestos = new Label("Impuestos: $10.000");
        Label total = new Label("Total: $160.000");

        Button botonContinuar = new Button("Continuar al pago");

        root.getChildren().addAll(titulo, evento, spinnerCantidad, subtotal, impuestos, total, botonContinuar);

        return root;
    }
}
