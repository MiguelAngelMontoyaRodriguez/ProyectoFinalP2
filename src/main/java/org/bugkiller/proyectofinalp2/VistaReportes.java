package org.bugkiller.proyectofinalp2;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.chart.*;
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
        titulo.setStyle("-fx-font-size: 30px;" + "-fx-font-weight: bold;" + "-fx-text-fill: #0F172A;");

        HBox tarjetasReportes = new HBox(20);

        VBox ventas = crearTarjeta("Ventas Totales", "$12.000.000");

        VBox usuarios = crearTarjeta("Usuarios", "320");

        VBox eventos = crearTarjeta("Eventos Activos", "12");

        tarjetasReportes.getChildren().addAll(ventas, usuarios, eventos);

        CategoryAxis xAxis = new CategoryAxis();
        NumberAxis yAxis = new NumberAxis();

        BarChart<String, Number> grafico = new BarChart<>(xAxis, yAxis);

        grafico.setTitle("Ventas mensuales");

        grafico.setPrefHeight(400);

        XYChart.Series<String, Number> ventasMes = new XYChart.Series<>();

        ventasMes.setName("2026");

        ventasMes.getData().add(new XYChart.Data<>("Enero", 120));

        ventasMes.getData().add(new XYChart.Data<>("Febrero", 180));

        ventasMes.getData().add(new XYChart.Data<>("Marzo", 250));

        ventasMes.getData().add(new XYChart.Data<>("Abril", 300));

        grafico.getData().add(ventasMes);

        PieChart graficoCircular = new PieChart();

        graficoCircular.getData().add(new PieChart.Data("VIP", 40));

        graficoCircular.getData().add(new PieChart.Data("Preferencial", 35));

        graficoCircular.getData().add(new PieChart.Data("General", 25));

        graficoCircular.setTitle("Tipos de entradas");
        graficoCircular.setPrefHeight(350);




        root.getChildren().addAll(titulo, tarjetasReportes, grafico, graficoCircular);

        return root;

    }

    private VBox crearTarjeta(String titulo, String valor){

        VBox tarjeta = new VBox(10);
        tarjeta.setAlignment(Pos.CENTER);
        tarjeta.setPadding(new Insets(20));
        tarjeta.setPrefWidth(220);
        tarjeta.getStyleClass().add("tarjeta");

        Label lblTitulo = new Label(titulo);
        Label lblValor = new Label(valor);

        lblValor.setStyle("-fx-font-size: 24px;" + "-fx-font-weight: bold;" + "-fx-text-fill: #2563EB;");

        tarjeta.getChildren().addAll(lblTitulo, lblValor);

        return tarjeta;
    }
}
