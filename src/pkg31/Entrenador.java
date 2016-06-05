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

public class Entrenador extends SeleccionFutbol{
    
    private int idFederacion;
    
    public void planificarEntrenamiento(){
        
        
        
    }

    public Entrenador( int id,int idFederacion, int edad, String nombre, String apellido) {
        super(id, nombre, apellido, edad);
        this.idFederacion = idFederacion;
    }

    @Override
    public String toString() {
        return "Entrenador : "+super.toString() + " id Federacion = " + idFederacion;
    }
    
    
}
