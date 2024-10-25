/* Dado um caractere indicando uma opção, escreva um algoritmo para:

se opção = ‘T’: calcular a área de um triângulo de base b e altura h
se opção = ‘Q’: calcular a área de um quadrado de lado l
se opção = ‘R’: calcular a área de um retângulo de base b e altura h
se opção = ‘C’: calcular a área de um círculo de raio r */

import java.util.Scanner;
import java.lang.Math;

public class Exe26Uni04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Escolha uma opcão: ");
        System.out.println("T: calcular a área de um triângulo de base b e altura h");
        System.out.println("Q: calcular a área de um quadrado de lado l");
        System.out.println("R: calcular a área de um retângulo de base b e altura h");
        System.out.println("C: calcular a área de um círculo de raio r");
        char opcao = input.next().charAt(0);
        opcao = Character.toUpperCase(opcao);

        switch(opcao){
            case 'T':
                System.out.println("Digite a base e a altura do triângulo: ");
                double base = input.nextDouble(); double altura = input.nextDouble();
                System.out.println("Área do triângulo: "+base*altura/2);
                break;
            case 'Q':
                System.out.println("Digite o lado: ");
                double lado = input.nextDouble();
                System.out.println("Área do quadrado: "+lado*lado);
                break;
            case 'R':
                System.out.println("Digite a base e a altura do retângulo: ");
                double b = input.nextDouble(); double h = input.nextDouble();
                System.out.println("Área do retângulo: "+b*h);
                break;
            case 'C':
                System.out.println("Digite o raio: ");
                double r = input.nextDouble();
                System.out.println("Área do círculo: "+Math.PI*Math.pow(r, 2));
            default:
                System.out.println("Opção Inválida");
        }
        input.close();
    }
}