/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conversor;

/**
 *
 * @author Delian
 */
public class Convercion {

    /*Orden de las monedas*/
 /*Dolar, Euro, libra, Yen, Won, Peso Mexicano, Peso Colombiano, Peso Argentino, Peso Clileno*/
    private double moneda[][] = {{1, 0.94, 0.8296, 136.24, 1317.51, 18.38, 4754.5, 196.79, 832.7},
    {1, 1.0609, 1.2054, 0.0073, 0.0007, 0.0544, 0.0002, 0.005, 0.0012}};
    /*Metro, Centimetro, Milimetro, kilometro, Pulgada, Pie, Yarda, Milla*/
    private double longitud[][] = {{1, 100, 1000, 0.001, 39.37008, 3.28084, 1.093613, 0.000621},
    {1, 0.01, 0.001, 1000, 0.0254, 0.3048, 0.9144, 1609.344}};

    public double convertirMoneda(int deMoneda, int aMoneda, double valor) {
        return valor * moneda[1][deMoneda] * moneda[0][aMoneda];
    }

    public double convertirLongitud(int deLongitud, int alongitud, double valor) {
        return valor * longitud[1][deLongitud] * longitud[0][alongitud];
    }

    public double convertirTemperatura(int deTempe, int aTempe, double valor) {
        if (deTempe == aTempe) {
            return valor;
        } else if (deTempe == 0 && aTempe == 1) {
            return (valor * 9/5) + 32;
        } else if (deTempe == 0 && aTempe == 2) {
            return valor + 273.15;
        } else if (deTempe == 1 && aTempe == 0) {
            return (valor - 32) * 5/9;
        } else if (deTempe == 1 && aTempe == 2) {
            return ((valor - 32) * 5/9) + 273.15;
        } else if (deTempe == 2 && aTempe == 0) {
            return valor - 273.15;
        } else {
            return ((valor - 273.15) * 9/5) + 32;
        }
    }
}
