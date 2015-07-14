/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectios;
import java.util.*;

/**
 *
 * @author T-107
 */
public class ProbraArreglos {
    
    public static void main(String[] args) {
        //SE INVOCA EL CONSTRUCTOR DE LA CLASE GENERADOR DE :
       GeneradordeUsuario generadora=new GeneradordeUsuario();
       //agregar usuario vamos a invocarlo
       generadora.agregarUsuario("chana", 18, "chana@hotmail.com");
        ArrayList<Usuario> usuarios=(ArrayList<Usuario>) generadora.getUsuario();
                         System.out.println(usuarios.size());
      //ciclo for mejorado:
       for(Usuario u:usuarios) {
           System.out.println(u.getNombre()+"edad:"+u.getEdad()+"email:"+u.getEmail());
       }                        
        
    }
    
}
