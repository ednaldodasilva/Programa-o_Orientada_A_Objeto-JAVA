//@author Ednaldo J�nior

/*Em programa��o orientada a objetos, as classes aninhadas (tamb�m conhecidas como classes 
internas ou classes aninhadas) referem-se � pr�tica de definir uma classe dentro de outra classe. 
Isso � �til quando uma classe est� intimamente relacionada � outra e n�o faz sentido us�-la em nenhum 
outro lugar. Existem basicamente dois tipos de classes aninhadas: classes est�ticas aninhadas (ou 
classes internas est�ticas) e classes n�o est�ticas aninhadas (ou classes internas n�o est�ticas).

Aqui est� um exemplo em Java para ilustrar ambos os tipos de classes aninhadas:
 */
package main;

public class OuterClass {

    private int outerField;

//Classe interna n�o est�tica
    class InnerClass {

        void display() {
            System.out.println("Valor do campo externo: " + outerField);
        }
    }

//Classe interna est�tica
    static class StaticInnerClass {

        void display() {
            System.out.println("Isso � uma classe interna est�tica.");
        }
    }

    public static void main(String[] args) {
        //Criando inst�ncia da classe externa
        OuterClass outer = new OuterClass();
        outer.outerField = 10;

        //Criando inst�ncia da classe interna n�o est�tica
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display();

        //Criando inst�ncia da classe interna est�tica
        OuterClass.StaticInnerClass staticInner = new OuterClass.StaticInnerClass();
        staticInner.display();
    }
}

/*Neste exemplo, InnerClass � uma classe interna n�o est�tica, o que significa que cada inst�ncia de 
InnerClass � associada a uma inst�ncia espec�fica da classe externa OuterClass. Por outro lado, 
StaticInnerClass � uma classe interna est�tica, o que significa que pode ser instanciada sem uma 
inst�ncia espec�fica da classe externa.

Classes aninhadas podem ser �teis para melhorar a encapsula��o, modularidade e organiza��o do 
c�digo, especialmente quando h� uma rela��o estreita entre as classes. No entanto, � importante 
usar classes aninhadas com modera��o, pois um uso excessivo delas pode tornar o c�digo mais 
dif�cil de entender e dar manuten��o.
 */
