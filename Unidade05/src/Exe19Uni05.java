/*Uma loja de departamentos oferece para seus clientes um determinado desconto de acordo com o valor da compra efetuada. 
O desconto é de 20% caso o valor da compra seja maior que R$ 500,00 e de 15% caso seja menor ou igual. 
Descreva um algoritmo que leia o valor da compra e escreva o total a pagar a cada compra. 
Informe também o valor total recebido pela loja ao final do dia. 
A leitura deve ser finalizada com a leitura 0 para o valor da compra. */

import java.util.Scanner;

public class Exe19Uni05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double ganho = 0;

        System.out.println("Digite o valor da compra:");
        double valorCompra = input.nextDouble();
        while (valorCompra != 0) {

            if (valorCompra <= 500) {
                valorCompra = valorCompra * 0.85;
                System.out.println("Desconto de 15%");
            } else {
                valorCompra = valorCompra * 0.80;
                System.out.println("Desconto de 20%");
            }

            System.out.println("Valor compra: R$ " + valorCompra);
            ganho = ganho + valorCompra;
            System.out.println("Digite o valor da compra:");
            valorCompra = input.nextDouble();
        }

        input.close();
        System.out.println("Ganho da loja: R$ " + ganho);

    }
}
