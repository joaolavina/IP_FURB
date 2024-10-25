/*Implemente o problema da mochila. 
Tendo-se uma sequência decrescente de números inteiros positivos que inicia em N, 
com decremento inteiro positivo K, deseja-se empacotá-los em uma mochila com tamanho M, 
de forma que se coloque dentro dela preferencialmente os maiores valores, até que ela esteja cheia. 
N e K são inteiros e devem ser definidos pelo usuário. Faça um algoritmo que imprima:

os elementos a serem colocados na mochila;
os elementos que entraram na mochila;
os que ficaram fora da mochila;
qual é a soma dos elementos que entraram na mochila;
qual a soma dos elementos que não entraram na mochila. */

import java.util.Scanner;

public class Exe30Uni05 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Digite o valor de N e de K:");
      int n = input.nextInt(); int k = input.nextInt();
      int somaMochila = 0;
      int somaFora = 0;
      System.out.println("Digte o valor de M:");
      int m = input.nextInt();
   
      System.out.println("Elementos dentro da mochila: ");
      while (somaMochila<=m && n>0){
         somaMochila += n;
         System.out.println(n);
         n-= k;
         }
      System.out.println("Elementos fora da mochila: ");
      while(n>0){
         somaFora += n;
         System.out.println(n);
         n -= k;
      }
      System.out.println("Soma elementos dentro da mochila: "+somaMochila);
      System.out.println("Soma elementos fora da mochila: "+somaFora);
      input.close();
   }

} 

