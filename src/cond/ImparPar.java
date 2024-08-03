/*
(3) Faça um programa que receba um número inteiro e verifique se esse número é par ou ímpar.

*Exemplo de execução – Exercício 3 - Caso de teste 1
Insira um número:
2
2 é par.

*Exemplo de execução – Exercício 3 - Caso de teste 2
Insira um número:
3
3 é impar.
 */

package cond;

import java.util.Scanner;

public class ImparPar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Insira um número:");
        num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.printf("%d é par.", num);
        }
        else {
            System.out.printf("%d é ímpar.", num);
        }

        sc.close();
    }
}
