
/*
 Descreva um programa que dado uma temperatura em °C informe o seu valor em °F. Fórmula:

°F = (9/5) °C + 32
 */

 import java.util.Scanner;

 public class Exe11Uni03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe a temporada em °C: ");
        float celsius = input.nextFloat();
        float fahrenheit = (9/5)*celsius+32; 
        System.out.println("Temperatura em °F: " +fahrenheit);
        input.close();
    }
}
/* this time I used a float instead of a double
 cause in this context it's not necessary to a large variable
 when I'm using only one or two decimal numbers
*/