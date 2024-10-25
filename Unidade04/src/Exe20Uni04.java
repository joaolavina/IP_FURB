/*Dadas 3 notas obtidas por um aluno em 3 provas e a média dos exercícios, 
descreva um algoritmo que calcule a média de aproveitamento e o conceito do aluno, usando a fórmula:

media=(notaProva1+notaProva2*2+notaProva3*3+notaExercicios)/7

A atribuição dos conceitos obedece à tabela abaixo:

media	     conceito
>= 9.0	        A
>= 7.5 e < 9.0	B
>= 6.0 e < 7.5	C
>= 4.0 e < 6.0	D
< 4.0	        E
O algoritmo deve escrever a média de aproveitamento, o conceito correspondente 
e a mensagem "aprovado" caso o conceito seja A, B ou C, e "reprovado" caso o conceito seja D ou E. */

import java.util.Scanner;

public class Exe20Uni04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a nota da prova 1: ");
        double prova1 = input.nextDouble();
        System.out.print("Digite a nota da prova 2: ");
        double prova2 = input.nextDouble();
        System.out.print("Digite a nota da prova 3: ");
        double prova3 = input.nextDouble();
        System.out.print("Digite a média dos exercícios: ");
        double mediaExe = input.nextDouble();

        input.close();

        double mediaAproveitamento = (prova1+(prova2*2)+(prova3*3)+mediaExe)/7;

        if (mediaAproveitamento<4){
            System.out.println("Média: "+mediaAproveitamento);
            System.out.println("Conceito E");
            System.out.println("Reprovado");
        }
        else if (mediaAproveitamento>=4 && mediaAproveitamento<6){
            System.out.println("Média: "+mediaAproveitamento);
            System.out.println("Conceito D");
            System.out.println("Reprovado");
        }
        else if (mediaAproveitamento>=6 && mediaAproveitamento<7.5){
            System.out.println("Média: "+mediaAproveitamento);
            System.out.println("Conceito C");
            System.out.println("Aprovado");
        }
        else if (mediaAproveitamento>=7.5 && mediaAproveitamento<9){
            System.out.println("Média: "+mediaAproveitamento);
            System.out.println("Conceito B");
            System.out.println("Aprovado");
        }
        else if (mediaAproveitamento>=9){
            System.out.println("Média: "+mediaAproveitamento);
            System.out.println("Conceito A");
            System.out.println("Aprovado");
        }
    }
}
