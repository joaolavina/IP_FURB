/* Escreva um algoritmo para ler o ano de nascimento de 3 irmãos, 
escrever uma mensagem que indique se eles são TRIGÊMEOS, GÊMEOS, APENAS IRMÃOS. 
Considere que eles são GÊMEOS se dois deles possuem a mesma idade e o outro diferente dos demais,
 e apenas irmãos se todas as idades forem diferentes. */

 import java.util.Scanner;

 public class Exe11Uni04 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
 
         System.out.print("Digite o ano de nascimento do Irmão 1: ");
         int ano1 = input.nextInt();
         System.out.print("Digite o ano de nascimento do Irmão 2: ");
         int ano2 = input.nextInt();
         System.out.print("Digite o ano de nascimento do Irmão 3: ");
         int ano3 = input.nextInt();
 
         input.close();
 
         if (ano1==ano2 && ano1==ano3 && ano2==ano3){
             System.out.println("São trigêmeos.");
         }
         else if (ano1==ano2 || ano1==ano3 || ano2==ano3){
             System.out.println("São gêmeos.");
         }
         else {
             System.out.println("São apenas irmãos.");
         }
     }
 }
 