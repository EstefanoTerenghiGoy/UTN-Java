/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase.pkg2.ejercicio.pkg2;

import java.util.Scanner;

/**
 *
 * @author Estéfano
 */
public class Clase2Ejercicio2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Serie serie = new Serie();
        
        System.out.println("Ingrese el titulo de la serie:");
        String titulo = sc.nextLine();
        System.out.println("Ingrese la cantidad de temporadas:");
        int cantTemporadas = Integer.parseInt(sc.nextLine());
        System.out.println("Indique si la serie está o no terminada (true/false):");
        boolean terminada = sc.nextBoolean();
                
        serie.titulo = titulo;
        serie.cantTemporadas = cantTemporadas;
        serie.terminada = terminada;
        
        
        serie.mostrarInfo();
        
    }
    
}
