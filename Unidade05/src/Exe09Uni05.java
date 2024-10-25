/*Uma turma tem n alunos. Dado n, o nome e idade de cada aluno descreva um algoritmo que:

escreva os nomes dos alunos que tem 18 anos;
escreva a quantidade de alunos que tem idade acima de 20 anos. */

import java.util.Scanner;

public class Exe09Uni05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de alunos: ");
        int n = input.nextInt();
        input.nextLine();

        int qntMaiorque20 = 0;
        String nome18= " ";;

        System.out.println("Digite o nome e idade dos alunos: ");
        for (int i = 1; i<=n; i++){
            String nome = input.next().trim(); int idade = input.nextInt();


            if (idade>20){
                qntMaiorque20++;
            }
            else if(idade==18){
                if(i==n){
                nome18 = nome18 + nome + ".";    
                }
                else{
                nome18 = nome18 + nome + ", ";    
                }
            }

        }
        input.close();
        System.out.println("Quantidade de alunos com mais de 20 anos: "+qntMaiorque20);
        System.out.println("Alunos com 18 anos:"+nome18);
    }
}
