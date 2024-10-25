/*Uma granja possui um controle automatizado de cada frango da sua produção. 
No pé direito do frango há um anel com um chip de identificação; 
no pé esquerdo são dois anéis para indicar o tipo de alimento que ele deve consumir. 
Sabendo que o anel com chip custa R$ 4,00 e o anel de alimento custa R$ 3,50, 
faça um programa para calcular o gasto total da granja para marcar todos os seus frangos.
 
 */

 import java.util.Scanner;

 public class Exe05Uni03 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Digite a quantidade de frangos: ");
         int frango = input.nextInt();
         double frangoD = frango;
         double gasto = (frangoD*4)+(frangoD*3.50*2);
         System.out.println("Gasto total: R$" + gasto);
         input.close();
     }
 }
 