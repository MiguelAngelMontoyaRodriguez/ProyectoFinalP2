package org.bugkiller.proyectofinalp2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class Dashboard {

    //LISTA OBSERVABLE PARA GUARDAR USUARIOS
    public static ObservableList<UsuarioPrueba> listaUsuarios = FXCollections.observableArrayList();

    public Parent crearVista() {

        //Titulo superior
        Label titulo = new Label("BugKiller");

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

        Button botonReportes = new Button("Reportes");

        String estiloBotones = "-fx-background-color: #475569;" + "-fx-text-fill: white;" +
                "-fx-font-size: 14px;" + "-fx-background-radius: 8;" + "-fx-cursor: hand;";

        //Ocupar ancho
        botonUsuarios.setMaxWidth(Double.MAX_VALUE);

        botonEventos.setMaxWidth(Double.MAX_VALUE);

        botonCompras.setMaxWidth(Double.MAX_VALUE);

        botonPagos.setMaxWidth(Double.MAX_VALUE);

        botonReportes.setMaxWidth(Double.MAX_VALUE);

        botonUsuarios.setStyle(estiloBotones);
        botonEventos.setStyle(estiloBotones);
        botonCompras.setStyle(estiloBotones);
        botonPagos.setStyle(estiloBotones);
        botonReportes.setStyle(estiloBotones);

        botonUsuarios.setPrefHeight(40);
        botonEventos.setPrefHeight(40);
        botonCompras.setPrefHeight(40);
        botonPagos.setPrefHeight(40);
        botonReportes.setPrefHeight(40);

        //Vertical
        VBox menuLateral = new VBox();

        //Agregar botones al menu
        menuLateral.getChildren().addAll(botonUsuarios, botonEventos, botonCompras, botonPagos, botonReportes);

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

        contenedorTarjetas.setAlignment(Pos.CENTER_LEFT);

        //Contenido central
        VBox contenidoCentral = new VBox();

        StackPane contenedorVista = new StackPane();

        contenedorVista.setPrefWidth(Double.MAX_VALUE);

        VBox.setVgrow(contenedorVista, Priority.ALWAYS);

        //VISTA INICIAL DASHBOARD
        VBox vistaInicio = new VBox();

        vistaInicio.getChildren().addAll(subtitulo, contenedorTarjetas);

        vistaInicio.setSpacing(25);

        //MOSTRAR INICIO
        contenedorVista.getChildren().setAll(vistaInicio);

        botonUsuarios.setOnAction(e -> {

            VistaUsuario vista = new VistaUsuario();

            contenedorVista.getChildren().setAll(vista.crearVista());

        });

        botonEventos.setOnAction(e -> {

            VistaEventos vista = new VistaEventos();

            contenedorVista.getChildren().setAll(vista.crearVista());

        });

        botonCompras.setOnAction(e -> {

            VistaCompra vista = new VistaCompra();

            contenedorVista.getChildren().setAll(vista.crearVista());

        });

        botonPagos.setOnAction(e -> {

            VistaPago vista = new VistaPago();

            contenedorVista.getChildren().setAll(vista.crearVista());

        });

        botonReportes.setOnAction(e -> {

            VistaReportes vista = new VistaReportes();

            contenedorVista.getChildren().setAll(vista.crearVista());

        });


        contenidoCentral.getChildren().addAll(contenedorVista);

        contenidoCentral.setSpacing(25);

        contenidoCentral.setPadding(new Insets(25));

        contenidoCentral.setStyle("-fx-background-color: #F1F5F9;");

        //Contenedor principal
        BorderPane root = new BorderPane();

        root.setTop(barraSuperior);

        root.setLeft(menuLateral);

        ScrollPane scroll = new ScrollPane(contenidoCentral);

        scroll.setFitToWidth(true);

        scroll.setStyle("-fx-background: #F1F5F9;");

        root.setCenter(scroll);

        BorderPane.setMargin(scroll, new Insets(0));

        return root;

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
}
