/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

/**
 *
 * @author T-107
 */
public class Antro {
    public static void main (String []a){
    Bebida bebida=new Bebida();
    bebida.setTipo("alcoholicas");
    String []reco= bebida.obtenerRecomendaciones();
    for(String be:reco){
    System.out.println("Bebida:"+be);
    }
}
    
}
