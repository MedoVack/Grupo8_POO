package com.mycompany.mcarcamo;

public class Persona {

    private String nombre;
    private int edad;
    private String genero;
    private String profesion;

    public Persona(String nombre, int edad, String genero, String profesion) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.profesion = profesion;
    }
    public String obtenerInfo(){
        return "Nombre: "+nombre+", Edad: "+edad+", Genero: "+genero+", Profesion: "+profesion;
    }
    public void establecerInfo (String nombre, int edad, String genero, String profesion) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.profesion = profesion;
    }
}   
