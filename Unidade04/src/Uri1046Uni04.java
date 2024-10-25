/*Leia a hora inicial e a hora final de um jogo.
 A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, 
 tendo uma duração mínima de 1 hora e máxima de 24 horas.

Entrada
A entrada contém dois valores inteiros representando a hora de início e a hora de fim do jogo.

Saída
Apresente a duração do jogo conforme exemplo abaixo. */

import java.util.Scanner;

public class Uri1046Uni04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int inicio = input.nextInt(); int fim = input.nextInt();
        input.close();
        int duracao = 0;

        if (fim>inicio){
            duracao = fim - inicio;
            System.out.println("O JOGO DUROU "+duracao+" HORA(S)");
        }
        else if (fim==inicio){
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }
        else if (fim<inicio){
            duracao = (24-inicio) + fim;
            System.out.println("O JOGO DUROU "+duracao+" HORA(S)");
        }
    }
}
