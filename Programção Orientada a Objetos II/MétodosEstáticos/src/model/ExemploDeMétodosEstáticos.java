package model;

//@author Ednaldo Júnior

public class ExemploDeMétodosEstáticos {
    private static int contador = 0; // Variável estática para contar o número de instâncias da classe.
    
    private String nome;
    
    //Construtor da classe.
    public ExemploDeMétodosEstáticos(String nome){
        this.nome = nome;
        contador++; // Incrementando o contador toda vez que um objeto é criado
        
    }
    
    // Método estático para obter o número de instâncias criadas.
    public static int getContador(){
        return contador;
        
    }
    
    // Método não estático para obter o nome do objeto.
    public String getNome(){
        return nome;
        
    } 
    
}
