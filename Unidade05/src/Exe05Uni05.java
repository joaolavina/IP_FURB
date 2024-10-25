/*Descreva um algoritmo que escreva os n primeiros termos da seguinte sequência de números:

8,10,16,20,32,64

O valor n deve ser lido e deve ser maior do que 2.. */

import java.util.Scanner;

public class Exe05Uni05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o tamanho da sequência: ");
        int n = input.nextInt();

        input.close();

        int a = 8;
        int b = 10;
        int c = 8;

        System.out.println("Sequência:");
        System.out.println(a);
        System.out.println(b);
        
        if (n>2){
            for(int i=3; i<=n; i++){
                if(i%2==0){
                    b = a + b;
                    System.out.println(b);
                    a = c;
                    }
                else if(i%2!=0){
                    c *= 2;
                    System.out.println(c);
                }

            }
        }
        else{
            System.out.println("O tamanho deve ser maior que 2.");
        }
    }   
}


