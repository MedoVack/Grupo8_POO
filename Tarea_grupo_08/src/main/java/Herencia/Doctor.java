/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author cejia
 */
public class Doctor extends Persona {

    public Doctor() {
        setNombre("Luis");
        setApellido("Aguirre");
        setEdad(35);
        setIdentidad("05081986256963");
    }
    
    

    @Override
   public void obtenerNumerodeColegacion() {
        System.out.println("Codigo de Colegiacion: 965845284551484561540");
    }

    @Override
    public void obtenerDeportePractica() {}

    @Override
    public void titulo() {
        System.out.println("INFORMACION DEL DOCTOR"); 
    }
    
    
}
