/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkedexcepcions;

/**
 *
 * @author T-107
 */
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ProbarChecked {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
            throws IOException,FileNotFoundException{
        File f=new File("archivaldo");
        
            FileOutputStream fos=new FileOutputStream(f);
            ObjectOutputStream oos=new ObjectOutputStream(fos);
        } 
    
   }



