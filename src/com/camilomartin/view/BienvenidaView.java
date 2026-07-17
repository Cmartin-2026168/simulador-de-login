package com.camilomartin.view;

//este import es nuevo
import com.camilomartin.model.Rol;
//

import com.camilomartin.model.User;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

// se remplazaron  11 imports
// 7 de layout
//1 de geometry
//1 de paint
//2 de text
import javafx.stage.Stage;

public class BienvenidaView extends VBox {

    private static BienvenidaView instanciaBienvenidaView;

    private Label lblBienvenida;
    private Button btnAceptar;

    // esto remplaza completamente al Bienvenida view original.
    public BienvenidaView(User usuario) {
        this.getStylesheets().add("/com/camilomartin/styles/LoginStyles.css");

        this.getStyleClass().add("bienvenida-container");

        if (usuario.getUserName().equals("Camilo")) {
            this.getStyleClass().add("bienvenida-camilo");
        } else if (usuario.getRol() == Rol.ADMIN) {
            this.getStyleClass().add("bienvenida-admin");
        } else {
            this.getStyleClass().add("bienvenida-usuario");
        }
// esto tambien remplaza apariencia 
        lblBienvenida = new Label("Bienvenido, " + usuario.getFullName().toUpperCase());
        lblBienvenida.getStyleClass().add("lbl-bienvenida");
        lblBienvenida.setWrapText(true);
//
        lblBienvenida.setAlignment(Pos.CENTER);

        btnAceptar = new Button("Aceptar");
//esto remplaza todo el bloque de apariencia anterior
        btnAceptar.getStyleClass().add("btn-aceptar");
//

        btnAceptar.setOnMouseClicked(evento -> {
            ((Stage) this.getScene().getWindow()).close();
        });

        this.getChildren().addAll(lblBienvenida, btnAceptar);
    }

    public static BienvenidaView getInstanciaBienvenidaView() {
        return instanciaBienvenidaView;
    }

    public static void setInstanciaBienvenidaView(BienvenidaView instanciaBienvenidaView) {
        BienvenidaView.instanciaBienvenidaView = instanciaBienvenidaView;
    }
}
