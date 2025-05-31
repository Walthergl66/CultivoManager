package com.MundoVerde.CultivoManager.dto;

public class AuthRequest {

    private String username;
    private String password;

    // Constructor vacío (requerido por Spring)
    public AuthRequest() {}

    // Getters y Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
