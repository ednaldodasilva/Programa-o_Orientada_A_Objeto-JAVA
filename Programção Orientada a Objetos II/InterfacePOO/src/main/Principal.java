//@author Ednaldo J�nior
package main;

public class Principal {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();
        
        cachorro.emitirSom(); //Sa�da: O cachorro faz: Au Au!
        gato.emitirSom(); //Sa�da: O gato faz: Miau!
        
    }
}
