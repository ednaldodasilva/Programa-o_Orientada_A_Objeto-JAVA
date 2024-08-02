//@author Ednaldo Júnior

package main;

import model.Animal;
import model.Cachorro;
import model.Gato;

public class Principal {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();
        
        cachorro.fazerSom(); //Saída: Cachorro late
        gato.fazerSom(); //Saída: Gato mia
        
        cachorro.dormir(); //Saída: Animal está dormindo
        gato.dormir(); //Saída: Animal está dormindo
        
    }
}
