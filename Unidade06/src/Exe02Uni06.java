/*Uni6Exe02.java - 
Descreva um algoritmo que leia 12 valores reais e os coloque em um vetor de 12 posições do tipo real. 
Imprima quais valores desses informados são maiores que a média dos valores.
Faça um método para ler os valores, outro para calcular a média e outro para informar os valores maiores que a média. */

import java.util.Scanner;

public class Exe02Uni06 {
   Exe02Uni06(){
      Scanner input = new Scanner(System.in);
      double[] array = new double[12];
      int divisor = 0;
      int dividendo = 0;
      
      readValues(array, input);
      double media = calcularMedia(divisor, dividendo, array);
      
      writeValues(array, media);

      input.close();
   }

   private void readValues(double array[], Scanner input){
      for(int i = 0; i<array.length; i++){
         System.out.println("Digite o valor da posição ["+i+"]");
         array[i] = input.nextDouble();
       }
   }

   private double calcularMedia(int divisor, double dividendo, double array[]){
      for(int j = 0; divisor<array.length; j++){
         dividendo += array[j];
         divisor++;
      }
      return dividendo/divisor;
   }
   
   private void writeValues(double array[], double media){
      System.out.println("Valores do vetor que são maiores que a média:");
      for(int k = 0; k<array.length; k++){
         if(array[k]>media){
            System.out.println(array[k]);
         }
      }
   }
   public static void main(String[] args) {
      new Exe02Uni06();
   }
}
