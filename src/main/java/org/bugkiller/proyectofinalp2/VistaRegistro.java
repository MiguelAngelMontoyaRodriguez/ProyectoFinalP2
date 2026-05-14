package org.bugkiller.proyectofinalp2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public  class VistaRegistro extends Application {

    @Override
    public void start(Stage escenario){

        //TITULO
        Label titulo = new Label("Registro de Usuario");

        titulo.setStyle("-fx-font-size: 28px;" + "-fx-font-weight: bold;");

        //CAMPO NOMBRE
        TextField txtNombre = new TextField();

        txtNombre.setPromptText("Ingrese nombre");

        //CAMPO CORREO ELECTRONICO
        TextField txtCorreo = new TextField();

        txtCorreo.setPromptText("ingrese el correo electronico");

        //CAMPO TELEFONO
        TextField txtTelefono = new TextField();

        txtTelefono.setPromptText("Ingrese número telefonico");

        //CAMPO PASSWORD
        PasswordField txtPassword = new PasswordField();

        txtPassword.setPromptText("Ingrese la contraseña");

        //BOTÓN REGISTRO
        Button botonRegistrar = new Button("Registrarse");

        botonRegistrar.setMaxWidth(Double.MAX_VALUE);

        //ACCIÓN BOTÓN REGISTRO
        botonRegistrar.setOnAction(e ->{

            String nombre = txtNombre.getText();

            String correo = txtCorreo.getText();

            String telefono = txtTelefono.getText();

            String password = txtPassword.getText();

            //VALIDAR CAMPOS
            if (nombre.isEmpty() || correo.isEmpty() || telefono.isEmpty() || password.isEmpty()){

                Alert alerta = new Alert(Alert.AlertType.WARNING);

                alerta.setTitle("Advertencia");

                alerta.setHeaderText(null);

                alerta.setContentText("Complete todos los campos");

                alerta.showAndWait();

                return;

            }

            //CREAR USUARIO
            UsuarioPrueba usuario = new UsuarioPrueba(1, nombre, correo, telefono, "Activo");

            Dashboard.listaUsuarios.add(usuario);

            //MENSAJE REGISTRO EXITOSO
            Alert alerta = new Alert(Alert.AlertType.INFORMATION);

            alerta.setTitle("Registro Exitoso");

            alerta.setHeaderText(null);

            alerta.setContentText("Usuario registrado exitosamente");

            alerta.showAndWait();

            try {

                //ABRIR DASHBOARD
                Dashboard dashboard = new Dashboard();

                Stage nuevaventana = new Stage();

                dashboard.start(nuevaventana);

                //CERRAR VENTANA REGISTRO
                escenario.close();

            }catch (Exception excepcion){

                excepcion.printStackTrace();

            }
        });

        //CONTENEDOR PRINCIPAL
        VBox root = new VBox();

        root.getChildren().addAll(titulo, txtNombre, txtCorreo, txtTelefono, txtPassword, botonRegistrar);

        root.setSpacing(15);

        root.setPadding(new Insets(40));

        root.setAlignment(Pos.CENTER);

        //ESCENA
        Scene escena = new Scene(root, 450, 500);

        escenario.setTitle("Registro");

        escenario.setScene(escena);

        escenario.show();

    }

    public static void main(String[] args) {

        launch(args);
    }

}
