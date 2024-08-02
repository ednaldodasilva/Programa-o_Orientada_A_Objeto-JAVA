package model;

//@author Ednaldo Júnior

public class ExemploDeConstrutores {
    private int valor;
    
    //Construtor padrão.
    public ExemploDeConstrutores(){
        //Chamada para o construtor com um argumento.
        this(0);//Chama o construtor com um argumento, passando 0 como valor padrão.
        
    }
    
    //Construtor com um argumento.
    public ExemploDeConstrutores(int valor){
        this.valor = valor;
        
    }
    
    //Outros métodos da classe.
    public int getValor(){
        return valor;
        
    }
}
