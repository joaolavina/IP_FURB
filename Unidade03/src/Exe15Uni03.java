/*
Construa um programa para ler um número inteiro (assuma até 3 dígitos) 
e imprima a saída da seguinte forma:
x centena(s) y dezena(s) k unidade(s)
 */

 import java.util.Scanner;

 public class Exe15Uni03 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Digite um número de 3 dígitos: ");
         int number = input.nextInt();
         int centena = number/100;
         int dezena = (number%100)/10;
         int unidade = ((number%100)%10);
         System.out.println(centena +" centena(s) " + dezena + " dezena(s) " + unidade + " unidade(s)");
         input.close();
     }    
     
 }
 
 //later I found out that didn't need to convert double to int
 
 