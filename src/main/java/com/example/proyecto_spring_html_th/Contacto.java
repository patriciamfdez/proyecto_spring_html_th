package com.example.proyecto_spring_html_th;

public class Contacto {
    private String TextoContacto;

    public Contacto(String textoContacto) {
        TextoContacto = textoContacto;
    }

    public String getTextoContacto() {
        return TextoContacto;
    }

    public void setTextoContacto(String textoContacto) {
        TextoContacto = textoContacto;
    }
}
