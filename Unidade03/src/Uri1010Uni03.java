/*Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, 
o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.
 Após, calcule e mostre o valor a ser pago.

Entrada
O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores,
 respectivamente dois inteiros e um valor com 2 casas decimais.

Saída
A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, 
lembrando de deixar um espaço após os dois pontos e um espaço após o "R$". 
O valor deverá ser apresentado com 2 casas após o ponto. */

import java.util.Scanner;
import java.util.Locale;
import java.text.DecimalFormat;

public class Uri1010Uni03 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en","US"));
        Scanner input = new Scanner(System.in);
        // Tem como limitar as casas decimais do número de entrada?

        DecimalFormat df_02 = new DecimalFormat("0.00");

        int codigo1 = input.nextInt(); int numPeças1 = input.nextInt(); double valorPeça1 = input.nextDouble();
        int codigo2 = input.nextInt(); int numPeças2 = input.nextInt(); double valorPeça2 = input.nextDouble();

        input.close();

        double valorPago = (numPeças1*valorPeça1)+(numPeças2*valorPeça2);

        System.out.println("VALOR A PAGAR: R$ "+df_02.format(valorPago));
        System.out.println(codigo1+codigo2);
    }
}

