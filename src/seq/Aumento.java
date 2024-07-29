/*
(3) Faça um programa que receba o salário de um funcionário, calcule e mostre o novo salário,
sabendo-se que este sofreu um aumento de 25%.

* Exemplo de execução – Exercício 3 - Caso de teste
Insira o salário:
1000
Novo salário:  1250

 */

package seq;

import java.util.Scanner;

public class Aumento {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a;
        double aumento;

        System.out.println("Insira o Salário:");

        a = sc.nextInt();
        aumento = a + (0.25 * a);

        System.out.printf("Novo Salário: %.0f", aumento);

        sc.close();
    }
}
