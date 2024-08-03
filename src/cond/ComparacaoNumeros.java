/*
(1) Faça um programa que receba dois números e mostre o maior deles. Caso eles sejam iguais, deve-se mostrar a
mensagem "Os números são iguais".

* Exemplo de execução – Exercício 1 - Caso de teste 1
Insira o primeiro número:
1
Insira o segundo número:
2
O maior é: 2

* Exemplo de execução – Exercício 1 - Caso de teste 2
Insira o primeiro número:
1
Insira o segundo número:
1
Os números são iguais
 */

package cond;

import java.util.Scanner;

public class ComparacaoNumeros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1, num2;

        System.out.println("Insira o primeiro número:");
        num1 = sc.nextInt();

        System.out.println("Insira o segundo número:");
        num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.printf("O maior é: %d", num1);
        }
        else if (num2 > num1) {
            System.out.printf("O maior é: %d", num2);
        }
        else {
            System.out.println("Os números são iguais");
        }

        sc.close();
    }
}
