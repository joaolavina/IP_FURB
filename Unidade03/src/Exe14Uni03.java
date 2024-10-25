/*
 Descreva um programa que a partir da distância percorrida
  e o do tempo gasto por um motorista durante uma viagem de final de semana, 
  calcule a velocidade média e a quantidade de combustível gasto na viagem, 
  sabendo que o automóvel faz 12 km por litro.
 */

 import java.util.Scanner;

 public class Exe14Uni03 {
     public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.println("Distância percorrida: ");
     double distancia = input.nextDouble();
     System.out.println("Tempo gasto: ");
     double tempo = input.nextDouble();
     double vm = distancia/tempo;
     double combustivel = distancia/12;
     System.out.println("Velocidade média: " + vm + "km/h.");
     System.out.println("Quantidade de combustível gasto: " + combustivel);
     input.close();
     }    
 }
 