/*Uma empresa tem para um funcionário os seguintes dados: 
o nome, o número de horas trabalhadas mensais e o número de dependentes.
 A empresa paga R$ 10,00 por hora (valor para cálculo do salário trabalho) 
 e R$ 60,00 por dependente (valor para cálculo do salário família) 
 e são feitos descontos de 8,5% sobre o salário trabalho para o INSS 
 e de 5% sobre o salário trabalho para o imposto de renda. 
 Descreva um programa que informe o nome, o salário bruto e o salário líquido do funcionário.
 */

 import java.util.Scanner;

public class Exe12Uni03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome do funcionário: ");
        String nome = input.nextLine();
        System.out.println("Informe as horas trabalhadas mensalmente: ");
        double horas = input.nextDouble();
        System.out.println("Informe o número de dependentes do empregado: ");
        int dependentes = input.nextInt();
        double salarioT = 10*horas;
        double salarioB = salarioT + 60*dependentes;
        double salarioL = (salarioT*0.915*0.95)+60*dependentes;
        System.out.println("Nome: " + nome);
        System.out.println("Salário bruto: " +salarioB);
        System.out.println("Salário líquido: " + salarioL);
        input.close();
    }
}