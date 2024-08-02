package model;

//@author Ednaldo J�nior

public class ExemploDeConstrutores {
    private int valor;
    
    //Construtor padr�o.
    public ExemploDeConstrutores(){
        //Chamada para o construtor com um argumento.
        this(0);//Chama o construtor com um argumento, passando 0 como valor padr�o.
        
    }
    
    //Construtor com um argumento.
    public ExemploDeConstrutores(int valor){
        this.valor = valor;
        
    }
    
    //Outros m�todos da classe.
    public int getValor(){
        return valor;
        
    }
}
