/*
(2) Faça o design de uma função "isFirstGreater" que receba três números. No final o programa deve imprimir
"Condição satisfeita", na tela, caso o primeiro dado inserido seja maior do que os outros dois (o primeiro não pode
ser igual a nenhum). Caso contrário, deve ser impressa a mensagem: "Erro". OBS: use vetor/array de 3 posicoes para
armazenar os numeros lidos.

*Exemplo de execução – Exercício 2
Caso de teste 1
Insira o primeiro número:
3
Insira o segundo número:
2
Insira o terceiro número:
1
Condição satisfeita
*Exemplo de execução – Exercício 2
Caso de teste 2
Insira o primeiro número:
2
Insira o segundo número:
3
Insira o terceiro número:
1
Erro
*Exemplo de execução – Exercício 2
Caso de teste 3
Insira o primeiro número:
2
Insira o segundo número:
2
Insira o terceiro número:
1
Erro
 */

package vet_func;

import java.util.Scanner;

public class PrimeiroMaior {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vect = new int[3];

        System.out.println("Insira o primeiro número:");
        vect[0] = sc.nextInt();

        System.out.println("Insira o segundo número:");
        vect[1] = sc.nextInt();

        System.out.println("Insira o terceiro número:");
        vect[2] = sc.nextInt();

        boolean condicao = isFirstGreater(vect);

        if (condicao) {
            System.out.println("Condição satisfeita");
        } else {
            System.out.println("Erro");
        }

        sc.close();
    }

    public static boolean isFirstGreater(int[] v) {
        boolean aux;
        aux = v[0] > v[1] && v[0] > v[2];
        return aux;
    }

}
