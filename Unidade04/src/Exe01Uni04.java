/*A jornada de trabalho semanal de um funcionário é de 40 horas. 
O funcionário que trabalhar mais de 40 horas receberá hora extra, 
cujo cálculo é o valor da hora regular com um acréscimo de 50%. 
Escreva um algoritmo que leia o número de horas trabalhadas em um mês, 
o valor por hora e escreva o salário total do funcionário, que deverá ser acrescido das horas extras, 
caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas). */

import java.util.Scanner;

public class Exe01Uni04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Entre com as horas trabalhadas: ");
        double horasMes = input.nextDouble();
        System.out.print("Entre com valor pago por hora: ");
        double horasValor = input.nextDouble();

        input.close();

        double salarioTotal = horasMes*horasValor;

        if (horasMes>160){
            double horaExtra = (horasMes-160)*(horasValor/2);
            salarioTotal = salarioTotal+horaExtra;
        }

        System.out.println("Salário: "+salarioTotal);
    }
}
