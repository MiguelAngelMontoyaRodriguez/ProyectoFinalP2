package org.bugkiller.proyectofinalp2;

import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class VistaEventos {

    public Parent crearVista(){

        BorderPane root = new BorderPane();
        root.setPadding(new Insets(20));

        VBox contenedor = new VBox(20);

        Label titulo = new Label("Eventos Disponibles");
        titulo.setFont(new Font(28));

        HBox filtros = new HBox(10);

        TextField txtBuscar = new TextField();
        txtBuscar.setPromptText("Buscar evento");

        ComboBox<String> comboCategoria = new ComboBox<>();
        comboCategoria.getItems().addAll("Conciertos", "Festivales", "Conferencias", "Deportes");

        comboCategoria.setPromptText("Categoria");

        filtros.getChildren().addAll(txtBuscar, comboCategoria);

        FlowPane eventos = new FlowPane();
        eventos.setHgap(20);
        eventos.setVgap(20);

        eventos.getChildren().addAll(crearTarjetaEvento("Concierto Rock", "20 junio", "Bogotá", "$150.000"),
                crearTarjetaEvento("Conferencia CodeConnect", "15 julio", "Medellín", "$300.000"));

        contenedor.getChildren().addAll(titulo, filtros, eventos);

        root.setCenter(contenedor);

        return root;

    }

    private VBox crearTarjetaEvento(String nombre, String fecha, String lugar, String precio){

        VBox tarjeta = new VBox(10);
        tarjeta.setPrefWidth(250);
        tarjeta.setPadding(new Insets(15));
        tarjeta.getStyleClass().add("tarjeta");

        Label lblNombre = new Label(nombre);
        lblNombre.setStyle("-fx-font-size:18px; -fx-font-weight:bold;");

        Rectangle banner = new Rectangle(220, 100);

        banner.setArcWidth(20);
        banner.setArcHeight(20);

        banner.setStyle("-fx-fill: #CBD5E1;");

        Label lblFecha = new Label("Fecha: " + fecha);
        Label lblLugar = new Label("Lugar: " + lugar);
        Label lblPrecio = new Label("Precio: " + precio);

        Button botonDetalles = new Button("Ver Detalles");

        botonDetalles.setOnAction(e -> {

            VistaDetalleEvento vistaDetalle = new VistaDetalleEvento();

            Scene escena = new Scene(vistaDetalle.crearVista(), 1200, 700);

            escena.getStylesheets().add(getClass().getResource("/css/styles.css").toExternalForm());

            Stage escenario = (Stage) botonDetalles.getScene().getWindow();

            escenario.setScene(escena);
            
        });

        Button botonComprar = new Button("Comprar");

        HBox botones = new HBox(10, botonDetalles, botonComprar);

        tarjeta.getChildren().addAll(banner, lblNombre, lblFecha, lblLugar, lblPrecio, botones);

        return tarjeta;
    }
}
