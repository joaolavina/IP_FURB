/*Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) 
no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. 
A seguir mostre o valor lido e a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).

Saída
Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo necessárias,
 conforme o exemplo fornecido. Não esqueça de imprimir o fim de linha após cada linha, 
 caso contrário seu programa apresentará a mensagem: “Presentation Error”. */

import java.util.Scanner;

public class Uri1018Uni03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valor = input.nextInt();
        // Tem como estabelecer um intervalo possível pra varíavel?

        int cem = valor/100;
        input.close();

        int cinquenta = (valor%100)/50;
        int vinte = ((valor%100)%50)/20;
        int dez = (((valor%100)%50)%20)/10;
        int cinco = ((((valor%100)%50)%20)%10)/5;
        int dois = (((((valor%100)%50)%20)%10)%5)/2;
        int um = (((((valor%100)%50)%20)%10)%5)%2;

        System.out.println(valor);
        System.out.println(cem + " nota(s) de R$ 100,00");
        System.out.println(cinquenta + " nota(s) de R$ 50,00");
        System.out.println(vinte + " nota(s) de R$ 20,00");
        System.out.println(dez + " nota(s) de R$ 10,00");
        System.out.println(cinco+ " nota(s) de R$ 5,00");
        System.out.println(dois + " nota(s) de R$ 2,00");
        System.out.println(um + " nota(s) de R$ 1,00");

    }
}
