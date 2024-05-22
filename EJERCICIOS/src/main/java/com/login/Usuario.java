package com.login;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String usuario;
    private String contraseña;
    private String correo;

    public Usuario(String usuario, String contraseña, String correo) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.correo = correo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

}
