/*
(5) Desenvolva um algoritmo que preencha um vetor numérico de 5 posições. Após preencher todos os vetores, o usuário
deve inserir uma chave de busca X. Caso exista algum número igual a X, dentro do vetor, o algoritmo deve mostrar,
na tela, o índice da primeira posição na qual X foi encontrado. Caso contrário, o algoritmo deve se encerrar com
uma única mensagem, dizendo "Chave não encontrada.".
OBS: para essa questão nao é obrigatório usar uma função...

* Exemplo de execução – Exercício 5
Caso de teste 1
Insira o dado da posição  1:
11
Insira o dado da posição  2:
12
Insira o dado da posição  3:
13
Insira o dado da posição  4:
14
Insira o dado da posição  5:
15
Insira a chave de busca:
15
Chave encontrada na posição:  5
* Exemplo de execução – Exercício 5
Caso de teste 2
Insira o dado da posição  1:
11
Insira o dado da posição  2:
12
Insira o dado da posição  3:
13
Insira o dado da posição  4:
14
Insira o dado da posição  5:
15
Insira a chave de busca:
20
Chave não encontrada!
 */

package vet_func;

import java.util.Scanner;

public class ChaveBusca {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[5];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Insira o dado da posição " + (i + 1) + ": ");
            vetor[i] = sc.nextInt();
        }

        System.out.println("Insira a chave de busca: ");
        int chave = sc.nextInt();

        boolean chaveEncontrada = false;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == chave) {
                System.out.println("Chave encontrada na posição: " + (i + 1));
                chaveEncontrada = true;
                break;
            }
        }

        if (!chaveEncontrada) {
            System.out.println("Chave não encontrada!");
        }

        sc.close();
    }

}
