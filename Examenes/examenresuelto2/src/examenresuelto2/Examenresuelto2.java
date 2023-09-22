/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenresuelto2;

import java.lang.Math;

/**
 *
 * @author gonza
 */
public class Examenresuelto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numeros[];
        int tamano = 10;
        numeros = new int[tamano];

        for (int i = 0; i < tamano; i++) {
            numeros[i] = (int) Math.floor(Math.random() * (tamano - 8 + 1) + 8);
        }

        for (int i = 0; i < tamano; i++) {
            System.out.println(numeros[i]);
        }
        int cantidad = 0;
        int mayor=0;
        for (int i = 0; i < tamano; i++) {
            if (cantidad > mayor)
                mayor =numeros[i];
            cantidad = 0;
            for (int j = 0; j < tamano; j++) {
                if (numeros[i] == numeros[j]) {
                    cantidad++;
                }
            }
        }
        System.out.println("Mayor: "+mayor);

        

    }

}
