package org.bugkiller.proyectofinalp2;

import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class VistaMisCompras {

    public Parent crearVista(){

        VBox root = new VBox(20);
        root.setPadding(new Insets(20));

        Label titulo = new Label("Mis Compras");
        titulo.setFont(new Font(28));

        TableView<Object> tablaCompras = new TableView<>();

        TableColumn<Object, String> columnaEvento = new TableColumn<>("Evento");

        TableColumn<Object, String> columnaFecha = new TableColumn<>("Fecha");

        TableColumn<Object, String> columnaCantidad = new TableColumn<>("Cantidad");

        TableColumn<Object, String> columnaEstado = new TableColumn<>("Estado");

        TableColumn<Object, String> columnaTotal = new TableColumn<>("Total");

        tablaCompras.getColumns().addAll(columnaEvento, columnaFecha, columnaCantidad, columnaEstado, columnaTotal);

        Button botonDescargar = new Button("Descargar entrada");

        Button botonCancelar = new Button("Cancelar Compra");

        root.getChildren().addAll(titulo, tablaCompras, botonDescargar, botonCancelar);

        return root;

    }
}
