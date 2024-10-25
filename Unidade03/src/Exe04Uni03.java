/* Faça um programa para ler três notas de um aluno em uma disciplina 
e imprimira sua média ponderada (as notas tem pesos respectivos de 5, 3 e 2).
 */

 import java.util.Scanner;

public class Exe04Uni03{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a Nota 1: ");
        double n1 = input.nextDouble();
        System.out.println("Digite a Nota 2: ");
        double n2 = input.nextDouble();
        System.out.println("Digite a Nota 3: ");
        double n3 = input.nextDouble();
        double media = ((n1*5)+(n2*3)+(n3*2)) / 10;
        System.out.println("Média: " + media);
        input.close();

    }

}