/*Em uma disputa de pingue-pongue os pontos são anotados como 
D, ponto para o jogador do lado direito, 
e E, ponto para o jogador do lado esquerdo da mesa. 
Descreva um algoritmo que leia o código do ponto de cada jogada e determine o vencedor. 
A partida encerra quando:

um dos jogadores chegar a 21 pontos e a diferença de pontos entre os jogadores for maior ou igual a dois;
o jogador com mais de 21 pontos conseguir uma diferença de dois pontos sobre o adversário,
 caso a primeira condição não seja atendida. */

import java.util.Scanner;

public class Exe25Uni05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        int pontosD = 0;
        int pontosE = 0;
        String vencedor = " ";

        while (vencedor == " "){
            System.out.println("Código do jogador:");
            char codigo = input.next().trim().toLowerCase().charAt(0);

            switch(codigo){
                case 'd':
                    pontosD++;
                    break;
                case 'e':
                    pontosE++;
                    break;
            }

            System.out.println("Placar: ");
            System.out.println("D: "+pontosD);
            System.out.println("E: "+pontosE);

            if (((pontosD == 21) && (pontosD-pontosE== 2)) 
                || ((pontosD >= 21) && (pontosD-pontosE>= 2))){
                    vencedor = "JOGADOR D";
                    System.out.println(vencedor+" É O VENCEDOR!");
                }
            else if (((pontosE == 21) && (pontosE-pontosD== 2)) 
                || ((pontosE >= 21) && (pontosE-pontosD>= 2))){
                    vencedor = "JOGADOR E";
                    System.out.println(vencedor+" É O VENCEDOR!");
                    
                }
            }
        input.close();
    }
}
/*um dos jogadores chegar a 21 pontos e a diferença de pontos entre os jogadores for maior ou igual a dois;
o jogador com mais de 21 pontos conseguir uma diferença de dois pontos sobre o adversário,
 caso a primeira condição não seja atendida. */