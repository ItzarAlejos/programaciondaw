/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PqUd4;

import java.util.Scanner;

/**
 *
 * @author daw1
 */
public class Maquinita {
    Scanner tuberia = new Scanner(System.in);
    
    //Atributos
    
    int codigo;
    int memoria;
    boolean actualizable;
    
    //Metodos
    
    void setCodigo(){
        
        System.out.print("Introduzca código: ");
        this.codigo = tuberia.nextInt(); 
       
    }
    
    void setMemoria(){
        
        System.out.print("Introduzca memoria: ");
        this.memoria = tuberia.nextInt();
        
    }
    
    void setActualizable(){
        
        System.out.print("Introduzca si es actualizable (true/false): ");
        this.actualizable = tuberia.nextBoolean();
        
        
    }
    
    int getCodigo(){
        
        return this.codigo;
    }
    
    int getMemoria(){
        return this.memoria;
    }
    
    boolean getActualizable(){
        return this.actualizable;
    }
    
    
    
    void visualizaDatos(){
        String rdo;
        rdo = "La maquinita de código " + this.getCodigo() + ", con una memoria de " 
                + this.getMemoria() + "Mb ";
        if (this.getActualizable() == true) {
            rdo = rdo + "sí";
            
        }else{
            rdo = rdo + "no";
        }
        
        rdo =  rdo  + " es actualizable";
        System.out.println(rdo);
    }
    
    String getSerieMem(){
        String cad;
        cad = ""; 
        
        for (int k = 0; k <= this.getMemoria(); k = k + 6) {
            cad = cad + (k + " - ");
            
        }
        
        System.out.println(cad);
        return cad;
    }    
    
    void incrementMem(){
        
        int incremento=0;
        
        
        
        do {
            this.memoria = this.getMemoria() + incremento;
            System.out.println("¿En cuanto desea incrementar la memoria?");
            incremento = tuberia.nextInt();
        } while (incremento >=0);

//    while(incremento > 0){
//        System.out.println("¿En cuanto desea incrementar la memoria?");
//        incremento = tuberia.nextInt();
//        this.memoria = this.getMemoria() + incremento;
//        System.out.println("La memoria esta en : " + this.memoria);
//        
//    }
               
    }
    
    
    
}
