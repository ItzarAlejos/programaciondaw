/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PqUd4;


public class Ej4_10 {

    public static void main(String[] args) {
        double auxiliar1, auxiliar2, auxiliar3;
        Alumno al1, al2;
        al1 = new Alumno();
        al2 = new Alumno();
        
        al1.notaEvaluacion1 = 10;
        al1.notaEvaluacion2 = 5;
        al1.notaEvaluacion3 = 7;
        
        System.out.println("Las notas del 1º alumno son "
                + "respectivamente: " + al1.getNota1() + ", " + al1.getNota2() + ", "
                + al1.getNota3() + ".");
        
        
        
        al2.notaEvaluacion1 = 4;
        al2.notaEvaluacion2 = 5;
        al2.notaEvaluacion3 = 6;
        
        System.out.println("Las notas del 2º alumno son "
                + "respectivamente: " + al2.getNota1() + ", " + al2.getNota2() + ", "
                + al2.getNota3() + ".");
        
        
        
        System.out.println("\n Cambio... \n");
        
        
        auxiliar1 = al1.notaEvaluacion1;
        auxiliar2 = al1.notaEvaluacion2;
        auxiliar3 = al1.notaEvaluacion3;
        
        al1.notaEvaluacion1 = al2.getNota1();
        al1.notaEvaluacion2 = al2.getNota2();
        al1.notaEvaluacion3 = al2.getNota3();
        
        al2.notaEvaluacion1 = auxiliar1;
        al2.notaEvaluacion2 = auxiliar2;
        al2.notaEvaluacion3 = auxiliar3;
        
        
        System.out.println("Las notas del 1º alumno son "
                + "respectivamente: " + al1.getNota1() + ", " + al1.getNota2() + ", "
                + al1.getNota3() + ".");
        
        System.out.println("Las notas del 2º alumno son "
                + "respectivamente: " + al2.getNota1() + ", " + al2.getNota2() + ", "
                + al2.getNota3() + ".");
        


        al1.setNombreParam("Cornelio");
        
        System.out.println(al1.nombre);



    }

}
