/*Escreva um programa que leia um número inteiro positivo n 
e em seguida imprima n linhas do chamado Triangulo de Floyd:

1
2  3
4  5  6
7  8  9  10
11 12 13 14 15
16 17 18 19 20 21

Triangulo de Floyd

 */

import java.util.Scanner;

public class Exe12Uni05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas do Triângulo de Floyd: ");
        int n = input.nextInt();
        int numero = 0;
        for(int i=0; i<n; i++){
            System.out.println();
            for(int j=0; j<=i; j++){
                numero++;
                System.out.print(numero + " ");
            }
        }
        input.close();
    }
}
