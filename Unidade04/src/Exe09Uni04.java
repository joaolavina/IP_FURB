/* Dados dois valores inteiros, escreva um algoritmo que informe se eles são múltiplos ou não. */

import java.util.Scanner;

public class Exe09Uni04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite dois números: ");
        int num1 = input.nextInt(); 
        int num2 = input.nextInt();
        input.close();

        double div1 = (double)num1/(double)num2;
        double div2 = (double)num2/(double)num1;

        if ((div1-(int)(div1)!=0.0) && (div2-(int)(div2)!=0.0)){
            System.out.println("Não são múltiplos.");
        }
        else if (num1==num2){
            System.out.println("São múltiplos.");
        }
        else {
            System.out.println("São múltiplos.");
        }
    }
}
