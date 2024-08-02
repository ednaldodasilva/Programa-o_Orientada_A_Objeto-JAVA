//@author Ednaldo Júnior
package main;

//Implementação da classe cachorro que implementa a interface Animal
class Cachorro implements Animal {

    @Override
    public void emitirSom() {
        System.out.println("O cachorro faz: Au au!");
    }
}
