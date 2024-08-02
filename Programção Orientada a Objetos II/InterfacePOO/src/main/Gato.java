//@author Ednaldo Júnior
package main;

//Implementação da classe Gato que implementa a interface Animal
class Gato implements Animal {

    @Override
    public void emitirSom() {
        System.out.println("O gato faz: Miau!");
    }
}
