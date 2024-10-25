/*Descreva um algoritmo que leia o número de inscrição e a altura de um atleta em uma competição e informe:

o número de inscrição e a altura do atleta mais alto;
o número de inscrição e a altura do atleta mais baixo;
a altura média do grupo de atletas.
A leitura deve ser finalizada ao digitar 0 para o número de inscrição. */

import java.util.Scanner;

public class Exe17Uni05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double maior = Double.MIN_VALUE;
        double menor = Double.MAX_VALUE;
        int niMaior = 0;
        int niMenor = 0;
        int atletas = 0;
        double media = 0;

        System.out.print("Número de inscrição: ");
        int numeroInscricao = input.nextInt();
        while (numeroInscricao != 0) {
            System.out.println("Altura: ");
            double altura = input.nextDouble();

            if (altura > maior) {
                maior = altura;
                niMaior = numeroInscricao;
            }

            if (altura < menor) {
                menor = altura;
                niMenor = numeroInscricao;
            }

            atletas++;

            media = media + altura;

            System.out.print("Número de inscrição: ");
            numeroInscricao = input.nextInt();
        }
        input.close();

        media = media / atletas;
        System.out.println("ATLETA MAIS BAIXO: " + niMenor);
        System.out.println("Altura: " + menor);
        System.out.println("ATLETA MAIS ALTO: " + niMaior);
        System.out.println("Altura: " + maior);
        System.out.println("ALTURA MÉDIA DOS ATLETAS: " + media);
    }
}
