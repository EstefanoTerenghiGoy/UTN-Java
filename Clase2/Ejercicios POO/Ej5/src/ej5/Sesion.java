/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej5;

/**
 *
 * @author Estéfano
 */
public class Sesion {
    static String usuarioLogueado;
    
    static void login(String usuario){
        usuarioLogueado = usuario;
    }
    static void logout(){
        usuarioLogueado = null;
    }
    static void mostrarEstado(){
        System.out.println(usuarioLogueado);
    }
}
