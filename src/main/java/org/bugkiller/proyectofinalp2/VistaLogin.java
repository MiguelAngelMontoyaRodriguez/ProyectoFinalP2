package org.bugkiller.proyectofinalp2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VistaLogin extends Application {

    @Override
    public void start(Stage escenario){

        //TITULO
        Label titulo = new Label("SmartEvent");

        titulo.setStyle("-fx-font-size: 30px;" + "-fx-font-weight: bold;" + "-fx-text-fill: white;");

        //SUBTITULO
        Label subtitulo = new Label("Inciciar Sesión");

        subtitulo.setStyle( "-fx-font-size: 18px;" + "-fx-text-fill: white;");

        //CAMPO CORREO ELECTRONICO
        TextField txtCorreo = new TextField();

        txtCorreo.setPromptText("Ingrese su correo electronico");

        txtCorreo.setPrefWidth(300);

        //CAMPO CONTRASEÑA
        PasswordField txtPassword = new PasswordField();

        txtPassword.setPromptText("Ingrese su contraseña");

        txtPassword.setPrefWidth(300);

        //BOTÓN LOGIN
        Button botonIngresar = new Button("Ingresar");

        botonIngresar.setPrefWidth(300);

        botonIngresar.setStyle("-fx-background-color: #2563EB;" + "-fx-text-fill: white;" + "-fx-font-size: 14px;");

        //BOTÓN REGISTRO
        Button botonRegistro = new Button("Registrarse");

        botonRegistro.setOnAction(e ->{

            try {

                //ABRIR VENTANA DE REGISTRO
                VistaRegistro vistaRegistro = new VistaRegistro();

                Stage ventanaRegistro = new Stage();

                vistaRegistro.start(ventanaRegistro);

                //CERRAR LOGIN
                escenario.close();

            }catch (Exception excepcion){

                excepcion.printStackTrace();

            }
        });

        botonRegistro.setPrefWidth(300);

        //ACCIÓN BOTÓN LOGIN
        botonIngresar.setOnAction(e ->{

            String correo = txtCorreo.getText();

            String password = txtPassword.getText();

            //VALIDACIÓN REGISTRO
            if (correo.isEmpty() || password.isEmpty()){

                Alert alerta = new Alert(Alert.AlertType.WARNING);

                alerta.setTitle("Advertencia");

                alerta.setHeaderText(null);

                alerta.setContentText("Complete todos los campos");

                alerta.showAndWait();

                return;

            }

            try {

                //ABRIR DASHBOARD
                Dashboard dashboard = new Dashboard();

                Stage nuevaVentana = new Stage();

                dashboard.start(nuevaVentana);

                //CERRAR LOGIN
                escenario.close();

            }catch (Exception excepcion) {

                excepcion.printStackTrace();

            }
        });

        //CONTENEDOR PRINCIPAL
        VBox root = new VBox();

        root.getChildren().addAll(titulo, subtitulo, txtCorreo, txtPassword, botonIngresar, botonRegistro);

        root.setSpacing(15);

        root.setPadding(new Insets(40));

        root.setAlignment(Pos.CENTER);

        root.setStyle("-fx-background-color: #0F172A;");

        //ESCENA
        Scene escena = new Scene(root, 500, 500);

        escenario.setTitle("Login SmartEvent");

        escenario.setScene(escena);

        escenario.show();

    }

    public static void main(String[] args) {

        launch(args);
    }




}
