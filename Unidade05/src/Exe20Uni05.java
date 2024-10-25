/*
 * Um determinado material radioativo perde metade de sua massa a cada 50 segundos. 
 * Dada a sua massa inicial em Kg, descreva um algoritmo que determine o tempo necessário 
 * para que essa massa se torne menor que 0,5 gramas. 
 * Escreva a massa inicial, a massa final e o tempo.
 */

 import java.util.Scanner;

 public class Exe20Uni05 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        int tempo = 0;
        double massa =0;
        double massaInicial = 0;

        System.out.println("Digite a massa do material (kg): ");
        massa = input.nextDouble();
        massaInicial=massa;


        while (massa>0.005){
            massa = massa/2;
            tempo += 50;         
        }

        input.close();

        System.out.println("Massa inicial: "+ massaInicial + " kg");
        System.out.println("Massa final: "+ massa + " kg");
        System.out.println("Tempo de decomposição: "+ tempo + " segundos");
     }
 }
 