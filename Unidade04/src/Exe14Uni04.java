/*Leia uma data e determine se ela é válida. Ou seja, verifique se o mês está entre 1 e 12, 
e se o dia existe naquele mês. Note que fevereiro tem 29 dias em anos bissextos, e 28 dias em anos não bissextos. */

import java.util.Scanner;

public class Exe14Uni04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o dia: ");
        int dia = input.nextInt();
        System.out.print("Digite o mês: ");
        int mes = input.nextInt();
        System.out.print("Digite o ano: ");
        int ano = input.nextInt();

        input.close();

        if (dia>0 && dia<32 && mes>0 && mes<13 && ano>0){
            if (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12){
                System.out.println("Data válida.");
            }
            else{
                if (mes!=2 && dia<31){
                    System.out.println("Data válida.");
                }
                else{
                    if (dia==29 && ano%4==0 && !(ano%100==0 && ano%400!=0)){
                        System.out.println("Data válida.");
                    }
                    else{
                        System.out.println("Data não válida.");       
                    }
                }
            }
        }    
        else{
            System.out.println("Data não válida.");       
        }
    }
}