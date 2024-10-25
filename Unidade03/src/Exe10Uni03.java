/*Descreva um programa que leia o comprimento dos catetos de um triângulo retângulo
 e calcule o comprimento da hipotenusa.
Fórmula:
hipotenusa²=cateto1²=cateto2²
 */

 import java.util.Scanner;
 import java.lang.Math; 
 
 public class Exe10Uni03 {
     public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.println("Digite o comprimento do cateto 1: ");
     double cateto1 = input.nextDouble();
     System.out.println("Digite o comprimento do cateto 2: ");
     double cateto2 = input.nextDouble();
     double hipotenusa = Math.sqrt(Math.pow(cateto1,2)+Math.pow(cateto2, 2));
     System.out.println("A hipotenusa equivale a " + hipotenusa);
     input.close();
     }
 }
 