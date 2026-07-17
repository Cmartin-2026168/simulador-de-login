package com.camilomartin.view;
 
import com.camilomartin.controller.ImageController;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

// se retiraron 8 imports de layout
 
public class LoginView extends BorderPane {
 
    private static LoginView instanciaLoginView;
    private Button btnCerrarVentana;
    private Label lblTituloVentana;
    private HBox barraDeOpciones;
    private VBox cajaVertical;
    private Label lblNombreUsuario;
    private TextField txtNombreUsuario;
    private Label lblClave;
    private PasswordField pwdClave;
    private GridPane formulario;
    private ImageView imgLogoLogin;
    private Button btnIniciarSesion;
    
    private String RUTA_ESTILOS = "/com/camilomartin/styles/";
 
    private LoginView() {
        this.getStylesheets().add(RUTA_ESTILOS + "LoginStyles.css");
        this.setPadding(new Insets(20));
        
        // esto remplaza un gran pedazo de codigo
        this.getStyleClass().add("login-container"); 
        //
 
        barraDeOpciones = new HBox(25);
 
        //esto remplaza un pedazo de codigo
        btnCerrarVentana = new Button("X");
        btnCerrarVentana.getStyleClass().add("btn-cerrar");
        lblTituloVentana = new Label("JAVAFX - SIMULACION LOGIN");
        lblTituloVentana.getStyleClass().add("lbl-titulo");
        
        barraDeOpciones.getChildren().addAll(btnCerrarVentana, lblTituloVentana);
        barraDeOpciones.getStyleClass().add("barra-opciones");
        this.setTop(barraDeOpciones);
        //

        
        cajaVertical = new VBox();
        cajaVertical.getStyleClass().add("caja-vertical");
        formulario = new GridPane();
        formulario.getStyleClass().add("formulario");
        
        //Todo esto remplaza a un pedazzo de codigo
        lblNombreUsuario = new Label("Ingrese su nombre de usuario");
        lblNombreUsuario.getStyleClass().add("lbl-formulario");
        txtNombreUsuario = new TextField();
        txtNombreUsuario.getStyleClass().add("login-field");
        lblClave = new Label("Ingrese su contraseña");
        lblClave.getStyleClass().add("lbl-formulario");
        pwdClave = new PasswordField();
        pwdClave.getStyleClass().add("login-field");
       //

        formulario.add(lblNombreUsuario, 0, 0);
        formulario.add(txtNombreUsuario, 1, 0);
        formulario.add(lblClave, 0, 1);
        formulario.add(pwdClave, 1, 1);
        imgLogoLogin = new ImageView(new ImageController().getImageLogin("logo"));
        imgLogoLogin.setFitWidth(100);
        imgLogoLogin.setFitHeight(100);
        imgLogoLogin.setCache(true);
        cajaVertical.setAlignment(Pos.CENTER);
        
        //esto remplaza un pedazo de codigo
        btnIniciarSesion = new Button("Iniciar Sesion"); 
        btnIniciarSesion.getStyleClass().add("btn-login");
        //
        
        cajaVertical.getChildren().addAll(imgLogoLogin, formulario, btnIniciarSesion);
        this.setCenter(cajaVertical);
    }
 
    //Getters y Setters
    public static LoginView getInstanciaLoginView() {
        if (instanciaLoginView == null) {
            instanciaLoginView = new LoginView();
        }
        return instanciaLoginView;
    }
 
    public static void setInstanciaLoginView(LoginView instanciaLoginView) {
        LoginView.instanciaLoginView = instanciaLoginView;
    }
 
    public Button getBtnCerrarVentana() {
        return btnCerrarVentana;
    }
 
    public void setBtnCerrarVentana(Button btnCerrarVentana) {
        this.btnCerrarVentana = btnCerrarVentana;
    }
 
    public Label getLblTituloVentana() {
        return lblTituloVentana;
    }
 
    public void setLblTituloVentana(Label lblTituloVentana) {
        this.lblTituloVentana = lblTituloVentana;
    }
 
    public HBox getBarraDeOpciones() {
        return barraDeOpciones;
    }
 
    public void setBarraDeOpciones(HBox barraDeOpciones) {
        this.barraDeOpciones = barraDeOpciones;
    }
 
    public VBox getCajaVertical() {
        return cajaVertical;
    }
 
    public void setCajaVertical(VBox cajaVertical) {
        this.cajaVertical = cajaVertical;
    }
 
    public Label getLblNombreUsuario() {
        return lblNombreUsuario;
    }
 
    public void setLblNombreUsuario(Label lblNombreUsuario) {
        this.lblNombreUsuario = lblNombreUsuario;
    }
 
    public TextField getTxtNombreUsuario() {
        return txtNombreUsuario;
    }
 
    public void setTxtNombreUsuario(TextField txtNombreUsuario) {
        this.txtNombreUsuario = txtNombreUsuario;
    }
 
    public Label getLblClave() {
        return lblClave;
    }
 
    public void setLblClave(Label lblClave) {
        this.lblClave = lblClave;
    }
 
    public PasswordField getPwdClave() {
        return pwdClave;
    }
 
    public void setPwdClave(PasswordField pwdClave) {
        this.pwdClave = pwdClave;
    }
 
    public GridPane getFormulario() {
        return formulario;
    }
 
    public void setFormulario(GridPane formulario) {
        this.formulario = formulario;
    }
 
    public ImageView getImgLogoLogin() {
        return imgLogoLogin;
    }
 
    public void setImgLogoLogin(ImageView imgLogoLogin) {
        this.imgLogoLogin = imgLogoLogin;
    }
 
    public Button getBtnIniciarSecion() {
        return btnIniciarSesion;
    }
 
    public void setBtnIniciarSecion(Button btnIniciarSecion) {
        this.btnIniciarSesion = btnIniciarSecion;
    }
 
}
 