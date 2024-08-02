package main;

import model.ExemploDeM�todosEst�ticos;

//@author Ednaldo J�nior

public class Principal {
    
    public static void main(String[] args) {
        
        // Criando inst�ncias da classe.
        ExemploDeM�todosEst�ticos Objeto1 = new ExemploDeM�todosEst�ticos("Objeto 1");
        ExemploDeM�todosEst�ticos Objeto2 = new ExemploDeM�todosEst�ticos("Objeto 2");
        ExemploDeM�todosEst�ticos Objeto3 = new ExemploDeM�todosEst�ticos("Objeto 3");
        
        // Chamando o m�todo est�tico para obter o n�mero de inst�ncias criadas.
        System.out.println("N�mero total de inst�ncias criadas: " + ExemploDeM�todosEst�ticos.getContador());
        
        // Chamando o m�todo n�o est�tico para obter o nome de um objeto espec�fico.
        System.out.println("Nome do objeto 2: " + Objeto2.getNome());
        
    }
    
}
