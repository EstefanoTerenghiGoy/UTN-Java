/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.pkg2.ejercicio.pkg2;

/**
 *
 * @author Estéfano
 */
public class Serie {
    String titulo;
    int cantTemporadas;
    boolean terminada;
    
    public void mostrarInfo(){
        if (terminada){
            System.out.println("La serie " + titulo + " tiene " + cantTemporadas + " temporadas y ya terminó."); 
        } else {
            System.out.println("La serie " + titulo + " tiene " + cantTemporadas + " temporadas y sigue en emisión."); 
        }
        
    }}
