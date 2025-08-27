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
public class Ej9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese una letra");
        String letra = sc.nextLine().toLowerCase();
        
        switch (letra) {
            case "a", "e", "i", "o", "u":
                System.out.println("Es vocal");
                break;
            default:
                System.out.println("Es consonante");
                break;
        }
    }
    
}
