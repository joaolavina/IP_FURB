/*Leia 2 valores com uma casa decimal (x e y), 
que devem representar as coordenadas de um ponto em um plano. 
A seguir, determine qual o quadrante ao qual pertence o ponto, 
ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).


Se o ponto estiver na origem, escreva a mensagem “Origem”.

Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação.

Entrada
A entrada contem as coordenadas de um ponto.

Saída
A saída deve apresentar o quadrante em que o ponto se encontra. */

import java.util.Scanner;

public class Uri1041Uni04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double X = input.nextDouble();double Y = input.nextDouble();
        input.close();

        if (X==0 && Y==0){
            System.out.println("Origem");
        }
        else if (X == 0){
            System.out.println("Eixo Y");
        }
        else if (Y==0){
            System.out.println("Eixo X");
        }
        else if (X>0 && Y>0){
            System.out.println("Q1");
        }
        else if (X<0 && Y>0){
            System.out.println("Q2");
        }
        else if (X<0 && Y<0){
            System.out.println("Q3");
        }
        else if (X>0 && Y<0){
            System.out.println("Q4");
        }
    }
}
