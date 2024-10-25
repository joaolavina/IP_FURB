/*Para realizar o cálculo do Imposto de Renda a ser pago,
 é solicitado a renda anual e o número de dependentes do contribuinte. 
 A renda líquida é calculada sobre a renda anual com um desconto de 2% para cada dependente do contribuinte. 
 O contribuinte com uma renda líquida de até R$ 2.000,00 não paga imposto. 
 Para aqueles que possuem renda líquida entre R$ 2.000,00 e R$ 5.000,00 o imposto é de 5% sobre o valor da renda líquida; 
 para rendas líquidas de R$ 5.000,00 até R$ 10.000,00 é de 10%. 
 Rendas superiores a R$ 10.000,00 pagam 15% de imposto. */

import java.util.Scanner;

public class Exe17Uni04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a renda anual: ");
        double renda = input.nextDouble();
        System.out.print("Digite a quantidade de dependentes: ");
        int dependentes = input.nextInt();

        input.close();

        double rendaL = renda - (dependentes*(0.02*renda));
        double imposto = 0;

        if (rendaL<2000){
            System.out.println("Não paga imposto.");
        }
        else if (rendaL>=2000 && rendaL<5000){
            imposto = 0.05*rendaL;
            System.out.println("Paga imposto (5%)");
            System.out.println("Valor: R$ "+imposto);
        }
        else if (rendaL>=5000 && rendaL<10000){
            imposto = 0.1*rendaL;
            System.out.println("Paga imposto. (10%)");
            System.out.println("Valor: R$ "+imposto);
        }
        else if (rendaL>=10000){
            imposto = 0.15*rendaL;
            System.out.println("Paga imposto. (15%)");
            System.out.println("Valor: R$"+imposto);
        }
    }
}
