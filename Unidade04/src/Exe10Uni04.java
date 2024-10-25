/*Um casal possui três filhos: Marquinhos, Zezinho e Luluzinha. 
Faça um algoritmo para ler as idades dos filhos e exibir quem é o caçula da família; 
suponha que não haja empates.
 */

 import java.util.Scanner;

 public class Exe10Uni04 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
 
         System.out.print("Digite a idade de Marquinhos: ");
         int marquinhosIdade = input.nextInt();
         System.out.print("Digite a idade de Zezinho: ");
         int zezinhoIdade = input.nextInt();
         System.out.print("Digite a idade de Luluzinha: ");
         int luluzinhaIdade = input.nextInt();
 
         input.close();
 
         if (marquinhosIdade<zezinhoIdade && marquinhosIdade<luluzinhaIdade){
             System.out.println("O caçula é Marquinhos.");
         }
         else if (zezinhoIdade<marquinhosIdade && zezinhoIdade<luluzinhaIdade){
             System.out.println("O caçula é Zezinho.");
         }
         else {
             System.out.println("A caçula é Luluzinha.");
         }
     }
 }
 