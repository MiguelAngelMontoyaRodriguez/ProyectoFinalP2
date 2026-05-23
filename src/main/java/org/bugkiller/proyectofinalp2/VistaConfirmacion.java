package org.bugkiller.proyectofinalp2;

import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class VistaConfirmacion {

    public Parent crearVista() {

        VBox root = new VBox(20);
        root.setPadding(new Insets(30));

        Label titulo = new Label("¡Compra Exitosa!");
        titulo.setFont(new Font(30));

        Label resumen = new Label("Tu compra fue realizada correctamente.");

        Label codigo = new Label("Código de compra: EVT-2026-001");

        Button botonDescargar = new Button("Descargar Entrada");

        Button botonVolver = new Button("Volver al Inicio");

        root.getChildren().addAll(titulo, resumen, codigo, botonDescargar, botonVolver);

        return root;

    }
}
