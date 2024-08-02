package main;

//@author Ednaldo J�nior

// Classe principal para demonstrar polimorfismo
public class PolimorfismoExemplo {
    public static void main(String[] args) {
        
        //// Criando inst�ncias de cada animal.
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();
        Animal vaca = new Vaca();
        
        
        cachorro.emitirSom();
        gato.emitirSom();
        vaca.emitirSom();
        
    }
}
