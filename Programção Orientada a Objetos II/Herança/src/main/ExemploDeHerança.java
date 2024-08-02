package main;

//@author Ednaldo Júnior

public class ExemploDeHerança{
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        
        carro1.marca = "Toyota";
        carro1.modelo = "Corolla";
        carro1.ano = 2020;
        carro1.numPortas = 4;
        
        Moto moto1 = new Moto();
        
        moto1.marca = "Honda";
        moto1.modelo = "CB300";
        moto1.ano = 2023;
        moto1.cilindradas = 600;
        
        System.out.println(carro1.marca);
        System.out.println(moto1.modelo);
        
        carro1.acelerar();
        moto1.empinar();
        
    }
}
