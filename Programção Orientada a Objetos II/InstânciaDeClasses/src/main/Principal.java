//@author Ednaldo J�nior

/*Na programa��o orientada a objetos, uma inst�ncia de classe � um objeto que � criado a partir de 
uma classe, seguindo o modelo definido pela classe. Uma classe � basicamente um modelo ou uma 
estrutura que define o comportamento e as propriedades dos objetos que ser�o criados a partir 
dela.
 */
package main;

//Classe principal para testar a cria��o de inst�ncias
public class Principal {

    public static void main(String[] args) {
        //Criando uma inst�ncia da classe "Carro"
        Carro meuCarro = new Carro();

        //Adicionando atributos � inst�ncias
        meuCarro.marca = "Toyota";
        meuCarro.modelo = "Corolla";
        meuCarro.cor = "Prata";
        meuCarro.velocidade = 0;

        //Acessando os atributos da inst�ncia
        System.out.println("Marca: " + meuCarro.marca);
        System.out.println("Modelo: " + meuCarro.modelo);
        System.out.println("Cor: " + meuCarro.cor);

        //Alterando a velocidade do carro diretamente
        meuCarro.velocidade = 50;
        System.out.println("Velocidade atual: " + meuCarro.velocidade);
    }
}

/*Neste exemplo, a classe Carro � definida com quatro atributos: marca, modelo, cor e 
velocidade. Na classe Main, criamos uma inst�ncia de Carro chamada
 */
