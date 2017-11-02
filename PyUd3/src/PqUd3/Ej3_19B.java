/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PqUd3;


public class Ej3_19B {
    
    public enum mesesAnyo {Enero, Febrero, Marzo, Abril, Mayo, Junio, Julio, Agosto, Septiembre, Octubre, Noviembre, Diciembre}

    public static void main(String[] args) {

        int dias;
        
        mesesAnyo mes;
        
        mes = mesesAnyo.Octubre;
        
        switch(mes)
        {
            case Abril: case Junio: case Septiembre: case Noviembre:
            {
                dias = 30;
                break;
            }
            case Febrero:
            {
                dias = 28;
                break;
            }
            case Enero: case Marzo: case Mayo: case Julio: case Agosto: case Octubre: case Diciembre:
            {
                dias = 31;
                break;
            }
        }
        
        System.out.println();

    }

}
