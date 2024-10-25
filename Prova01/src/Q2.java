import java.util.Scanner;
import java.text.DecimalFormat;


public class Q2 {
    public static void main(String[] args) {
        DecimalFormat df_02 = new DecimalFormat("0.00");
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o código: ");
        char codigo = input.next().trim().toUpperCase().charAt(0);

        if (codigo != 'A' && codigo != 'B' && codigo != 'C' && codigo != 'D' && codigo != 'E' && codigo != 'F'){
            System.out.println("Código inválido");
        }
        else{
            System.out.print("Digite o salário: ");
            double salario = input.nextDouble();
            double valorAumento;

            if (salario<=0){
                System.out.println("Salário inválido");
            }
            else{
                switch(codigo){
                    case 'A':
                        valorAumento = salario*0.3;
                        salario = salario*1.3;
                        if (salario>5000){
                            System.out.println("Salário inválido");
                        }
                        else{
                            System.out.println("Cargo: Suporte");
                            System.out.println("Valor do aumento: R$"+df_02.format(valorAumento));
                            System.out.println("Novo salário: R$"+df_02.format(salario));
                        }
                        break;
                    case 'B':
                        valorAumento = salario*0.2;
                        salario = salario*1.2;
                        if (salario>5000){
                            System.out.println("Salário inválido");
                        }
                        else {
                            System.out.println("Cargo: Programador Junior");
                            System.out.println("Valor do aumento: R$"+df_02.format(valorAumento));
                            System.out.println("Novo salário: R$"+df_02.format(salario));
                        }
                        break;
                    case 'C':
                        if (salario<=5000 || salario>10000){
                            System.out.println("Salário inválido");
                        }
                        else {
                            valorAumento = salario*0.2;
                            salario = salario*1.2;
                            System.out.println("Cargo: Programador Pleno");
                            System.out.println("Valor do aumento: R$"+df_02.format(valorAumento));
                            System.out.println("Novo salário: R$"+df_02.format(salario));
                        }
                        break;
                    case 'D':
                        if (salario<15000){
                            System.out.println("Salário inválido");
                        }
                        else {
                            valorAumento = salario*0.1;
                            salario = salario*1.1;
                            System.out.println("Cargo: Programador Senior");
                            System.out.println("Valor do aumento: R$"+df_02.format(valorAumento));
                            System.out.println("Novo salário: R$"+df_02.format(salario));
                        }
                        break;
                    case 'E':
                        if (salario>20000){
                            System.out.println("Salário inválido");
                        }
                        else {
                            valorAumento = salario*0.1;
                            salario = salario*1.1;
                            System.out.println("Cargo: Gerente");
                            System.out.println("Valor do aumento: R$"+df_02.format(valorAumento));
                            System.out.println("Novo salário: R$"+df_02.format(salario));
                        }
                        break;
                    case 'F':
                        if (salario<30000){
                            System.out.println("Salário inválido");
                        }
                        else {
                            System.out.println("Cargo: Diretor");
                            System.out.println("Não possui aumento");
                        }
                }
            }   
        }
        input.close();
    }
}
