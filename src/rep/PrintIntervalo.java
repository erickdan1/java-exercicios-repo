/*
(2) Desenvolva um algoritmo que receba dois números inteiros positivos A e B. Exiba na tela todos os números inteiros
compreendidos entre A e B, excluindo os próprios A e B. Suponha que o usuário respeite o enunciado e insira valores
válidos para A e B.

* Exemplo de execução – Exercício 2 - Caso de teste
Insira o valor de A:
1
Insira o valor de B:
10
Série numérica:
2 3 4 5 6 7 8 9
 */

package rep;

import java.util.Scanner;

public class PrintIntervalo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor de A:");
        int a = sc.nextInt();

        System.out.println("Insira o valor de B:");
        int b = sc.nextInt();

        System.out.println("Série numérica:");

        for (int i=a+1; i<b; i++) {
            System.out.printf("%d ", i);
        }

        sc.close();
    }
}
