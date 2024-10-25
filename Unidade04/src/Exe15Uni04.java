/*Elabore um algoritmo para exibir o valor de reajuste que um funcionário receberá no seu salário.
 A empresa irá conceder 5% de reajuste para o funcionário que for admitido há menos de 12 meses. 
 Para funcionário admitido entre 13 e 48 meses, irá conceder 7% de reajuste.
  O seu algoritmo deve solicitar ao usuário que digite a quantidade de meses que o funcionário foi admitido.
 */

import java.util.Scanner;

public class Exe15Uni04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Tempo de admissão do funcionário (meses): ");
        int meses = input.nextInt();

        input.close();

        if (meses>0 && meses<=12){
            System.out.println("Reajuste de 5%.");
        }
        else if (meses>=13 || meses<=48) {
            System.out.println("Reajuste de 7%.");
        }
    }
}
