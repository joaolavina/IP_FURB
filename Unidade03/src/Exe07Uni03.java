/* Uma fábrica de refrigerantes vende seu produto em três formatos: 
lata de 350 ml, garrafa de 600 ml e garrafa de 2 litros. 
Se um comerciante compra uma determinada quantidade de cada formato, 
faça um programa para calcular quantos litros de refrigerante ele comprou.
 */

 import java.util.Scanner;

 public class Exe07Uni03 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Quantas latas de 350ml foram compradas?");
         int latas350 = input.nextInt();
         System.out.println("Quantas garrafas de 600ml foram compradas?");
         int garrafas600 =  input.nextInt();
         System.out.println("Quantas garrafas de 2L foram compradsa?");
         int garrafas2L = input.nextInt();
         double l3 = latas350;
         double g6 = garrafas600;
         double g2 = garrafas2L;
         double litros = (l3*0.35)+(g6*0.6)+(g2*2);
         System.out.println("Quantide total de litros: " + litros + "L.");
         input.close();
     }
 }
 