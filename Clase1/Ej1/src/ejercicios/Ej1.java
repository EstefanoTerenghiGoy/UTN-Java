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
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese su edad:");
        int edad = Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese su nombre:");
        String nombre = sc.nextLine();
        
        System.out.println("Te llamas " + nombre + " y tenés " + edad + " Años");
    }
    
}
