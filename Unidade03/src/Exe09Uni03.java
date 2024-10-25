/*
 Descreva um programa que calcule o volume de uma lata de óleo. Fórmula:

volume = pi*raio²*altura
 */

 import java.util.Scanner;
 
 public class Exe09Uni03 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Digite o raio: ");
         double raio = input.nextDouble();
         System.out.println("Digite a altura: ");
         double altura = input.nextDouble();
         double pi = 3.14;
         double volume = pi*raio*raio*altura;
         System.out.println("O volume é: " +volume);
         input.close();
     }
 }
 