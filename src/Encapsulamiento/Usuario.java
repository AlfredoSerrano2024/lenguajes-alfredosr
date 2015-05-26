/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulamiento;

/**
 *
 * @author T-107
 */
public class Usuario {
    //primwer regal del encapsulamiento "private"
    private String nombre;
    private int edad;
    
    //segunda regla metodo "mutador"
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void setEdad(int edad){
        this.edad=edad;
    }
    //tercera regla
    public  String getNombre(){
            return nombre;
            
    }    
    
    public int getEdad(){
        return edad;
        
    }
}
