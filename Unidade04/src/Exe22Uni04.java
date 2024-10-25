/*Um aluno está em dúvida sobre o título que vai receber após concluir seu curso de graduação. 
Considerando que o sistema apresenta 3 cursos disponíveis 
(1 – Ciência da Computação, 2 – Licenciatura da Computação e 3 – Sistemas de Informação)
 descreva um algoritmo para ler a opção do aluno e escrever uma mensagem informando o título 
 que o aluno vai receber caso opte por aquele curso. 
 As titulações são respectivamente: "Bacharel em Ciência da Computação", "Licenciado em Computação" 
 e "Bacharel em Sistemas de Informação".

 */

import java.util.Scanner;

public class Exe22Uni04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o curso: ");
        String curso = input.nextLine().trim();

        input.close();


        switch(curso){
            case "Ciência da Computação":
                System.out.println("Bacharel em Ciência da Computação");
                break;
            case "Licenciatura em Ciência da Computação":
                System.out.println("Licenciado em Computação");
                break;
            case "Sistemas de Informação":
                System.out.println("Bacharel em Ciência da Computação");
                break;
        }
    }
}
