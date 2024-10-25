/*Foi feita uma pesquisa de audiência de canal de TV em n casas de um determinado bairro de uma cidade, 
em um certo dia do mês. Na pesquisa foi utilizado um coletor de dados portátil. 
Para cada casa visitada, foi fornecido o número do canal (4, 5, 9, 12)
 e o número de pessoas que estavam assistindo a TV naquele horário, 
 considerando que em cada casa só existia uma televisão. 
 Em casas onde a televisão estava desligada, foi registrado zero para o número do canal e para o número de pessoas. 
 Baseado nisto descreva um algoritmo que calcule e escreva, para cada emissora, o percentual de audiência.
  A leitura deve ser finalizada quando for informado canal 0. */

import java.util.Scanner;

public class Exe18Uni05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalPessoas = 0;
        int pessoas4 = 0;
        int pessoas5 = 0;
        int pessoas9 = 0;
        int pessoas12 = 0;

        System.out.print("Digite o número do canal: ");
        int canal = input.nextInt();

        while (canal != 0) {
            System.out.print("Quantidade de pessoas que estavam assistindo: ");
            int pessoas = input.nextInt();

            switch (canal) {
                case 4:
                    pessoas4 = pessoas4 + pessoas;
                    break;
                case 5:
                    pessoas5 = pessoas5 + pessoas;
                    break;
                case 9:
                    pessoas9 = pessoas9 + pessoas;
                    break;
                case 12:
                    pessoas12 = pessoas12 + pessoas;
                    break;
            }

            totalPessoas = totalPessoas + pessoas;

            System.out.print("Digite o número do canal: ");
            canal = input.nextInt();
        }
        input.close();

        pessoas4 = (pessoas4 * 100) / totalPessoas;
        pessoas5 = (pessoas5 * 100) / totalPessoas;
        pessoas9 = (pessoas9 * 100) / totalPessoas;
        pessoas12 = (pessoas12 * 100) / totalPessoas;

        System.out.println("Canal 4: " + pessoas4 + "%");
        System.out.println("Canal 5: " + pessoas5 + "%");
        System.out.println("Canal 9: " + pessoas9 + "%");
        System.out.println("Canal 12: " + pessoas12 + "%");

    }
}
