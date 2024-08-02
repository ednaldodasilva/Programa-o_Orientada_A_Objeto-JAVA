package main;

import model.ExemploDeMétodosEstáticos;

//@author Ednaldo Júnior

public class Principal {
    
    public static void main(String[] args) {
        
        // Criando instâncias da classe.
        ExemploDeMétodosEstáticos Objeto1 = new ExemploDeMétodosEstáticos("Objeto 1");
        ExemploDeMétodosEstáticos Objeto2 = new ExemploDeMétodosEstáticos("Objeto 2");
        ExemploDeMétodosEstáticos Objeto3 = new ExemploDeMétodosEstáticos("Objeto 3");
        
        // Chamando o método estático para obter o número de instâncias criadas.
        System.out.println("Número total de instâncias criadas: " + ExemploDeMétodosEstáticos.getContador());
        
        // Chamando o método não estático para obter o nome de um objeto específico.
        System.out.println("Nome do objeto 2: " + Objeto2.getNome());
        
    }
    
}
