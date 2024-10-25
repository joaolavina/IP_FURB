/* Dados 3 valores, escreva um algoritmo que os informe em uma determinada ordem a partir de um menu de opções:

se opção = 1, escreva os 3 valores em ordem crescente
se opção = 2, escreva os 3 valores em ordem decrescente
se opção = 3, escreva os 3 valores de forma que o maior valor fique no meio

 */

import java.util.Scanner;

public class Exe24Uni04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor 1: ");
        double num1 = input.nextDouble();
        System.out.print("Digite o valor 2: ");
        double num2 = input.nextDouble();
        System.out.print("Digite o valor 3: ");
        double num3 = input.nextDouble();

        System.out.println("Selecione uma das opções: ");
        System.out.println( "Opção [1] - Escreve os 3 valores em ordem crescente");
        System.out.println("Opção [2] - Escreve os 3 valores em ordem decrescente");
        System.out.println("Opção [3] - Escreve os 3 valores de forma que o maior valor fique no meio");
        int opcao = input.nextInt();

        input.close();

        double a = 0;
        double b = 0;
        double c = 0;

        if (num1>num2 && num1>num3){
            a = num1;
        }
        else if (num2>num1 && num2>num3){
            a = num2;
        }
        else if (num3>num1 && num3>num2){
            a = num3;
        }
        if (num1<num2 && num1<num3){
            b = num1;
        }
        else if (num2<num1 && num2<num3){
            b = num2;
        }
        else if (num3<num1 && num3<num2){
            b = num3;
        }
        if (num1>num2 && num1<num3 || num1<num2 && num1>num3){
            c = num1;
        }
        else if (num2>num1 && num2<num3 || num2<num1 && num2>num3){
            c = num2;
        }
        else if (num3>num1 && num3<num2 || num3<num1 && num3>num2){
            c = num3;
        }
        // por favor que isso esteja certo

        switch(opcao){
            case 1:
                System.out.println(b+" "+c+" "+a);
                break;
            case 2:
                System.out.println(a+" "+c+" "+b);
                break;
            case 3:
                System.out.println(c+" "+a+" "+b);
        }
    }
}
