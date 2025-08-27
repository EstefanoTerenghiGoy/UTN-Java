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
public class Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        String nombre = sc.nextLine();
        System.out.println("Ingrese su apellido:");
        String apellido = sc.nextLine();
        
        System.out.println("Ingrese la primera nota:");
        int primeraNota = Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese la segunda nota:");
        int segundaNota = Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese la tercera nota:");
        int terceraNota = Integer.parseInt(sc.nextLine());

        double promedio = (primeraNota + segundaNota + terceraNota) / 3;
        
        if (promedio >= 6){
            System.out.println("Promocionado");
        } else if (promedio >= 4){
            System.out.println("Aprobado");
        } else {
            System.out.println("Desaprobado");
        }
        
    }
    
}
