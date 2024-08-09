/*
(4) Desenvolva um algoritmo que peça ao usuário que insira dois números inteiros positivos A e B, no qual A
deve ser menor que B (supõe-se que o usuário irá respeitar esse enunciado). O algoritmo deve mostrar, na tela,
todos os números ímpares compreendidos entre A e B (inclusive).

* Exemplo de execução – Exercício 4 - Caso de teste
Insira o valor de A:
1
Insira o valor de B:
10
É impar: 1
É impar: 3
É impar: 5
É impar: 7
É impar: 9
 */

package rep;

import java.util.Scanner;

public class ContadorInputImpar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor de A:");
        int a = sc.nextInt();

        System.out.println("Insira o valor de B:");
        int b = sc.nextInt();

        for (int i=a; i<=b; i++) {
            if (i % 2 != 0) {
                System.out.println("É ímpar: " + i);
            }
        }

        sc.close();
    }
}
