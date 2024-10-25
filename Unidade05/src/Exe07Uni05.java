// Descreva um algoritmo que leia um número inteiro n e, dados n números reais informe o maior e o menor número.

import java.util.Scanner;
import java.lang.Math;

public class Exe07Uni05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de números: ");
        int n = input.nextInt();
        
        double maior = Double.MIN_VALUE;
        double menor = Double.MAX_VALUE;

        System.out.println("Digite os números: ");
        for(int i=0; i<n; i++){
            double a = input.nextDouble();
        
            maior = Math.max(a, maior);
            menor = Math.min(a, menor);         
        }
        input.close();
        System.out.println("Maior: "+maior);
        System.out.println("Menor: "+menor);
    }
}