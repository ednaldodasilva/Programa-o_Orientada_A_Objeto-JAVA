//@author Ednaldo J�nior

/*Em programa��o orientada a objetos, exce��es s�o eventos anormais que ocorrem durante a 
execu��o de um programa e interrompem o fluxo normal de execu��o. Essas exce��es podem ser 
causadas por diversos motivos, como erros de sintaxe, erros de l�gica, opera��es ilegais, condi��es 
inesperadas, entre outros.

O tratamento de exce��es em programa��o orientada a objetos geralmente envolve o uso de blocos 
try-catch. Um bloco try � usado para envolver o c�digo que pode gerar uma exce��o, enquanto um 
bloco catch � usado para capturar e lidar com a exce��o caso ela ocorra. Al�m disso, � poss�vel 
utilizar blocos finally para garantir que determinadas a��es sejam executadas independentemente 
de uma exce��o ocorrer ou n�o.
*/

package main;

public class ExcecoesExemplo {
    public static void main(String[] args) {
        try{
            int[] array = new int[5];
            System.out.println(array[10]); //Acessando um �ndice inv�lido
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exce��o capturada: �ndice foira dos limites do array.");
        }finally{
            System.out.println("Bloco finally sendo executado.");
        }
    }
    
}

/*Neste exemplo, o programa tenta acessar um �ndice inv�lido em um array, o que resultaria em uma 
exce��o do tipo ArrayIndexOutOfBoundsException. Esse erro � capturado pelo bloco catch 
correspondente e uma mensagem apropriada � exibida. O bloco finally � executado 
independentemente da ocorr�ncia de uma exce��o, garantindo que certas a��es de limpeza ou 
finaliza��o de recursos sejam realizadas.

Em resumo, exce��es em programa��o orientada a objetos fornecem um mecanismo robusto para 
lidar com situa��es inesperadas durante a execu��o de um programa, permitindo que o c�digo trate 
esses erros de forma adequada e mantenha a integridade e estabilidade do sistema.
*/