/*Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2) 
e calcule a distância entre eles, mostrando 4 casas decimais após a vírgula, segundo a fórmula:

Distancia = (formula de distancia entre dois pontos)

Entrada
O arquivo de entrada contém duas linhas de dados. 
A primeira linha contém dois valores de ponto flutuante: x1 y1 
e a segunda linha contém dois valores de ponto flutuante x2 y2.

Saída
Calcule e imprima o valor da distância segundo a fórmula fornecida, com 4 casas após o ponto decimal. */

import java.util.Scanner;
import java.util.Locale;
import java.text.DecimalFormat;
import java.lang.Math;

public class Uri1015Uni03 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en","US"));
        Scanner input = new Scanner(System.in);

        DecimalFormat df_04 = new DecimalFormat("0.0000");

        double x1 = input.nextDouble(); double y1 = input.nextDouble();
        double x2 = input.nextDouble(); double y2 = input.nextDouble();

        input.close();

        double distancia = Math.sqrt((Math.pow((x2-x1), 2)+Math.pow(y2-y1,2)));

        System.out.println(df_04.format(distancia));
    }
}