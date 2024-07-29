/*
(1) Faça um programa que receba quatro números inteiros,
calcule e mostre a soma desses números.

* Exemplo de execução – Exercício 1 - Caso de teste
Informe quatro números, em sequência:
1
2
3
4
Resultado da soma:  10

 */

package seq;

import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, c, d, soma;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        soma = a + b + c + d;

        System.out.printf("Resultado da soma: %d", soma);

        sc.close();
    }
}
