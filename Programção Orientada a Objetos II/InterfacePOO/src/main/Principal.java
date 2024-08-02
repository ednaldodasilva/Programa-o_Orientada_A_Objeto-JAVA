//@author Ednaldo Júnior
package main;

public class Principal {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();
        
        cachorro.emitirSom(); //Saída: O cachorro faz: Au Au!
        gato.emitirSom(); //Saída: O gato faz: Miau!
        
    }
}
