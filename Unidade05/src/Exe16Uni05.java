/*Dado um determinado grupo de pessoas, descreva um algoritmo que a partir da altura e do sexo 
(sexo = 'M' ou sexo = 'm' para masculino e sexo = 'F' e sexo = 'f' para feminino) 
de cada pessoa informe a média da altura das mulheres e a média de altura do grupo. 
A leitura deve ser finalizada ao digitar 0 para a altura.
 */

import java.util.Scanner;

public class Exe16Uni05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double alturaF = 0;
        double alturaTotal = 0;
        int vezesF = 0;
        int vezes = 0;

        System.out.print("Digite o sexo: ");
        String letra = input.next().toLowerCase().trim();
        char sexo = letra.charAt(0);
        System.out.print("Digite a altura: ");
        double altura = input.nextDouble();
        
        while (altura != 0) {
            if (sexo == 'f') {
                vezesF++;
                alturaF += altura;
            }

            alturaTotal += altura;
            vezes++;
            System.out.print("Digite o sexo: ");
            letra = input.next().toLowerCase().trim();
            sexo = letra.charAt(0);
            System.out.print("Digite a altura: ");
            altura = input.nextDouble();
        }

        double mediaF = alturaF / vezesF;
        double media = alturaTotal / vezes;

        input.close();

        System.out.println("MÉDIA ALTURA FEMININA = " + mediaF);
        System.out.println("MÉDIA ALTURA DO GRUPO = " + media);
    }
}
