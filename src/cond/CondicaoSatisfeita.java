/*
(2) Desenvolva um algoritmo que receba três números. O algoritmo deve imprimir "Condição satisfeita", na tela,
caso o primeiro dado inserido seja maior do que os outros dois (o primeiro não pode ser igual a nenhum).
Caso contrário, deve ser impressa a mensagem: "Erro".

*Exemplo de execução – Exercício 2 - Caso de teste 1
Insira o primeiro número:
3
Insira o segundo número:
2
Insira o terceiro número:
1
Condição satisfeita
*Exemplo de execução – Exercício 2 - Caso de teste 2
Insira o primeiro número:
2
Insira o segundo número:
3
Insira o terceiro número:
1
Erro
*Exemplo de execução – Exercício 2 - Caso de teste 3
Insira o primeiro número:
2
Insira o segundo número:
2
Insira o terceiro número:
1
Erro
 */

package cond;

import java.util.Scanner;

public class CondicaoSatisfeita {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1, num2, num3;

        System.out.println("Insira o primeiro número:");
        num1 = sc.nextInt();

        System.out.println("Insira o segundo número:");
        num2 = sc.nextInt();

        System.out.println("Insira o terceiro número:");
        num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("Condição Satisfeita");
        }
        else {
            System.out.println("Erro");
        }

        sc.close();
    }
}
