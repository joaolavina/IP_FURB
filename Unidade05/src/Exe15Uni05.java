/*Dada uma turma de alunos, contendo seu nome e nota de duas provas descreva um algoritmo para informar a média de cada aluno. 
Considere que a leitura dos dados deve ser finalizada quando o nome do aluno for “fim”.
 */

 import java.util.Scanner;

 public class Exe15Uni05 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nome = input.nextLine().trim().toLowerCase();
        while (nome != "fim") {

            System.out.println("Digite as notas: ");
            double n1 = input.nextDouble();
            double n2 = input.nextDouble();
            double media = (n1 + n2) / 2;
            System.out.println("NOME: " + nome.toUpperCase());
            System.out.println("MÉDIA: " + media);
            input.nextLine();

            System.out.println("Digite o nome do aluno: ");
            nome = input.nextLine().trim().toLowerCase();

        }
        input.close();
     }
 }
 