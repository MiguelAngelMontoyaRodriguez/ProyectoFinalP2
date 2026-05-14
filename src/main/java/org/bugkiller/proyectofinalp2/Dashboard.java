package org.bugkiller.proyectofinalp2;

import javafx.application.Application;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.w3c.dom.css.CSSStyleRule;

public class Dashboard  extends Application {

    //LISTA OBSERVABLE PARA GUARDAR USUARIOS
    public static ObservableList<UsuarioPrueba> listaUsuarios = FXCollections.observableArrayList();

    //Método de arranque
    @Override
    public void start(Stage escenario) {

        //Titulo superior
        Label titulo = new Label("SmartEvent");

        titulo.setStyle("-fx-font-size: 24px;" + "-fx-font-weight: bold;" + "-fx-text-fill: white");

        //Horizontal
        HBox barraSuperior = new HBox(titulo);

        barraSuperior.setAlignment(Pos.CENTER.BASELINE_LEFT);

        barraSuperior.setPadding(new Insets(20));

        barraSuperior.setStyle("-fx-background-color: #1E293B;");

        //Menú lateral (Botones)
        Button botonUsuarios = new Button("Usuarios");

        Button botonEventos = new Button("Eventos");

        Button botonCompras = new Button("Compras");

        Button botonPagos = new Button("Pagos");

        Button botonConfiguracion = new Button("Configuración");

        //Ocupar ancho
        botonUsuarios.setMaxWidth(Double.MAX_VALUE);

        botonEventos.setMaxWidth(Double.MAX_VALUE);

        botonCompras.setMaxWidth(Double.MAX_VALUE);

        botonPagos.setMaxWidth(Double.MAX_VALUE);

        botonConfiguracion.setMaxWidth(Double.MAX_VALUE);

        //Vertical
        VBox menuLateral = new VBox();

        //Agregar botones al menu
        menuLateral.getChildren().addAll(botonUsuarios, botonEventos, botonCompras, botonPagos, botonConfiguracion);

        //Espacio entre botones
        menuLateral.setSpacing(15);

        //Espacio interno
        menuLateral.setPadding(new Insets(20));

        //Tamaño menú
        menuLateral.setPrefWidth(220);

        menuLateral.setStyle("-fx-background-color: #334155");

        //Subtitulo
        Label subtitulo = new Label("Información general");

        subtitulo.setStyle("-fx-font-size: 20px;" + "-fx-font-weight: bold");

        //Tarjetas de información
        VBox tarjetaUsuarios = crearTarjeta("Usuarios Activos", "125");

        VBox tarjetaEventos = crearTarjeta("Eventos", "32");

        VBox tarjetaIngresos = crearTarjeta("Ingresos", "$4.500.000");

        //Organizar tarjetas horizontales
        HBox contenedorTarjetas = new HBox();

        //Agregar tarjetas al contenedor
        contenedorTarjetas.getChildren().addAll(tarjetaUsuarios, tarjetaEventos, tarjetaIngresos);

        contenedorTarjetas.setSpacing(20);

        //VISTA USUARIO
        VistaUsuario vistaUsuario = new VistaUsuario();

        //Contenido central
        VBox contenidoCentral = new VBox();

        contenidoCentral.getChildren().addAll(subtitulo, contenedorTarjetas, vistaUsuario.crearVista());

        contenidoCentral.setSpacing(25);

        contenidoCentral.setPadding(new Insets(25));

        contenidoCentral.setStyle("-fx-background-color: #F1F5F9;");

        //Contenedor principal
        BorderPane root = new BorderPane();

        root.setTop(barraSuperior);

        root.setLeft(menuLateral);

        root.setCenter(contenidoCentral);

        //Interfaz grafica
        Scene escena = new Scene(root, 1200, 700);

        escenario.setTitle("Dashboard del Sistema");

        escenario.setScene(escena);

        //Mostrar ventana
        escenario.show();
    }
        //MÉTODOS

        //Método para crear tarjetas
        private VBox crearTarjeta(String titulo, String valor){

            Label lblTitulo = new Label(titulo);

            lblTitulo.setStyle("-fx-font-size: 16px;" + "-fx-text-fill: white;");

            Label lblValor = new Label(valor);

            lblValor.setStyle("-fx-font-size: 28px;" + "-fx-font-weight: bold;" +
                    "-fx-text-fill: white;");

            //Organizar verticalmente
            VBox tarjeta = new VBox();

            //Agregar elementos
            tarjeta.getChildren().addAll(lblTitulo, lblValor);

            tarjeta.setSpacing(10);

            tarjeta.setPadding(new Insets(20));

            tarjeta.setStyle("-fx-background-color: #0F172A;" + "-fx-background-radius: 12;");

            return tarjeta;

        }

        public static void main(String[] args){

            //Ejecutamos JavaFX
            launch(args);

        }

}
