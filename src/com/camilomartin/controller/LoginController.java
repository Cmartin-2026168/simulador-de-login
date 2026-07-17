package com.camilomartin.controller;
 
import com.camilomartin.view.LoginView;
import com.camilomartin.model.User;
 
import javafx.stage.Stage;
import javax.swing.JOptionPane;
public class LoginController {
    private final LoginView LOGIN_VIEW;
    private double ejeX=0;
    private double ejeY=0;
    
    public LoginController ( LoginView loginView){
        this.LOGIN_VIEW = loginView;
        construirAcciones();
    }
    
    private Stage escenarioPrincipal = SceneManager
                            .getInstanciaSceneManager()
                            .getEscenarioPrincipal();
    
    
    private AuthSystem authSistema = new AuthSystem();
    
    public void iniciarSesion(){
        String nombreUsuario = this.LOGIN_VIEW.getTxtNombreUsuario().getText().trim();
        String clave = this.LOGIN_VIEW.getPwdClave().getText().trim();
        
        if( nombreUsuario.isEmpty() ){
            this.LOGIN_VIEW.getTxtNombreUsuario().getStyleClass().add("empty");
            JOptionPane.showMessageDialog(null, "NO DEJES VACIO EL NOMBRE USUARIO");
            
        }else if( clave.isEmpty() ){
            this.LOGIN_VIEW.getTxtNombreUsuario().getStyleClass().remove("empty");
            this.LOGIN_VIEW.getPwdClave().getStyleClass().add("empty");
            JOptionPane.showMessageDialog(null, "NO DEJES VACIO LA CONTRASEÑA");
            
        }else{
            this.LOGIN_VIEW.getPwdClave().getStyleClass().remove("empty");
            //METODO LOGIN
            User usuario = authSistema.login(nombreUsuario, clave);
            
            if( usuario == null ){
                JOptionPane.showMessageDialog(null, "VERIFICA TUS CREDENCIALES");
            }else{
                SceneManager.getInstanciaSceneManager().ventanaBienvenida(usuario);
            }
        }
    }
    
    public void construirAcciones(){
        this.LOGIN_VIEW.getBtnIniciarSecion().setOnMouseClicked(
             (evento)->{
                 iniciarSesion();
             }
        );
        
        this.LOGIN_VIEW.getBtnCerrarVentana().setOnMouseClicked(
            (evento)->{
                System.exit(0);
            }
        );
        
        this.LOGIN_VIEW.setOnMouseClicked(
            (evento)->{
                ejeX = evento.getSceneX();
                ejeY = evento.getSceneY();
            }
        );
        
        this.LOGIN_VIEW.setOnMouseDragged(
             (evento)->{
                 double ejeXDesplazamientoVentana = evento.getScreenX();
                 double ejeYDesplazamientoVentana = evento.getScreenY();
                 
                escenarioPrincipal.setX( ejeXDesplazamientoVentana - ejeX  );
                escenarioPrincipal.setY( ejeYDesplazamientoVentana - ejeY  );
             }
        );
    }
    
}
