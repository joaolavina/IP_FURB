/*Uma loja que trabalha com crediário funciona da seguinte maneira: 
se o pagamento ocorre até o dia do vencimento, o cliente ganha 10% de desconto 
e é avisado que o pagamento está em dia. 
Se o pagamento é realizado até cinco dias após o vencimento o cliente perde o desconto,
 e se o pagamento atrasa mais de cinco dias, é cobrada uma multa de 2% por cada dia de atraso.
Faça um algoritmo que leia o dia do vencimento, o dia do pagamento 
e o valor da prestação e calcule o valor a ser pago pelo cliente, exibindo as devidas mensagens.
 Suponha que todo vencimento ocorre até o dia dez de cada mês e os clientes nunca deixam para pagar no mês seguinte.
 */

import java.util.Scanner;

public class Exe18Uni04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Dia do vencimento da fatura: ");
        int vencimento = input.nextInt();
        System.out.print("Dia do pagamento: ");
        int pagamento = input.nextInt();
        System.out.print("Valor da prestação: ");
        double valor = input.nextDouble();

        input.close();

        if (pagamento<=vencimento){
            double valorDesconto = valor*0.90;
            System.out.println("Pagamento em dia (10% de desconto).");
            System.out.println("Valor pago: R$ "+valorDesconto);
        }
        else if (pagamento<=vencimento+5){
            System.out.println("Pagamento feito em até 5 dias após o vencimento (perda de desconto).");
            System.out.println("Valor pago: R$ "+valor);
        }
        else if (pagamento>vencimento+5){
            double multa = valor+((valor*0.02)*(pagamento-vencimento));
            System.out.println("Pagamento atrasado (multa diária de 2%).");
            System.out.println("Valor pago: R$ "+multa);
        }
    }
}
