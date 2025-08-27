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
public class Ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de lados de un cuadrado (Minimo 2)");
        int lados = Integer.parseInt(sc.nextLine());
    
        for (int i = 1; i <= lados; i++){
            for (int j = 1; j <= lados; j++){
                if (i == 1 || i == lados){
                    System.out.print("*");
                } else {
                    if (j == 1 || j == lados){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                    
                    
                }
            }
        System.out.println();

        }
    }
    
}
