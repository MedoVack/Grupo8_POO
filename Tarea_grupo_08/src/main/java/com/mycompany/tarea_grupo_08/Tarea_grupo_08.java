/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tarea_grupo_08;

import Herencia.Deportista;
import Herencia.Doctor;

/**
 *
 * @author cejia
 */
public class Tarea_grupo_08 {

    public static void main(String[] args) {
        System.out.println("****************TAREA GRUPO 8*****************");
        Doctor dr= new Doctor();
        Deportista dp= new Deportista();
        
        //Doctor
        dr.titulo();
        dr.imprimirInformacion();
        dr.obtenerNumerodeColegacion();
        
        //Deportista
        dp.titulo();
        dp.imprimirInformacion();
        dp.obtenerDeportePractica();
    }
}
