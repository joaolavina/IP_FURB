/* Um restaurante cobra R$ 25,00 por cada quilo de refeição. 
Escreva um programa que leia o peso do prato montado pelo cliente (em quilos) 
e imprima o valor a pagar. O peso do prato é de 750 gramas.
 */

 import java.util.Scanner;

 public class Exe06Uni03 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Digite o  peso: ");
         double peso = input.nextDouble();
         double valor = (peso-0.75)*25;
         System.out.println("Total a pagar: R$" + valor);
         input.close();
     }
 
 }
 
 