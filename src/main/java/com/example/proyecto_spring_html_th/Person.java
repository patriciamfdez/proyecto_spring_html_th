package com.example.proyecto_spring_html_th;

import java.util.Date;

public class Person {
    private String Nombre;
    private String Apellidos;
    private String Foto;
    private String Direc;
    private Date FechaNacimiento;

    public Person(String nombre, String apellidos, String foto, String direc, Date fechaNacimiento) {
        Nombre = nombre;
        Apellidos = apellidos;
        Foto = foto;
        Direc = direc;
        FechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public String getFoto() {
        return Foto;
    }

    public void setFoto(String foto) {
        Foto = foto;
    }

    public String getDirec() {
        return Direc;
    }

    public void setDirec(String direc) {
        Direc = direc;
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        FechaNacimiento = fechaNacimiento;
    }
}
