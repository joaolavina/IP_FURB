/* Leia 3 valores inteiros e ordene-os em ordem crescente. 

No final, mostre os valores em ordem crescente, 
uma linha em branco e em seguida, os valores na sequência como foram lidos.

Entrada
A entrada contem três números inteiros.

Saída
Imprima a saída conforme foi especificado.

 */

import java.util.Scanner;

public class Uri1042Uni04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1 = input.nextInt(); int n2 = input.nextInt(); int n3 = input.nextInt();
        input.close();

        if (n1>n2 && n1>n3 && n2>n3){
            System.out.println(n3);
            System.out.println(n2);
            System.out.println(n1);
        }
        else if (n1>n2 && n1>n3 && n3>n2){
            System.out.println(n2);
            System.out.println(n3);
            System.out.println(n1);
        }
        else if (n2>n1 && n2>n3 && n1>n3){
            System.out.println(n3);
            System.out.println(n1);
            System.out.println(n2);
        }
        else if (n2>n1 && n2>n3 && n3>n1){
            System.out.println(n1);
            System.out.println(n3);
            System.out.println(n2);
        }
        else if (n3>n1 && n3>n2 && n1>n2){
            System.out.println(n2);
            System.out.println(n1);
            System.out.println(n3);
        }
        else if (n3>n1 && n3>n2 && n2>n1){
            System.out.println(n1);
            System.out.println(n2);
            System.out.println(n3);
        }

        System.out.println("");
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
    }
}

