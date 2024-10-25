// Descreva um algoritmo que leia a altura de 20 pessoas e calcule a média de altura das mesmas.

import java.util.Scanner;

public class Exe06Uni05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double media = 0;
        
        System.out.println("Digite a altura de 20 pessoa: ");
        for(int i=0; i<20; i++){
            double altura = input.nextDouble();
            media += altura;
        }

        media = media/20;
        System.out.println("Média de altura: " + media);
        input.close();
    }
}
