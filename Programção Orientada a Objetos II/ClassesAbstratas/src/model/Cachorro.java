//@author Ednaldo J�nior

package model;

//Subclasse concreta
public class Cachorro extends Animal {

    @Override
    public void fazerSom() {
        System.out.println("O cachorro late!");
    }
}
