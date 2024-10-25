/*O índice de massa corporal (IMC) é uma medida internacional usada para calcular se uma pessoa está no peso ideal.
 O IMC é determinado pela divisão da massa do indivíduo pelo quadrado de sua altura,
  onde a massa está em quilogramas e a altura está em metros, de acordo com a fórmula:

 IMC={Massa}{Altura^2}

Faça um algoritmo para classificar o IMC e dizer o grau de obesidade do indivíduo, de acordo com a seguinte tabela: 
IMC	            Classificação
< 18.5	            Magreza
18.5 - 24.9	      Saudável
25.0 - 29.9	      Sobrepeso
30.0 - 34.9	    Obesidade Grau I
35.0 - 39.9	   Obesidade Grau II (severa)
>= 40.0	     Obesidade Grau III (mórbida)

*/

import java.util.Scanner;

public class Exe21Uni04 {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a altura (em metros): ");
        double altura = input.nextDouble();
        System.out.print("Digite o peso (em quilogramas): ");
        double massa = input.nextDouble();

        input.close();

        double indiceIMC = massa/(altura*altura);

        if (indiceIMC<18.5){
            System.out.println("IMC: "+indiceIMC);
            System.out.println("Classificação: Magreza");
        }
        else if (indiceIMC>=18.5 && indiceIMC<25){
            System.out.println("IMC: "+indiceIMC);
            System.out.println("Classificação: Saudável");
        }
        else if (indiceIMC>=25 && indiceIMC<30){
            System.out.println("IMC: "+indiceIMC);
            System.out.println("Classificação: Sobrepeso");
        }
        else if (indiceIMC>=30 && indiceIMC<35){
            System.out.println("IMC: "+indiceIMC);
            System.out.println("Classificação: Obesidade Grau I");
        }
        else if (indiceIMC>=35 && indiceIMC<40){
            System.out.println("IMC: "+indiceIMC);
            System.out.println("Classificação: Obesidade Grau II (severa)");
        }
        else if (indiceIMC>40){
            System.out.println("IMC: "+indiceIMC);
            System.out.println("Classificação: Obesidade Grau III (mórbida)");
        }
    }
}