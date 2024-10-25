/*
 Numa loja de materiais de construção, um azulejo estampado custa R$ 12,50. 
 Faça um programa para ler o comprimento e altura de uma parede (em metros), 
 e depois escrever o valor gasto com a compra de azulejos. 
 Considere que um metro quadrado é formado por 9 azulejos.


 */

 import java.util.Scanner;

 public class Exe13Uni03 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Digite a altura: ");
         double altura = input.nextDouble();
         System.out.println("Digite o comprimento: ");
         double comprimento = input.nextDouble();
         double gasto = comprimento*altura*9*12.50;
         System.out.println("O gasto total com azulejos é de R$" +gasto);
         input.close();
 
     }
 }
 