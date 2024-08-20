/*
(3) Faça o design de uma função "parImpar" que receba um número inteiro e verifique se esse número é par ou ímpar.

*Exemplo de execução – Exercício 3
Caso de teste 1
Insira um número:
2
2 é par.
*Exemplo de execução – Exercício 3
Caso de teste 2
Insira um número:
3
3 é impar.
 */

package vet_func;

import java.util.Scanner;

public class FuncaoImparPar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Insira um número:");
        num = sc.nextInt();

        if (parImpar(num)) {
            System.out.println(num + " é par.");
        } else {
            System.out.println(num + " é ímpar.");
        }

        sc.close();
    }

    public static boolean parImpar(int n) {
        boolean aux;
        aux = n % 2 == 0;
        return aux;
    }

}
