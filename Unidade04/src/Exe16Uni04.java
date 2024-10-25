/* Escreva um algoritmo que leia a idade de 2 homens e 2 mulheres 
(considere que a idade entre homens e mulheres sempre serão diferentes). 
Calcule e escreva a soma das idades do homem mais velho com a mulher mais nova, 
e o produto das idades do homem mais novo com a mulher mais velha. */

import java.util.Scanner;

public class Exe16Uni04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a idade do homem 1: ");
        int homem1 = input.nextInt();
        System.out.print("Digite a idade do homem 2: ");
        int homem2 = input.nextInt();
        System.out.print("Digite a idade da mulher 1: ");
        int mulher1 = input.nextInt();
        System.out.print("Digite a idade da mulher 2: ");
        int mulher2 = input.nextInt();

        input.close();

        if (homem1>=homem2 && mulher1>=mulher2){
            int soma = homem1+mulher2;
            int mult = homem2*mulher1;
            System.out.println("Soma das idades do homem mais velho e da mulher mais nova: "+soma);
            System.out.println("Multiplicação das idades do homem mais novo e da mulher mais velha: "+mult);
        }
        else if (homem1>homem2 && mulher1<mulher2){
            int soma = homem1+mulher1;
            int mult = homem2*mulher2;
            System.out.println("Soma das idades do homem mais velho e da mulher mais nova: "+soma);
            System.out.println("Multiplicação das idades do homem mais novo e da mulher mais velha: "+mult);
        }
        else if (homem1<homem2 && mulher1>mulher2){
            int soma = homem2+mulher2;
            int mult = homem1*mulher1;
            System.out.println("Soma das idades do homem mais velho e da mulher mais nova: "+soma);
            System.out.println("Multiplicação das idades do homem mais novo e da mulher mais velha: "+mult);
        }
        else if (homem1<homem2 && mulher1<mulher2){
            int soma = homem2+mulher1;
            int mult = homem1*mulher2;
            System.out.println("Soma das idades do homem mais velho e da mulher mais nova: "+soma);
            System.out.println("Multiplicação das idades do homem mais novo e da mulher mais velha: "+mult);
        }
    }
}
