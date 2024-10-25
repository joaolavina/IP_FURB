/* Os regulamentos de uma competição de pesca impõem um limite no peso total de pesca de um dia. 
Descreva um algoritmo que leia o limite diário (em quilogramas) 
e então leia o peso (em gramas) de cada peixe 
e escreva o peso total da pesca obtido até aquele ponto. 
Quando o limite diário for excedido escreva uma mensagem 
e encerre a execução do algoritmo. 
Para prosseguir com a entrada de dados de pesos de cada peixe
 o algoritmo deve apresentar a seguinte mensagem: 
 “deseja informar o peso de mais um peixe: s (SIM) / n (NÃO)?”.
 
 */

import java.util.Scanner;

public class Exe24Uni05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o limite diário de peso (kg): ");
        double limite = input.nextDouble();
        double pesoTotal = 0;
        char resposta = ' ';

        while (resposta != 'n' || limite > pesoTotal) {
            System.out.println("Digite o peso do peixe (g):");
            double pesoPeixe = input.nextDouble();
            pesoTotal += (pesoPeixe / 1000);
            System.out.println("Peso total: " + pesoTotal + "kg");

            if (limite < pesoTotal) {
                System.out.println("Limite de peso diário excedido.");
            } else {
                System.out.println("Deseja informar o peso de mais um peixe: s (SIM) / n (NÃO)?");
                resposta = input.next().trim().toLowerCase().charAt(0);

            }
        }
        input.close();
    }
}
