/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej3;

/**
 *
 * @author Estéfano
 */
public class Estadisticas {
    static int contadorA;
    static int contadorB;
    static int contadorC;
    
    static void metodoA(){
        contadorA++;
    }
    static void metodoB(){
        contadorB++;
    }
    static void metodoC(){
        contadorC++;
    }
    static void resumen(){
        System.out.println("A = " + contadorA + "\nB = " + contadorB + "\nC = " + contadorC);
    }
    
}
