//@author Ednaldo Júnior

/*Em programação orientada a objetos, as classes aninhadas (também conhecidas como classes 
internas ou classes aninhadas) referem-se à prática de definir uma classe dentro de outra classe. 
Isso é útil quando uma classe está intimamente relacionada à outra e não faz sentido usá-la em nenhum 
outro lugar. Existem basicamente dois tipos de classes aninhadas: classes estáticas aninhadas (ou 
classes internas estáticas) e classes não estáticas aninhadas (ou classes internas não estáticas).

Aqui está um exemplo em Java para ilustrar ambos os tipos de classes aninhadas:
 */
package main;

public class OuterClass {

    private int outerField;

//Classe interna não estática
    class InnerClass {

        void display() {
            System.out.println("Valor do campo externo: " + outerField);
        }
    }

//Classe interna estática
    static class StaticInnerClass {

        void display() {
            System.out.println("Isso é uma classe interna estática.");
        }
    }

    public static void main(String[] args) {
        //Criando instância da classe externa
        OuterClass outer = new OuterClass();
        outer.outerField = 10;

        //Criando instância da classe interna não estática
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display();

        //Criando instância da classe interna estática
        OuterClass.StaticInnerClass staticInner = new OuterClass.StaticInnerClass();
        staticInner.display();
    }
}

/*Neste exemplo, InnerClass é uma classe interna não estática, o que significa que cada instância de 
InnerClass é associada a uma instância específica da classe externa OuterClass. Por outro lado, 
StaticInnerClass é uma classe interna estática, o que significa que pode ser instanciada sem uma 
instância específica da classe externa.

Classes aninhadas podem ser úteis para melhorar a encapsulação, modularidade e organização do 
código, especialmente quando há uma relação estreita entre as classes. No entanto, é importante 
usar classes aninhadas com moderação, pois um uso excessivo delas pode tornar o código mais 
difícil de entender e dar manutenção.
 */
