package model;

//@author Ednaldo J�nior

public class ExemploDeM�todosEst�ticos {
    private static int contador = 0; // Vari�vel est�tica para contar o n�mero de inst�ncias da classe.
    
    private String nome;
    
    //Construtor da classe.
    public ExemploDeM�todosEst�ticos(String nome){
        this.nome = nome;
        contador++; // Incrementando o contador toda vez que um objeto � criado
        
    }
    
    // M�todo est�tico para obter o n�mero de inst�ncias criadas.
    public static int getContador(){
        return contador;
        
    }
    
    // M�todo n�o est�tico para obter o nome do objeto.
    public String getNome(){
        return nome;
        
    } 
    
}
