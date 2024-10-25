/* Dada uma pergunta, “a cor é azul?”, faça um programa que leia uma variável lógica
 com a resposta e responda “Sim”, caso a resposta seja true, ou “Não”, caso seja false.
 */

 import java.util.Scanner;

 public class Exe05Uni04 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
 
         System.out.print("A cor é azul? ");
         boolean resposta = input.nextBoolean();
 
         input.close();
 
         if (resposta){
             System.out.println("Sim");
         }
         else {
             System.out.println("Não");
         }
     }
 }
 