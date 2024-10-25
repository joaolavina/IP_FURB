/*O custo do selo de uma carta com até 50 gramas é de R$ 0,45.
 As cartas com peso superior pagam um adicional de R$ 0,45 por cada 20 gramas,
ou fração, em que excedem aquele peso. Escreva um algoritmo que dado o peso da carta, em gramas, 
determine o custo do selo. */

import java.util.Scanner;

public class Exe07Uni04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Entre com o peso da carta: ");
        double peso = input.nextDouble();
        input.close();

        double valorPagar = 0;

        if (peso<=50){
            valorPagar = 0.45;
        }
        else{
            double valorExcedido = (peso-50);
            int qtAdicional = (int) ((valorExcedido/20)+1);
            valorPagar = 0.45f + 0.45f*qtAdicional;
        }

        System.out.println("Custo do selo: "+valorPagar);
    }
}

