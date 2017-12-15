/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PqUd4;

import java.util.Scanner;


public class Ej4_9 {

    public static void main(String[] args) {
        Scanner tuberia = new Scanner(System.in);

        
        int repostaje, depAuxiliar=0;
        Deposito dep1, dep2;
        
        dep1 = new Deposito();
        dep2 = new Deposito();
        
        
        dep1.abierto = false;
        dep1.capacidadMaxima = 1200;
        dep1.codigo = "ABCDEF";
        
        dep2.abierto = false;
        dep2.capacidadMaxima = 3000;
        dep2.codigo = "GHIJKL";
        
        
        dep1.abreDeposito();
        depAuxiliar = dep1.getCantidad();
        
        do {
            System.out.println("1er Depósito. Introduce cuánto quieres repostar: ");
            repostaje = tuberia.nextInt();
            depAuxiliar = (depAuxiliar + repostaje);
            
        } while ((depAuxiliar<dep1.capacidadMaxima));
        
        System.out.println("El 1º deposito se ha quedado con: " + dep1.getCantidad());
        
        
        





    }

}
