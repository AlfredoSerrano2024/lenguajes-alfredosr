/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimeraexception;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T-107
 */
public class ProbarValidaziones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int edad=23;
       System.out.println("VAMOS A VALIDAR TU EDAD");
        try {
            
            ValidarEdad.validar(edad);
            System.out.println("SI TU TE VES NO SE LANZO LA EXCEPCION");
            
        } catch (MenordeEdadException ex) {
            System.out.println(ex.getMessage());
        } catch (NumberFormatException ex){
            System.out.println("Metiste letras y no numeros TONTO");
        }
    }
    
}
