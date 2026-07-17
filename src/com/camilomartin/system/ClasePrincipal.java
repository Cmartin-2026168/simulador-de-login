package com.camilomartin.system;

import com.camilomartin.controller.SceneManager;
import javafx.application.Application;
import javafx.stage.Stage;

public class ClasePrincipal extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage escenarioRaiz) {
            SceneManager.getInstanciaSceneManager().setEscenarioPrincipal(escenarioRaiz);
            SceneManager.getInstanciaSceneManager().ventanaLogin();
    }

}
