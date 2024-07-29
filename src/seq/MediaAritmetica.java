/*
(2) Faça um programa que receba três notas, calcule e mostre a média aritmética entre elas.

* Exemplo de execução – Exercício 2 - Caso de teste
Informe três notas, em sequência:
5,5
6,0
6,5
Média aritmética:  6
 */

package seq;

import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a, b, c, mediaAritmetica;

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        mediaAritmetica = (a + b + c) / 3;

        System.out.printf("Resultado da média aritmética: %.0f", mediaAritmetica);

        sc.close();
    }
}
