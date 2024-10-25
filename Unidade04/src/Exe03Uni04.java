//Dados dois números inteiros descreva um algoritmo para informar o maior valor entre eles 

import java.util.Scanner;

public class Exe03Uni04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite dois números: ");
        int numA = input.nextInt(); int numB = input.nextInt();
        
        input.close();

        if (numA>numB){
            System.out.println("O maior número é: "+numA);
        }
        else {
            System.out.println("O maior número é: "+numB);
        }
    }    
}
