/*Escreva um programa que imprime um calendário para um determinado mês. 
O calendário deve conter cada dia do mês e o dia da semana correspondente. 
A entrada consiste de um inteiro especificando em que dia da semana cai o primeiro dia do mês (1=Domingo, 2=Segunda,...,7=Sábado) 
e um inteiro especificando o número de dias que o mês possui.

Exemplo: p = 3 n = 31
D	S	T	Q	Q	S	S
        1	2	3	4	5
6	7	8	9	10	11	12
13	14	15	16	17	18	19
20	21	22	23	24	25	26
27	28	29	30	31	 */

import java.util.Scanner;

public class Exe32Uni05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int dia=0, dias1Semana=0;

        System.out.println("Digite em que dia cai o primeiro dia do mês e o número de dias que o mês possui:");
        int diaDaSemana = input.nextInt(); int qntDias = input.nextInt(); 
        String espaço ="";

        System.out.println("D    S    T    Q    Q    S    S");
        while(dia != qntDias){

            if(dias1Semana==0){
                switch(diaDaSemana){
                    case 1:
                        espaço = "";
                        dias1Semana=7;
                        break;
                    case 2:
                        espaço = "      ";
                        dias1Semana=6;
                        break;
                    case 3:
                        espaço = "          ";
                        dias1Semana=5;
                        break;
                    case 4:
                        espaço = "             ";
                        dias1Semana=4;
                        break;
                    case 5:
                        espaço = "                  ";
                        dias1Semana=3;
                        break;
                    case 6:
                        espaço = "                      ";
                        dias1Semana=2;
                        break;
                    case 7:
                        espaço = "                         ";
                        dias1Semana=1;
                        break;
                }
                System.out.print(espaço);
            }
            else {
                
                for(int j=1; j<=dias1Semana; j++){
                    dia++;
                    System.out.print(dia+"   ");
                    if(dia==qntDias){
                        break;
                    }
                }
                dias1Semana = 7;
                System.out.println();     
            }
        }
        input.close();
    }
}
