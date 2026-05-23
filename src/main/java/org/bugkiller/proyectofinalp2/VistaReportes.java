package org.bugkiller.proyectofinalp2;

import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class VistaReportes {

    public Parent crearVista(){

        VBox root = new VBox(20);
        root.setPadding(new Insets(20));

        Label titulo = new Label("Reportes");
        titulo.setFont(new Font(28));

        HBox tarjetasReportes = new HBox(20);

        VBox ventas = crearTarjeta("Ventas Totales", "$12.000.000");

        VBox usuarios = crearTarjeta("Usuarios", "320");

        VBox eventos = crearTarjeta("Eventos Activos", "12");

        tarjetasReportes.getChildren().addAll(ventas, usuarios, eventos);

        CategoryAxis xAxis = new CategoryAxis();
        NumberAxis yAxis = new NumberAxis();

        BarChart<String, Number> grafico = new BarChart<>(xAxis, yAxis);

        grafico.setTitle("Ventas mensuales");

        root.getChildren().addAll(titulo, tarjetasReportes, grafico);

        return root;

    }

    private VBox crearTarjeta(String titulo, String valor){

        VBox tarjeta = new VBox(10);
        tarjeta.setPadding(new Insets(20));
        tarjeta.getStyleClass().add("tarjeta");

        Label lblTitulo = new Label(titulo);
        Label lblValor = new Label(valor);

        lblValor.setStyle("-fx-font-size:22px; -fx-font-weight:bold;");

        tarjeta.getChildren().addAll(lblTitulo, lblValor);

        return tarjeta;
    }
}
