/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author cejia
 */
public abstract class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String identidad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getIdentidad() {
        return identidad;
    }

    public void setIdentidad(String identidad) {
        this.identidad = identidad;
    }

    
    public void imprimirInformacion() {
        System.out.println("Nombre=" + nombre + ", Apellido=" + apellido + ", Edad=" + edad + ", Identidad=" + identidad);
    }
    
    
   abstract void obtenerNumerodeColegacion();
    
  abstract void obtenerDeportePractica();
   
  abstract void titulo();
            
            
            
    
}
