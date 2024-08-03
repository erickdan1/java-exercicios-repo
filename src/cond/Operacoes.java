/*
(4) Desenvolva um algoritmo que receba dois números, calcule e mostre a multiplicação entre eles, se ambos forem iguais.
Caso o primeiro seja maior que o segundo, mostre a subtração do primeiro pelo segundo.
Caso contrário, mostre a soma entre os dois.

* Exemplo de execução – Exercício 4 - Caso de teste 1
Insira o primeiro valor:
2
Insira o segundo valor:
2
Multiplicação:  4

* Exemplo de execução – Exercício 4 - Caso de teste 2
Insira o primeiro valor:
2
Insira o segundo valor:
1
Subtração:  1

* Exemplo de execução – Exercício 4 - Caso de teste 3
Insira o primeiro valor:
1
Insira o segundo valor:
2
Soma:  3
 */

package cond;

import java.util.Scanner;

public class Operacoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2;

        System.out.println("Insira o primeiro valor:");
        num1 = sc.nextInt();

        System.out.println("Insira o segundo valor:");
        num2 = sc.nextInt();

        if (num1 == num2) {
            System.out.println("Multiplicação:  " + (num1 * num2));
        }
        else if (num1 > num2) {
            System.out.println("Subtração:  " + (num1 - num2));
        }
        else {
            System.out.println("Soma:  " + (num1 + num2));
        }

        sc.close();
    }
}
