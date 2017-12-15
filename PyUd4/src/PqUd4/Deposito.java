/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PqUd4;


/**
 *
 * @author daw1
 */
public class Deposito {

    //Atributos
    
    String codigo;
    int cantidad = 100;
    int capacidadMaxima;
    boolean abierto;
    
    //Metodos
    
    String getCodigo(){
        
        
        return this.codigo;
    }
    
    void abreDeposito(){
        if (this.abierto == false) {
            
            this.abierto = true;
        }
    }
    
    int getCantidad(){
        
        return this.cantidad;
    }
    
    
}
