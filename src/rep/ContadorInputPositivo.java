/*
(3) Desenvolva um algoritmo que peça para o usuário inserir vários números inteiros. O algoritmo deverá contabilizar
a quantidade de números positivos informados. Caso o usuário digite 0, o algoritmo deve mostrar quantidade
contabilizada e encerrar.

* Exemplo de execução – Exercício 3 - Caso de teste
Insira um número:
5
Insira um número:
5
Insira um número:
-1
Insira um número:
0
Quantidade de positivos: 2

 */

package rep;

import java.util.Scanner;

public class ContadorInputPositivo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = 0;
        int num;

        do {
            System.out.println("Insira um número:");
            num = sc.nextInt();
            if (num > 0) {
                count += 1;
            }
        } while (num != 0);

        System.out.printf("Quantidade de positivos: %d", count);

        sc.close();
    }
}
