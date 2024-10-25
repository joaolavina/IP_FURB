/*Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. 
Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.

Entrada
O arquivo de entrada contém três valores com um dígito após o ponto decimal.

Saída
O arquivo de saída deverá conter 5 linhas de dados. 
Cada linha corresponde a uma das áreas descritas acima, sempre com mensagem correspondente 
e um espaço entre os dois pontos e o valor.
O valor calculado deve ser apresentado com 3 dígitos após o ponto decimal. */

import java.util.Scanner;
import java.util.Locale;
import java.text.DecimalFormat;

public class Uri1012Uni03 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en","US"));
        Scanner input = new Scanner(System.in);
        // Tem como limitar as casas decimais do número de entrada?

        DecimalFormat df_03 = new DecimalFormat("0.000");

        double A = input.nextDouble(); double B = input.nextDouble(); double C = input.nextDouble();

        input.close();

        double triArea = (A*C)/2;
        double cirArea = (C*C)*3.14159;
        double trapArea = ((A+B)*C)/2;
        double quadArea = B*B;
        double retArea = A*B;

        System.out.println("TRIANGULO: "+df_03.format(triArea));
        System.out.println("CIRCULO: "+df_03.format(cirArea));
        System.out.println("TRAPEZIO: "+df_03.format(trapArea));
        System.out.println("QUADRADO: "+df_03.format(quadArea));
        System.out.println("RETANGULO: "+df_03.format(retArea));
    }
}
