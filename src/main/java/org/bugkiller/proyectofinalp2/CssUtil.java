package org.bugkiller.proyectofinalp2;

import javafx.scene.Scene;

public class CssUtil {
    public static void aplicar(Scene escena){
        var css= CssUtil.class.getResource("/css/styles.css");
        if(css!=null ){
            escena.getStylesheets().add(css.toExternalForm());
        }
    }
}
