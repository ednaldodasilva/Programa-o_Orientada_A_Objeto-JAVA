//@author Ednaldo J�nior

/*Em programa��o orientada a objetos, os tipos enumerados (tamb�m conhecidos como 
enumera��es ou enums) s�o uma forma de definir um tipo de dado que consiste em um conjunto 
fixo de valores nomeados. Cada valor dentro do enum � geralmente associado a um inteiro, mas em 
linguagens mais modernas, como Java, C#, e Python (com a biblioteca enum), � poss�vel associar 
valores arbitr�rios a cada constante enum.*/

package model;

public class DiaSemana {
    DOMINGO, SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO
}

/*Al�m disso, enums podem ter m�todos e propriedades associados a eles, tornando-os ainda mais 
poderosos. Por exemplo, voc� pode adicionar m�todos para calcular coisas com base no valor da 
enumera��o, ou propriedades para fornecer informa��es adicionais sobre cada constante enum.

Os tipos enumerados s�o �teis em situa��es onde voc� tem um conjunto finito de valores que s�o 
conhecidos antecipadamente e que precisam ser tratados de forma especial no c�digo, como os 
dias da semana, os meses do ano, op��es de configura��o, etc. Eles podem melhorar a legibilidade e 
a manutenibilidade do c�digo, al�m de ajudar a evitar erros de digita��o e garantir que apenas 
valores v�lidos sejam usados em determinados contextos.*/