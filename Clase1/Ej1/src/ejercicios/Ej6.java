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
public class Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una hora (0-23): ");
        int hora = Integer.parseInt(sc.nextLine());
        
        if (hora >= 6 && hora <= 12){
            System.out.println("Buenos dias");
        } else if (hora >= 13 && hora <= 20){
            System.out.println("Buenas tardes");
        } else if (hora >= 1 && hora <= 23){
            System.out.println("Buenas noches");
        } else {
            System.out.println("Numero invalido");
        }
        
    }
    
}
