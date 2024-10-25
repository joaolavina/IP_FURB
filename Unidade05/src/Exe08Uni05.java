/*Descreva um algoritmo que leia um número inteiro n e, dados n números inteiros, descreva um algoritmo que:

escreva o menor valor negativo;
escreva a média dos números positivos. */

import java.util.Scanner;
import java.lang.Math;

public class Exe08Uni05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite uma quantidade de números: ");
        int n = input.nextInt();

        double media = 0;
        int menor = 0;
        int qntPositivos = 0;

        System.out.println("Digite os números: ");
        for (int i=0; i<n; i++){
            int num = input.nextInt();

            if(num>0){
                qntPositivos++; 
                media = media + num;
            }
            else {
                menor = Math.min(num, menor);
            }
        }
    
        input.close();

        System.out.println("média dos números positivos: "+(media/qntPositivos));
        System.out.println("Menor valor negativo: "+menor);

    }
}
