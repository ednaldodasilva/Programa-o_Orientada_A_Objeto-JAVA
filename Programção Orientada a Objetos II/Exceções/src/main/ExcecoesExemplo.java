//@author Ednaldo Júnior

/*Em programação orientada a objetos, exceções são eventos anormais que ocorrem durante a 
execução de um programa e interrompem o fluxo normal de execução. Essas exceções podem ser 
causadas por diversos motivos, como erros de sintaxe, erros de lógica, operações ilegais, condições 
inesperadas, entre outros.

O tratamento de exceções em programação orientada a objetos geralmente envolve o uso de blocos 
try-catch. Um bloco try é usado para envolver o código que pode gerar uma exceção, enquanto um 
bloco catch é usado para capturar e lidar com a exceção caso ela ocorra. Além disso, é possível 
utilizar blocos finally para garantir que determinadas ações sejam executadas independentemente 
de uma exceção ocorrer ou não.
*/

package main;

public class ExcecoesExemplo {
    public static void main(String[] args) {
        try{
            int[] array = new int[5];
            System.out.println(array[10]); //Acessando um índice inválido
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exceção capturada: Índice foira dos limites do array.");
        }finally{
            System.out.println("Bloco finally sendo executado.");
        }
    }
    
}

/*Neste exemplo, o programa tenta acessar um índice inválido em um array, o que resultaria em uma 
exceção do tipo ArrayIndexOutOfBoundsException. Esse erro é capturado pelo bloco catch 
correspondente e uma mensagem apropriada é exibida. O bloco finally é executado 
independentemente da ocorrência de uma exceção, garantindo que certas ações de limpeza ou 
finalização de recursos sejam realizadas.

Em resumo, exceções em programação orientada a objetos fornecem um mecanismo robusto para 
lidar com situações inesperadas durante a execução de um programa, permitindo que o código trate 
esses erros de forma adequada e mantenha a integridade e estabilidade do sistema.
*/