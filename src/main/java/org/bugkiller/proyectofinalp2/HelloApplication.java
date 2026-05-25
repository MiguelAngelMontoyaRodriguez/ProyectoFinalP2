package org.bugkiller.proyectofinalp2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) {

        VistaLogin vistaLogin = new VistaLogin();

        Scene escena = new Scene(vistaLogin.crearVista(), 500, 600);

       var css = getClass().getResource("/css/styles.css");
        if(css != null) {
            escena.getStylesheets().add(css.toExternalForm());
        }
        stage.setTitle("BugKiller");

        stage.setScene(escena);

        stage.show();

    }

    public static void main(String[] args) {

        launch();
    }
}
