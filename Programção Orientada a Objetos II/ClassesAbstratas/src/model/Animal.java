//@author Ednaldo Júnior

package model;

//Classe Abstrata
public abstract class Animal {

    public abstract void fazerSom();

    public void dormir() {
        System.out.println("O animal está dormindo!");
    }
}
