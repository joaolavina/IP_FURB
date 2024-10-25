
/*Timelimit: 1
Leia 2 valores de ponto flutuante de dupla precisão A e B, que correspondem a 2 notas de um aluno.
 A seguir, calcule a média do aluno, sabendo que a nota A tem peso 3.5 e a nota B tem peso 7.5 (A soma dos pesos portanto é 11).
  Assuma que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.

Entrada
O arquivo de entrada contém 2 valores com uma casa decimal cada um.

Saída
Imprima a mensagem "MEDIA" e a média do aluno conforme exemplo abaixo, com 5 dígitos após o ponto decimal
 e com um espaço em branco antes e depois da igualdade. Utilize variáveis de dupla precisão (double) e como todos os problemas,
não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error". */

import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Locale;

public class Uri1005Uni03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
    
        Locale.setDefault(new Locale("en","US"));
        DecimalFormat df_05 = new DecimalFormat("0.00000");

        double A = input.nextDouble();
        double B = input.nextDouble();

        input.close();

        double MEDIA = ((A*3.5)+(B*7.5))/11;

        System.out.println("MEDIA = "+df_05.format(MEDIA));
    }
}
