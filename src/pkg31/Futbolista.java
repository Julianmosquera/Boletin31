/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg31;

/**
 *
 * @author julian
 */

    public class Futbolista extends SeleccionFutbol{
    
    private int dorsal;
    private String demarcacion;
    
    
    
    
         public Futbolista(int id,int dorsal, String demarcacion, int edad, String nombre, String apellido) {
        super(id, nombre, apellido, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }
         
    public void entrevista(){
       } 

    
}
