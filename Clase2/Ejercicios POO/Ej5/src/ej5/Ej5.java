/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej5;

/**
 *
 * @author Estéfano
 */
public class Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sesion.mostrarEstado();
        Sesion.login("EstefanoTG");
        Sesion.mostrarEstado();
        Sesion.logout();
        Sesion.mostrarEstado();
    }
    
}
