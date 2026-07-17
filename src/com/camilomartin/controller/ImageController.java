package com.camilomartin.controller;

import javafx.scene.image.Image;

public class ImageController {

    private final String RUTA_IMAGENES  = "/com/camilomartin/resources/";

    public Image getImageLogin(String nombreImagen) {
        Image crearImagen;
        switch (nombreImagen) {
            case "logo":
                crearImagen = new Image(RUTA_IMAGENES + "login-logo.png");
                break;
            default:
                crearImagen = new Image(RUTA_IMAGENES + "login-logo.png");

        }
                return crearImagen;
    }
}
