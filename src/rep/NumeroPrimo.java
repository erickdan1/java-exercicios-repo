/*
(5) Desenvolva um algoritmo que receba um número N e informe se N é um número primo, ou não.
A saber: um número primo é um inteiro positivo que só pode ser dividido por ele mesmo e por um, apenas.

*Exemplo de execução – Exercício 5 - Caso de teste 1
Insira um número:
7
7 é primo.

*Exemplo de execução – Exercício 5 - Caso de teste 2
Insira um número:
10
10 não é primo.

Link útil: https://www.dcc.fc.up.pt/~pbv/aulas/progimp/teoricas/teorica07.html
 */

package rep;

import java.util.Scanner;

public class NumeroPrimo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um número:");
        int num = sc.nextInt();

        boolean primo = true;

        if (num <= 1) {
            primo = false;
        } else {
            for (int i = 2; i*i <= num; i++) {
                if (num % i == 0) {
                    primo = false;
                    break;
                }
            }
        }

        System.out.printf(primo ? "%d é primo." : "%d não é primo.", num);

        sc.close();
    }
}
