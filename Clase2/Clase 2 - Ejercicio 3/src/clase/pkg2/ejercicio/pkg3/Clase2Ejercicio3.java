/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase.pkg2.ejercicio.pkg3;

import java.util.Scanner;

/**
 *
 * @author Estéfano
 */
public class Clase2Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean registrado = false;
        CuentaBancaria cuenta = new CuentaBancaria();
        
        if (!registrado){
            System.out.println("Cree una cuenta\nIngrese el nombre del titular:");
            String nombreTitular = sc.nextLine();
            System.out.println("Ingrese el saldo inicial:");
            int saldoInicial = Integer.parseInt(sc.nextLine());
            while (saldoInicial < 0) {                
                System.out.println("el saldo inicial debe ser mayor a 0:");
                saldoInicial = Integer.parseInt(sc.nextLine());
            }
            cuenta.nombreTitular = nombreTitular;
            cuenta.dineroActual = saldoInicial;
            
            System.out.println("Cuenta creada!");
        }
        
        boolean menu = true;
        int opcion = 0;
        while (menu) {
            System.out.println("¿Que quiere hacer?\n\n1-Depositar dinero\n2-Retirar dinero\n3-Mostrar informacion de la cuenta\n4-Salir del programa");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    System.out.println("¿Cuanto dinero quiere ingresar?");
                    int dineroNuevo = Integer.parseInt(sc.nextLine());
                    cuenta.depositarDinero(dineroNuevo);
                    break;
                case 2:
                    System.out.println("¿Cuanto dinero quiere retirar?");
                    int dineroRetirado = Integer.parseInt(sc.nextLine());
                    cuenta.retirarDinero(dineroRetirado);
                    break;
                case 3:
                    cuenta.mostrarInfo();
                    break;
                case 4:
                    System.out.println("Cantidad de operaciones: " + cuenta.operaciones);
                    menu = false;
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
            }
        }
        
        
        
    }
    
}
