/*Leia um valor de ponto flutuante com duas casas decimais. 
Este valor representa um valor monetário. 
A seguir, calcule o menor número de notas 
e moedas possíveis no qual o valor pode ser decomposto.
 As notas consideradas são de 100, 50, 20, 10, 5, 2. 
 As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).

Saída
Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo fornecido.

Obs: Utilize ponto (.) para separar a parte decimal. */

import java.util.Scanner;
import java.util.Locale;

public class Uri1021Uni03 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en","US"));
        Scanner input = new Scanner(System.in);

        double valor = input.nextDouble();

        double cem = valor/100;
        input.close();

        double cinquenta = (valor%100)/50;
        double vinte = ((valor%100)%50)/20;
        double dez = (((valor%100)%50)%20)/10;
        double cinco = ((((valor%100)%50)%20)%10)/5;
        double dois = (((((valor%100)%50)%20)%10)%5)/2;
        double um = (((((valor%100)%50)%20)%10)%5)%2;
        double zeroCinquenta = (((((((valor%100)%50)%20)%10)%5)%2)%1)/0.5;
        double zeroVinCinco = (((((((valor%100)%50)%20)%10)%5)%2)%0.5)/0.25;
        double zeroDez = ((((((((valor%100)%50)%20)%10)%5)%2)%0.5)%0.25)/0.1;
        double zerozeroCinco = (((((((((valor%100)%50)%20)%10)%5)%2)%0.5)%0.25)%0.1)/0.05;
        double zerozeroUm = ((((((((((valor%100)%50)%20)%10)%5)%2)%0.5)%0.25)%0.1)%0.05)/0.01;

        System.out.println("NOTAS:");
        System.out.println((int)cem + " nota(s) de R$ 100.00");
        System.out.println((int)cinquenta + " nota(s) de R$ 50.00");
        System.out.println((int)vinte + " nota(s) de R$ 20.00");
        System.out.println((int)dez + " nota(s) de R$ 10.00");
        System.out.println((int)cinco+ " nota(s) de R$ 5.00");
        System.out.println((int)dois + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println((int)um + " moedas(s) de R$ 1.00");
        System.out.println((int)zeroCinquenta + " moeda(s) de R$ 00.50");
        System.out.println((int)zeroVinCinco + " moeda(s) de R$ 0.25");
        System.out.println((int)zeroDez + " moeda(s) de R$ 00.10");
        System.out.println((int)zerozeroCinco+ " moeda(s) de R$ 0.05");
        System.out.println((int)zerozeroUm + " moeda(s) de R$ 0.01");
    }
}
