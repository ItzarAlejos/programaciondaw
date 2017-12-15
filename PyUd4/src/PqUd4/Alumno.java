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
public class Alumno {
    
    //Atributos
    
    int edad;
    String ciudad = "Vila-Real";
    String nombre;
    String apellidos;
    int anyoNacim;
    int numIdent;
    String grupo = "DAW1T";
    double notaEvaluacion1;
    double notaEvaluacion2;
    double notaEvaluacion3;
    
    //Metodo
    
    String getGrupo(){
        return grupo;
    }
    
    double getNota1(){
        
        return this.notaEvaluacion1;
    }
    
    double getNota2(){
        
        return this.notaEvaluacion2;
    }
    
    double getNota3(){
        
        return this.notaEvaluacion3;
    }
    
    void setNombreParam(String pNombre){
            this.nombre = pNombre;
    }
    
    void setAnyoNacimiento(int anyoNac){
        
        
        this.anyoNacim = anyoNac;
    }
    
    void setEdad(int pEdad){
        
        this.edad = pEdad;
    }
    
    int calculaEdad(int pEdad){
        int age;
        age = (pEdad - this.edad);
        return age;
    }
    
    
}
