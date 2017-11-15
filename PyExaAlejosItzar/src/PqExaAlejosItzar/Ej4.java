/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PqExaAlejosItzar;


public class Ej4 {

    public static void main(String[] args) {
        
        int numAleatorio=0, numTres=0, numCuatro=0, contador=0, parche=0, sumatorio=0;  /*Creo las variables */
        double media;
        
        while(parche==0)
        {
            numAleatorio = (int)(Math.random()*10);  /*Creo el valor aleatorio*/
            System.out.println("Nº: " + numAleatorio); /*Muestro el valor*/
            
            
            if (numAleatorio == 3) {
            
            numTres = numTres +3; /*Si es tres le sumo 3*/
            
            }
        
            if (numAleatorio == 4) {
            
            numCuatro = numCuatro +4; /*Si es cuatro le sumo 4*/
            
            }
            
            if ((numTres==9)||(numCuatro==16)) {
                
                parche = 1;             /*Si numTres es 9 o numCuatro es 16 sale del while*/
                
            }
            
            sumatorio = sumatorio + numAleatorio; /*Suma todos los numeros aleatorios*/
            contador = contador + 1; /*Cuenta cada vuelta*/
        }
        if (numTres == 9) {
            System.out.println("Salió por triple"); /*Si ha echo 3 veces 3 dice "salio por triple"*/
            
        }
        media = (int) (sumatorio/numAleatorio); /*Hace la media*/
        System.out.print("La media de los " + contador); /*No me acordava bien de hacer el printf pero el resultado me sale bien*/
        System.out.printf(" números visualizados es %.2f",media); /*Y lo visualizamos todo*/
        System.out.println("");
        
        
        
        
        




    }

}
