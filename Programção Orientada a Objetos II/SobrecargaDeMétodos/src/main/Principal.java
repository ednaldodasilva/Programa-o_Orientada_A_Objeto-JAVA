package main;

import model.ExemploDeSobrecargaDeM�todos;



public class Principal {
    public static void main(String[] args) {
        
        ExemploDeSobrecargaDeM�todos calcular = new ExemploDeSobrecargaDeM�todos();
        
        //Chamando os diferentes m�todos de soma.
        System.out.println("Soma de 2 e 3: " + calcular.somar(2, 3));
        System.out.println("Soma de 2, 3 e 4: " + calcular.somar(2, 3, 4));
        System.out.println("Soma de 2.5 e 3.7: " + calcular.somar(2.5, 3.7));
        
    }  
}
