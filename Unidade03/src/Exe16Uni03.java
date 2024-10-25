/*
 Suponha que um caixa disponha apenas de notas de 100, 10 e 1 reais.
  Considerando que alguém está pagando uma compra, 
  faça um programa que determine 
  e escreva o número mínimo de notas que o caixa deve fornecer como troco. E
  screva também o número de cada tipo de nota a ser fornecido como troco. 
  Suponha que o sistema monetário não utilize centavos.
 */

 import java.util.Scanner;

 public class Exe16Uni03 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Digite o preço do produto: ");
         int preco = input.nextInt();
         System.out.println("Informe o valor pago: ");
         int pago = input.nextInt();
         int troco = pago - preco;
         int cem = troco/100;
         int dez = (troco%100)/10;
         int uni = ((troco%100)%10);
         int notas = cem+dez+uni;
         System.out.println("Número de nota(s): " + notas);
         System.out.println(cem + " nota(s) de R$100,00 " + dez + " nota(s) de R$10,00 " + uni + " nota(s) de R$1,00.");
         input.close();
     }    
 }