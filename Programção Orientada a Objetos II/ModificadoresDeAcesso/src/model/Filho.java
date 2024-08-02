package model;
//@author Ednaldo Júnior

import main.Pai;


public class Filho extends Pai {

    public void mostrarNumeroProtegido() {
        System.out.println(numeroProtegido); // Acesso permitido

    }
}