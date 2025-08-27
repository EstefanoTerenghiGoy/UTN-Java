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
public class Ej8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int totalNumeros = 0;
        int numMayor = 0;
        
        System.out.println("Ingrese el 1° numero:");
        int primerNumero = Integer.parseInt(sc.nextLine());
        int numMenor = primerNumero;
        totalNumeros += primerNumero;
        
        for (int i = 2; i <= 10; i++){
            System.out.println("Ingrese el " + i + "° numero:");
            int numeroActual = Integer.parseInt(sc.nextLine());
            totalNumeros += numeroActual;
            
            if (numeroActual > numMayor){
                numMayor = numeroActual;
            }
            if (numeroActual < numMenor){
                numMenor = numeroActual;
            }
        }
        double promedio = totalNumeros / 10;
        
        System.out.println("El numero mayor es: " + numMayor);
        System.out.println("El numero menor es: " + numMenor);
        System.out.println("El promedio es: " + promedio);
        
    }
    
}
