//@author Ednaldo Júnior

/*Na programação orientada a objetos, uma instância de classe é um objeto que é criado a partir de 
uma classe, seguindo o modelo definido pela classe. Uma classe é basicamente um modelo ou uma 
estrutura que define o comportamento e as propriedades dos objetos que serão criados a partir 
dela.
 */
package main;

//Classe principal para testar a criação de instâncias
public class Principal {

    public static void main(String[] args) {
        //Criando uma instância da classe "Carro"
        Carro meuCarro = new Carro();

        //Adicionando atributos á instâncias
        meuCarro.marca = "Toyota";
        meuCarro.modelo = "Corolla";
        meuCarro.cor = "Prata";
        meuCarro.velocidade = 0;

        //Acessando os atributos da instância
        System.out.println("Marca: " + meuCarro.marca);
        System.out.println("Modelo: " + meuCarro.modelo);
        System.out.println("Cor: " + meuCarro.cor);

        //Alterando a velocidade do carro diretamente
        meuCarro.velocidade = 50;
        System.out.println("Velocidade atual: " + meuCarro.velocidade);
    }
}

/*Neste exemplo, a classe Carro é definida com quatro atributos: marca, modelo, cor e 
velocidade. Na classe Main, criamos uma instância de Carro chamada
 */
