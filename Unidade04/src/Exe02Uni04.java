//Dado um valor inteiro maior do que 0 informe se o valor é par ou ímpar. 

import java.util.Scanner;

public class Exe02Uni04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Entre com um valor inteiro mair do que 0: ");
        int valor = input.nextInt();

        input.close();

        if (valor%2==0){
            System.out.println("Número é par");
        }
        else {
            System.out.println("Número é ímpar");
        }
    }
}
