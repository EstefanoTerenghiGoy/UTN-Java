/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author Estéfano
 */
public class Ej7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese su edad:");
        int edad = Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese su ingreso mensual:");
        int ingreso = Integer.parseInt(sc.nextLine());
        
        if (edad >= 21 && ingreso > 150000){
            System.out.println("Es apto para un credito");
        } else {
            System.out.println("No es apto para un credito");
        }
        
    }
    
}
