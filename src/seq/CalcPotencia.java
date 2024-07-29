/*
(5) Faça um programa que receba dois números maiores que zero, calcule e mostre um elevado ao outro.
      Dica: use import java.lang.Math; com a função pow

* Exemplo de execução – Exercício 5 - Caso de teste
Insira o primeiro número:
2
Insira o segundo número:
3
Resultado: 8

 */

package seq;

import java.util.Scanner;
import java.lang.Math;

public class CalcPotencia {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b;
        double resultado;

        System.out.println("Insira o primeiro número:");
        a = sc.nextInt();
        System.out.println("Insira o segundo número:");
        b = sc.nextInt();

        resultado = Math.pow(a, b);

        System.out.printf("Resultado: %.0f", resultado);

        sc.close();
    }
}
