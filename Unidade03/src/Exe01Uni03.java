/*  Uma imobiliária vende apenas terrenos retangulares. 
Faça um programa para ler as dimensões de um terreno e depois exibir a área do terreno. */

import java.util.Scanner;

public class Exe01Uni03 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Digite a largura: ");
      double largura = input.nextDouble();
      System.out.println("Digite o comprimento: ");
      double comprimento = input.nextDouble();
      double area = largura*comprimento;
      System.out.println("A área equivale a " + area );
      input.close();
    }
}
