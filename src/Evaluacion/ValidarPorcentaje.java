/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Evaluacion;

/**
 *
 * @author T-107
 */

//Exepcion
public class ValidarPorcentaje extends Exception{
    public ValidarPorcentaje(){
        super ("Superas el 100%"+"vuelva a ingresar datos");
}
}