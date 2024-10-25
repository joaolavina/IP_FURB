/*Uma pessoa foi até uma casa de câmbio trocar dólares por reais. 
Para isto ela entregou um valor em dólares para o atendente. 
Considerando que o atendente tem a cotação do dólar, 
descreva um programa para calcular quantos reais o atendente deve devolver para a pessoa. 
*/

import java.util.Scanner;

public class Exe08Uni03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade de dólares: ");
        double dolar = input.nextDouble();
        double real = 5.14*dolar;
        System.out.println("Transformando em reais: R$"+real );
        input.close();
    }
    
}
