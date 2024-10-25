// Dado uma letra, escreva um algoritmo que informe se ela é ou não uma vogal.

import java.util.Scanner;

public class Exe08Uni04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a letra: ");
        char letra = input.next().trim().toUpperCase().charAt(0);
        input.close();

        if (letra == 'A' || letra == 'E' || letra == 'I' ||letra == 'O' || letra == 'U'){
            System.out.println("É vogal.");
        }
        else {
            System.out.println("Não é vogal.");
        }
    }
}