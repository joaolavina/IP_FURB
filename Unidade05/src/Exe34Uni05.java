/*Um hotel cobra R$ 50,00 de diária por hóspede e mais uma taxa de serviços. 
A taxa de serviços é de:

R$ 7,50 por diária, caso o número de diárias seja menor que 15;
R$ 6,50 por diária, caso o número de diárias seja igual a 15;
R$ 5,00 por diária, caso o número de diárias seja maior que 15.
Descreva um algoritmo que apresente as seguintes opções ao recepcionista:

(1) encerrar a conta de um hóspede;
(2) verificar número de contas encerradas;
(3) sair.
Caso a opção escolhida seja a primeira, leia o nome e o número de diárias do hóspede e escreva o nome e total a ser pago. 
Caso a opção escolhida seja a segunda, informe o número de hóspedes que deixaram o hotel (número de contas encerradas). 
Caso a opção escolhida seja a terceira finalize a execução do algoritmo.

 */

import java.util.Scanner;

public class Exe34Uni05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opção, contasEncerradas = 0;
        double totalPagar = 50;
        do {
            System.out.println("Digite uma das opções: ");
            System.out.println("(1) encerrar a conta de um hóspede");
            System.out.println("(2) verificar número de contas encerradas");
            System.out.println("(3) sair");
            opção = input.nextInt();

            switch (opção) {
                case 1:
                    System.out.println("Digite o nome e o número de diárias do hóspede: ");
                    String nome = input.next(); int numDiarias = input.nextInt();
                    if(numDiarias<15){
                        totalPagar += (numDiarias*7.5);
                    }
                    else if(numDiarias==15){
                        totalPagar += (numDiarias*6.5);
                    }
                    else {
                        totalPagar += (numDiarias*0.5);
                    }
                    System.out.println("Hóspede: "+nome);
                    System.out.println("Total a pagar: R$"+totalPagar);
                    contasEncerradas++;
                    totalPagar = 50;
                    break;
                case 2:
                    System.out.println("Contas encerradas: "+contasEncerradas);
                    break;
                case 3:
                    break;
            }
        } while (opção != 3);

        input.close();
    }
}
