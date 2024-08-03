/*
(5) Desenvolva um algoritmo que simule uma calculadora. Você deve dar a opção de o usuário escolher entre:
1 - Somar; 2 - Subtrair; 3 - Multiplicar; 4 - Dividir. O usuário só conseguirá processar dois números inteiros por vez.

* Exemplo de execução – Exercício 5 - Caso de teste 1
Digite 1 para somar;
Digite 2 para subtrair;
Digite 3 para multiplicar;
Digite 4 para dividir;
1
Insira o primeiro valor:
1
Insira o segundo valor:
2
Soma: 3

* Exemplo de execução – Exercício 5 - Caso de teste 2
Digite 1 para somar;
Digite 2 para subtrair;
Digite 3 para multiplicar;
Digite 4 para dividir;
2
Insira o primeiro valor:
2
Insira o segundo valor:
1
Subtração: 1

* Exemplo de execução – Exercício 5 - Caso de teste 3
Digite 1 para somar;
Digite 2 para subtrair;
Digite 3 para multiplicar;
Digite 4 para dividir;
3
Insira o primeiro valor:
2
Insira o segundo valor:
2
Multiplicação: 4

* Exemplo de execução – Exercício 5 - Caso de teste 4
Digite 1 para somar;
Digite 2 para subtrair;
Digite 3 para multiplicar;
Digite 4 para dividir;
4
Insira o primeiro valor:
4
Insira o segundo valor:
2
Divisão: 2

* Exemplo de execução – Exercício 5 - Caso de teste 5
Digite 1 para somar;
Digite 2 para subtrair;
Digite 3 para multiplicar;
Digite 4 para dividir;
4
Insira o primeiro valor:
1
Insira o segundo valor:
0
Divisão por zero.
 */

package cond;

import java.util.Scanner;

public class MiniCalculadora {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int op, num1, num2;

        System.out.println("Digite 1 para somar;");
        System.out.println("Digite 2 para subtrair;");
        System.out.println("Digite 3 para multiplicar;");
        System.out.println("Digite 4 para dividir;");

        op = sc.nextInt();

        System.out.println("Insira o primeiro valor:");
        num1 = sc.nextInt();

        System.out.println("Insira o segundo valor:");
        num2 = sc.nextInt();

        switch (op) {
            case 1:
                System.out.println("Soma: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Subtração: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Multiplicação: " + (num1 * num2));
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Divisão por zero.");
                }
                else {
                    System.out.println("Divisão: " + (num1 / num2));
                }
                break;
        }

        sc.close();
    }
}
