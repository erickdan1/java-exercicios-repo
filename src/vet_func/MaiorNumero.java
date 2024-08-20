/*
(1) Faça o design de uma função "maior" que receba dois números [inteiros e positivos] e retorne o maior deles.
Caso eles sejam iguais, deve-se mostrar a mensagem "Os números são iguais".

* Exemplo de execução – Exercício 1
Caso de teste 1
Insira o primeiro número:
1
Insira o segundo número:
2
O maior é: 2
* Exemplo de execução – Exercício 1
Caso de teste 2
Insira o primeiro número:
1
Insira o segundo número:
1
Os números são iguais
 */

package vet_func;

import java.util.Scanner;

public class MaiorNumero {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1, num2;

        System.out.println("Insira o primeiro número:");
        num1 = sc.nextInt();

        System.out.println("Insira o segundo número:");
        num2 = sc.nextInt();

        if (num1 == num2) {
            System.out.println("Os números são iguais");
        } else {
            System.out.println("O maior é: " + max(num1, num2));
        }

        sc.close();
    }

    public static int max(int n1, int n2) {
        // return Math.max(n1, n2);
        int aux;

        if (n1 > n2) {
            aux = n1;
        } else {
            aux = n2;
        }

        return aux;
    }

}
