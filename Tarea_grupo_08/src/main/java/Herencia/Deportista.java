/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author cejia
 */
public class Deportista extends Persona{

    public Deportista() {
        setNombre("Fernando");
        setApellido("Castro");
        setEdad(18);
        setIdentidad("05182005368965");
    }
    
    

    @Override
    void obtenerNumerodeColegacion() {}

    @Override
    public void obtenerDeportePractica() {
        System.out.println("Deporte que practica: Nadador Estilo Libre 200 Metros"); 
    }

    @Override
    public void titulo() {
           System.out.println("INFORMACION DEL DEPORTISTA");
    }
    
}
