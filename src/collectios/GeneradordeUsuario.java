/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectios;

/**
 *
 * @author T-107
 */
import java.util.ArrayList;
import java.util.List;

public class GeneradordeUsuario {
    
    private List<Usuario> usuarios;
    
    //CONSTRUCTOR:
    public GeneradordeUsuario(){
        Usuario u1=new Usuario("juan", 42, "jc@hotmail.com");
        Usuario u2=new Usuario("Ana",22, "ana@gmail.com");
        Usuario u3=new Usuario("pedro", 33, "pedro@hotmail.com");
        Usuario u4=new Usuario("pancha", 63, "pancha@hotmail.com");
        
        //constructor de ArrayList:
        usuarios=new ArrayList<Usuario>();
        usuarios.add(u1);
        usuarios.add(u2);
        usuarios.add(u3);
        usuarios.add(u4);
    }
      //LO QUE VA A REGRESAR   
      public List<Usuario> getUsuario() {
          return usuarios;
      }
      
      public void setUsuarios(List<Usuario> usuario) {
          this.usuarios = usuarios;
      }
      
      //agregar otro usuario
      public String agregarUsuario(String nombre, int edad, String email){    
         Usuario u=new Usuario(nombre, edad, email);
         usuarios.add(u);
         return "usuario agregado con exito";
      }
}


