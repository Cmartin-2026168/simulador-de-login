package com.camilomartin.model;

public class User {

    private String userName;
    private String password;
    private String fullName;
    private Rol rol;

    public User() {
    }

    public User(String userName, String password, String fullName, Rol rol) {
        this.userName = userName;
        this.password = password;
        this.fullName = fullName;
        this.rol = rol;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

}
