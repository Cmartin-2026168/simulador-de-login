package com.camilomartin.controller;
 
import com.camilomartin.view.BienvenidaView;
import com.camilomartin.model.User;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import com.camilomartin.view.LoginView;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.StageStyle;
 
public class SceneManager {
 
    private Stage escenarioPrincipal;
    private Stage escenarioSecundario;
    private Scene escenaPrincipal;
    private static SceneManager instanciaSceneManager;
 
    public SceneManager() {
    }
 
    public void ventanaLogin() {
        try {
            this.escenarioPrincipal.initStyle(StageStyle.TRANSPARENT);
            LoginView login = LoginView.getInstanciaLoginView();
            cambiarEscena(login, 450, 500);
            this.escenaPrincipal.setFill(Color.TRANSPARENT);
            new LoginController(login);
 
        } catch (NullPointerException objetoNulo) {
            JOptionPane.showMessageDialog(null, "Error de objeto nulo: Ventana login ññññ");
 
        } catch (Exception errorPadre) {
            JOptionPane.showMessageDialog(null, "Error padre : ventana Login ");
            errorPadre.printStackTrace();
        }
    }
 
    public void ventanaBienvenida(User usuario) {
        try {
            this.escenarioSecundario = new Stage();
            this.escenarioSecundario.initStyle(StageStyle.TRANSPARENT);
            this.escenarioSecundario.initModality(Modality.APPLICATION_MODAL);
            BienvenidaView bienvenida = new BienvenidaView(usuario);
            Scene escenaBienvenida = new Scene(bienvenida, 320, 180);
            escenaBienvenida.setFill(Color.TRANSPARENT);
            this.escenarioSecundario.setScene(escenaBienvenida);
            this.escenarioSecundario.sizeToScene();
            this.escenarioSecundario.showAndWait();
 
        } catch (NullPointerException objetoNulo) {
            JOptionPane.showMessageDialog(null, "Error de objeto nulo: Ventana Login");
            objetoNulo.printStackTrace(); // mostrar todo el camino del error
        } catch (Exception errorPadre) {
            JOptionPane.showMessageDialog(null, "Error padre: Ventana Login");
            errorPadre.printStackTrace();
        }
    }
 
    public void cambiarEscena(Pane panel, int ancho, int alto) {
        try {
            escenaPrincipal = new Scene(panel, ancho, alto);
            this.escenarioPrincipal.setScene(escenaPrincipal);
            this.escenarioPrincipal.sizeToScene();
            this.escenarioPrincipal.show();
 
        } catch (NullPointerException objetoNulo) {
            JOptionPane.showMessageDialog(null, "Error de objeto nulo: Cambiar escena");
 
        } catch (Exception errorPadre) {
            JOptionPane.showMessageDialog(null, "Error padre : cambiar escena");
            errorPadre.printStackTrace();
 
        }
    }
 
    public static SceneManager getInstanciaSceneManager() {
        if (instanciaSceneManager == null) {
            instanciaSceneManager = new SceneManager();
        }
        return instanciaSceneManager;
    }
 
    public SceneManager(Stage escenarioPrincipal, Stage escenarioSecundario, Scene escenaPrincipal) {
        this.escenarioPrincipal = escenarioPrincipal;
        this.escenarioSecundario = escenarioSecundario;
        this.escenaPrincipal = escenaPrincipal;
 
    }
 
    public static void setInstanciaSceneManager(SceneManager instanciaSceneManager) {
        SceneManager.instanciaSceneManager = instanciaSceneManager;
    }
 
    public Stage getEscenarioPrincipal() {
        return escenarioPrincipal;
    }
 
    public void setEscenarioPrincipal(Stage escenarioPrincipal) {
        this.escenarioPrincipal = escenarioPrincipal;
    }
 
    public Stage getEscenarioSecundario() {
        return escenarioSecundario;
    }
 
    public void setEscenarioSecundario(Stage escenarioSecundario) {
        this.escenarioSecundario = escenarioSecundario;
    }
 
    public Scene getEscenaPrincipal() {
        return escenaPrincipal;
    }
 
    public void setEscenaPrincipal(Scene escenaPrincipal) {
        this.escenaPrincipal = escenaPrincipal;
    }
 
}

