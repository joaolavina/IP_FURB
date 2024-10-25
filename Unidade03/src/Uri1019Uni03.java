/*Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica,
e informe-o expresso no formato horas:minutos:segundos.

Entrada
O arquivo de entrada contém um valor inteiro N.

Saída
Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, 
conforme exemplo fornecido.

 */

import java.util.Scanner;

public class Uri1019Uni03{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        // Limitar o intervalo de uma variável?

        input.close();

        int hrs = N/3600;
        int min = (N%3600)/60;
        int segs = (N%3600)%60;

        System.out.println(hrs+":"+min+":"+segs);
    }
}