//@author Ednaldo Júnior

/*Em programação orientada a objetos, os tipos enumerados (também conhecidos como 
enumerações ou enums) são uma forma de definir um tipo de dado que consiste em um conjunto 
fixo de valores nomeados. Cada valor dentro do enum é geralmente associado a um inteiro, mas em 
linguagens mais modernas, como Java, C#, e Python (com a biblioteca enum), é possível associar 
valores arbitrários a cada constante enum.*/

package model;

public class DiaSemana {
    DOMINGO, SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO
}

/*Além disso, enums podem ter métodos e propriedades associados a eles, tornando-os ainda mais 
poderosos. Por exemplo, você pode adicionar métodos para calcular coisas com base no valor da 
enumeração, ou propriedades para fornecer informações adicionais sobre cada constante enum.

Os tipos enumerados são úteis em situações onde você tem um conjunto finito de valores que são 
conhecidos antecipadamente e que precisam ser tratados de forma especial no código, como os 
dias da semana, os meses do ano, opções de configuração, etc. Eles podem melhorar a legibilidade e 
a manutenibilidade do código, além de ajudar a evitar erros de digitação e garantir que apenas 
valores válidos sejam usados em determinados contextos.*/