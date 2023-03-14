/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Potencia;

/**
 *
 * @author cami_
 */

public class Exponenciador {

    public static void main(String[] args) {

        int base = 5;
        int exponente = 5;

        System.out.println(potencia(base, exponente));
    }

    public static double potencia(int base, int exponente) {

        if (exponente == 0) { //caso base
            return 1; //5^0 = 1
        } else if (exponente == 1) { //caso base
            return base; //5^1 = 5
        } else if (exponente < 0) { //Exponente negativo
            return potencia(base, exponente + 1) / base;
        } else {  //Exponente positivo
            return base * potencia(base, exponente - 1);
        }
    }
}
   
