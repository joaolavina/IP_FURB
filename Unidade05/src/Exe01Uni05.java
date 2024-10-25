// Descreva um algoritmo que leia 20 números inteiros e escreva, para cada número lido, se o mesmo é par ou ímpar.

import java.util.Scanner;

public class Exe01Uni05 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        for (int qnt = 0; qnt<20; qnt++){
            System.out.println("Digite um número:");
            int num = input.nextInt();

            if (num%2==0){
                System.out.println("O número é par");
            }
            else {
                System.out.println("O número é ímpar");
            }
        }

        input.close();

    }
}
