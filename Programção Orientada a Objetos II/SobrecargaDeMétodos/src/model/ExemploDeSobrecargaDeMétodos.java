package model;

 //@author Ednaldo Júnior
 
public class ExemploDeSobrecargaDeMétodos {
    
    //Método sobrecarregado para somar dois inteiros.
    public int somar(int a, int b){
      return a + b;  
        
    }
    
    //Método sobrecarregado para somar três inteiros.
    public int somar(int a, int b, int c){
        return a + b + c;
        
    }
    
    //Método sobrecarregado para somar dois números decimais.
    public double somar(double a, double b){
        return a + b;
        
    }    
}
