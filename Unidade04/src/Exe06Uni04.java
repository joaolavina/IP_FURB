/*Faça um algoritmo que leia um caractere. 
Caso seja digitada a letra 'M' escreva “Masculino”. 
Se for digitada a letra 'F' escreva “Feminino”. 
Se for informado 'I' escreva “Não Informado”. 
Qualquer outra letra digitada escreva “Entrada Incorreta”.
Atenção: antes de testar a letra, converta-a para maiúscula. */

import java.util.Scanner;

public class Exe06Uni04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char sexo = input.next().trim().toUpperCase().charAt(0);
        input.close();

        if (sexo == 'F'){
            System.out.println("Feminino");
        }
        else if (sexo == 'M'){
            System.out.println("Masculino");
        }
        else if (sexo == 'I'){   
            System.out.println("Não informado");
        }
        else{
            System.out.println("Entrada Incorreta");
        }
    }
}
