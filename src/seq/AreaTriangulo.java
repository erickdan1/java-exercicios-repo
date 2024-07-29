/*
(4) Faça um programa que calcule e mostre a área de um triângulo. Sabe-se que: Área = (base * altura)/2.

* Exemplo de execução – Exercício 4 - Caso de teste
Insira a base:
4
Insira a altura:
10
Area do triangulo:  20

 */

package seq;

import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int base, altura, areaTriangulo;

        System.out.println("Insira a base:");
        base = sc.nextInt();
        System.out.println("Insira a altura:");
        altura = sc.nextInt();

        areaTriangulo = (base * altura) / 2;

        System.out.printf("Área do Triangulo: %d", areaTriangulo);

        sc.close();
    }
}
