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
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        int numero = sc.nextInt();
        int cantPares = 0;
        
        for (int i = 1; i <= numero; i++){
            if (i % 2 == 0){
                cantPares++;
            }
        }
        System.out.println("Cantidad de pares: " + cantPares);
        
    }
    
}
