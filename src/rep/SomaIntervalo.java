/*
(1) Desenvolva um algoritmo que some todos os números inteiros compreendidos entre 1 e 10 (inclusive).

*Exemplo de execução – Exercício 1 - Caso de teste
Somatório:  55
 */

package rep;

import java.util.Scanner;

public class SomaIntervalo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int soma = 0;

        for (int i=1; i<=10; i++) {
            soma += i;
        }

        System.out.printf("Somatório: %d", soma);

        sc.close();
    }
}
