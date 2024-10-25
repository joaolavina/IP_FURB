/* A fórmula para calcular a área de uma circunferência é: area = π . raio2. 
Considerando para este problema que π = 3.14159:

- Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π.

Entrada
A entrada contém um valor de ponto flutuante (dupla precisão), no caso, a variável raio.

Saída
Apresentar a mensagem "A=" seguido pelo valor da variável area, conforme exemplo abaixo, 
com 4 casas após o ponto decimal. Utilize variáveis de dupla precisão (double). 
Como todos os problemas, não esqueça de imprimir o fim de linha após o resultado, 
caso contrário, você receberá "Presentation Error".
 */

import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Locale;

public class Uri1002Uni03 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        Scanner input = new Scanner(System.in);

        // Declaração da formatação do decimal
        DecimalFormat df_04 = new DecimalFormat("0.0000");

        
        double R = input.nextDouble();

        input.close();

        // Calculo da área
        double area = 3.14159*R*R;

        // Formata a variável e imprime a mensagem
        System.out.println("A="+df_04.format(area));
    }
}
