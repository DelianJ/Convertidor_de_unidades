/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conversor;

/**
 *
 * @author Delian
 */
public class PruebaConvertir {
    public static void main(String[] args) {
        /*
        Convercion co = new Convercion();
        System.err.println(co.Convertir(6, 5, 1000000));
        */
        
        /*
        Metro -> 0
        Centimetro -> 1
        Milimetro -> 2
        kilometro -> 3
        Pulgada -> 4
        Pie -> 5
        Yarda -> 6
        Milla -> 7
        */
        
        Convercion co = new Convercion();
        System.out.println(co.convertirMoneda(5, 6, 50));
        System.out.println(co.convertirLongitud(7, 3, 35));
        System.out.println(co.convertirTemperatura(0, 1, 24));
    }
}
