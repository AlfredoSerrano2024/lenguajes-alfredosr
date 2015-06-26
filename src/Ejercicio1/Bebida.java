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
class Bebida {
    private String tipo;
    private String [] bebidas;
    
    public String [] obtenerRecomendaciones(){ 
        if(tipo.equals("alcoholicas")){
        String []alcohol={"cervesza sol","cerveza indio","whisky","pulque","tonaya"};
    return alcohol;
        }else{
        String []sinalcohol={"agua","coca","pepsi","mineral","redbull"};
    return sinalcohol;
}
    }



    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String[] getBebidas() {
        return bebidas;
    }

    public void setBebidas(String[] bebidas) {
        this.bebidas = bebidas;
    }
    
    
    
    
    
}
