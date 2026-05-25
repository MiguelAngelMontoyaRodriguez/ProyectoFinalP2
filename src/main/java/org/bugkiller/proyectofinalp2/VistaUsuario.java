package org.bugkiller.proyectofinalp2;

import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;

public class VistaUsuario {

    //CREAR VISTA
    public VBox crearVista(){

        //TITULO
        Label subtitulo = new Label("Gestión de Usuarios");

        subtitulo.setStyle("-fx-font-size: 22px;" + "-fx-font-weight: bold;");

        //CAMPO NOMBRE
        TextField txtNombre = new TextField();

        txtNombre.setPromptText("Ingrese nombre");

        //CAMPO CORREO ELECTRONICO
        TextField txtcorreo = new TextField();

        txtcorreo.setPromptText("Ingrese correo electronico");

        //CAMPO TELÉFONO
        TextField txtTelefono = new TextField();

        txtTelefono.setPromptText("Ingrese número teléfonico");

        //ESTADO
        ComboBox<String> comboEstado = new ComboBox<>();

        comboEstado.getItems().addAll("Activo", "Inactivo");

        comboEstado.setValue("Activo");

        //BOTÓN GUARDAR USUARIO
        Button botonGuardar = new Button("Guardar Usuario");

        //TABLA USUARIOS
        TableView<UsuarioPrueba> tabla = new TableView<>();

        tabla.setItems(Dashboard.listaUsuarios);

        //COLUMNAS
        TableColumn<UsuarioPrueba, Integer> columnaID = new TableColumn<>("ID");

        TableColumn<UsuarioPrueba, String> columnaNombre = new TableColumn<>("Nombre");

        TableColumn<UsuarioPrueba, String> columnaCorreo = new TableColumn<>("Correo Electrónico");

        TableColumn<UsuarioPrueba, String> columnaTelefono = new TableColumn<>("Número Telefonico");

        TableColumn<UsuarioPrueba, String> columnaEstado = new TableColumn<>("Estado");

        //CONECTAR COLUMNAS
        columnaID.setCellValueFactory(new PropertyValueFactory<>("id"));

        columnaNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));

        columnaCorreo.setCellValueFactory(new PropertyValueFactory<>("correo"));

        columnaTelefono.setCellValueFactory(new PropertyValueFactory<>("telefono"));

        columnaEstado.setCellValueFactory(new PropertyValueFactory<>("estado"));

        //AGREGAR COLUMNAS
        tabla.getColumns().addAll(columnaID, columnaNombre, columnaCorreo, columnaTelefono, columnaEstado);

        //CONECTAR TABLA
        tabla.setItems(Dashboard.listaUsuarios);

        //BOTÓN EVENTO
        botonGuardar.setOnAction(e ->{

            String nombre = txtNombre.getText();

            String correo = txtcorreo.getText();

            String telefono = txtTelefono.getText();

            String estado = comboEstado.getValue();

            //VALIDACIÓN CAMPO VACIO
            if (nombre.isEmpty()){

                Alert alerta = new Alert(Alert.AlertType.ERROR);

                alerta.setContentText("Ingrese nombre");

                alerta.showAndWait();

                return;
            }

            //VALIDACIÓN NOMBRE
            if (!nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")){

                Alert alerta = new Alert(Alert.AlertType.ERROR);

                alerta.setContentText("El nombre solo puede contener letras");

                alerta.showAndWait();

                return;

            }

                //IDENTIFICADOR
                int id = Dashboard.listaUsuarios.size() + 1;

                //CREAR USUARIO
                UsuarioPrueba usuario = new UsuarioPrueba(id, nombre, correo, telefono, estado);

                //AGREGAR USUARIO
                Dashboard.listaUsuarios.add(usuario);

                //LIMPIAR CAMPOS
                txtNombre.clear();
                txtcorreo.clear();
                txtTelefono.clear();

                comboEstado.setValue("Activo");

        });

        //CONTENEDOR PRINCIPAL
        VBox esquema = new VBox();

        esquema.getChildren().addAll(subtitulo, txtNombre, txtcorreo, txtTelefono, comboEstado, botonGuardar, tabla);

        esquema.setSpacing(15);

        esquema.setPadding(new Insets(20));

        return esquema;

    }
}
