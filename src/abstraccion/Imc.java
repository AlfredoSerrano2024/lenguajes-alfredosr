/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccion;

/**
 *
 * @author T-107
 */
public class Imc {
    float peso;
    float altura;
    private boolean flaco;
    public void setFlaco(boolean flaco){
        this.flaco=flaco;
    }
    public boolean getFlaco(){
        return flaco;
    }
    
    public Imc(float p, float a){
        peso=p;
        altura=a;        
    }
    
    public String calcular(){
       float imc=peso/(altura*altura);
       return "Tu imc es;"+imc;   
      }
    }
    
