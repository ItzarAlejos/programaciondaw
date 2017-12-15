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
public class Participante {
    
    //Atributos
    
    String nombre;
    String apellidos;
    int anyoNacimiento;
    String codigoIdent;
    
    //Metodo
    
    void setNombre(){
        this.nombre = "Tiriti Trump Caghaner";
        
    }
    
    String getNombre(){
 
        return this.nombre; 
    }
    
    void visualizarNombre(){
        System.out.println("El nombre no es Pyongyang, es " + this.getNombre());
    }
    
    
}
