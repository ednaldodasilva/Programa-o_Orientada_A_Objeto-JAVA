package main;

//@author Ednaldo Júnior

//Classe Veiculo(superclasse.
class Veiculo {

    String marca;
    String modelo;
    int ano;

    void acelerar() {
        System.out.println("Veiculo acelerando...");

    }

    void frear() {
        System.out.println("Veiculo freando...");

    }
}

//Classe Carro (subclasse).
class Carro extends Veiculo {

    int numPortas;

    void abrirPorta() {
        System.out.println("Porta aberta.");
    }
}

//Classe Moto(subclasse).
class Moto extends Veiculo {

    int cilindradas;

    void empinar() {
        System.out.println("Moto empinando...");

    }
}
