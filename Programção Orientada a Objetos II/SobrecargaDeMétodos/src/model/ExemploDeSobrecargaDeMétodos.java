package model;

 //@author Ednaldo J�nior
 
public class ExemploDeSobrecargaDeM�todos {
    
    //M�todo sobrecarregado para somar dois inteiros.
    public int somar(int a, int b){
      return a + b;  
        
    }
    
    //M�todo sobrecarregado para somar tr�s inteiros.
    public int somar(int a, int b, int c){
        return a + b + c;
        
    }
    
    //M�todo sobrecarregado para somar dois n�meros decimais.
    public double somar(double a, double b){
        return a + b;
        
    }    
}
