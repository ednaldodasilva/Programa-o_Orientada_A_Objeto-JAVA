//@author Ednaldo J�nior

package main;

import model.Animal;
import model.Cachorro;
import model.Gato;

public class Principal {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();
        
        cachorro.fazerSom(); //Sa�da: Cachorro late
        gato.fazerSom(); //Sa�da: Gato mia
        
        cachorro.dormir(); //Sa�da: Animal est� dormindo
        gato.dormir(); //Sa�da: Animal est� dormindo
        
    }
}
