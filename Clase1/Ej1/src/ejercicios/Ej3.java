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
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int firstNum = Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese el segundo numero");
        int secondNum = Integer.parseInt(sc.nextLine());
        
        if (firstNum % secondNum == 0){ //Falla si se pone 0 como segundo numero!
            System.out.println(firstNum + " es multiplo de " + secondNum);
        } else {
            System.out.println(firstNum + " no es multiplo de " + secondNum);
        }
        
        
        
    }
    
}
