/*Dado um número de ponto flutuante maior do que 0,
 informe se foram digitadas ou não casas decimais no número. */

 import java.util.Scanner;

 public class Exe04Uni04 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
 
         System.out.print("Digite um número: ");
         double num = input.nextDouble();
 
         input.close();
 
         if (num-(int)num !=0.0) {
             System.out.println("O número tem casas decimais.");
         }
         else {
             System.out.println("O número não tem casas decimais.");
         }
     }
 }
 