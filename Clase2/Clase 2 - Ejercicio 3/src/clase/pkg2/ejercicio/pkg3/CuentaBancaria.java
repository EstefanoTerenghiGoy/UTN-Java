/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.pkg2.ejercicio.pkg3;

/**
 *
 * @author Estéfano
 */
public class CuentaBancaria {
    String nombreTitular;
    int dineroActual;
    static int operaciones;
    
    public void depositarDinero(int dineroNuevo){
        dineroActual += dineroNuevo;
        operaciones++;
    }
    public void retirarDinero(int dineroRetirado){
        dineroActual -= dineroRetirado;
        operaciones++;
    }
    public void mostrarInfo(){
        System.out.println("La cuenta de " + nombreTitular + " tiene un saldo de " + dineroActual);
        operaciones++;
    }
    
}
