//@author Ednaldo J�nior
package main;

//Implementa��o da classe Gato que implementa a interface Animal
class Gato implements Animal {

    @Override
    public void emitirSom() {
        System.out.println("O gato faz: Miau!");
    }
}
