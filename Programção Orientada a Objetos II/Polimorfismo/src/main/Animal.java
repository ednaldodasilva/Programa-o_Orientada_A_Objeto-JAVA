package main;

//@author Ednaldo J�nior

class Animal {
    
    // Classe base Animal.
    public void emitirSom(){
        System.out.println("Som generico de animal!");
    } 
}

// Subclasse Cachorro.
class Cachorro extends Animal{
    
    // Sobrescrevendo o m�todo emitirSom da classe Animal.
    @Override
    public void emitirSom(){
        System.out.println("Au Au!");
    }
}

// Subclasse Gato.
class Gato extends Animal{
    
    // Sobrescrevendo o m�todo emitirSom da classe Animal.
    @Override
    public void emitirSom(){
        System.out.println("Miau Miau!");
    }   
}

// Subclasse Vaca.
class Vaca extends Animal{
    
    // Sobrescrevendo o m�todo emitirSom da classe Animal.
    @Override
    public void emitirSom(){
        System.out.println("Muu muu!");
    }
}