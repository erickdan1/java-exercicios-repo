/*
(4) Desenvolva um algoritmo que peça ao usuário que preencha os dados de um vetor de 5 posições com valores reais
quaisquer, desde que estejam compreendidos entre 1 e 100 (suponha que o usuário irá respeitar o enunciado). Depois,
faça o design de uma função "dividir100" que divide o conteúdo de cada posição do vetor por 100. Ao final, o programa
deve mostrar, na tela, o conteúdo de cada posição do vetor, dividido por 100.

* Exemplo de execução – Exercício 4
Caso de teste
Insira o dado da posição  1:
10
Insira o dado da posição  2:
20
Insira o dado da posição  3:
30
Insira o dado da posição  4:
40
Insira o dado da posição  5:
50
Conteúdo dividido por 100:
 0.1
 0.2
 0.3
 0.4
 0.5
 */

package vet_func;

import java.util.Scanner;

public class DivisaoVetor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] vect = new double[5];

        for (int i=0; i<5; i++) {
            System.out.println("Insira o dado da posição " + (i+1) + ":");
            vect[i] = sc.nextInt();
        }

        double[] divisao100 = dividir100(vect);

        System.out.println("Conteúdo dividido por 100:");
        for (int i=0; i<5; i++) {
            System.out.println(divisao100[i]);
        }

        sc.close();
    }

    public static double[] dividir100(double[] v) {
        double[] aux = new double[5];

        for (int i=0; i<5; i++) {
            aux[i] = v[i] / 100;
        }

        return aux;
    }
}
