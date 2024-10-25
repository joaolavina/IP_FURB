/* Um motorista deseja abastecer seu tanque de combustível. 
Escreva um programa para ler o preço do litro da gasolina e o valor do pagamento 
e exibir quantos litros ele conseguiu colocar no tanque.
*/

import java.util.Scanner;

public class Exe03Uni03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o preço da gasolina (Litro): ");
        double preçoLitro = input.nextDouble();
        System.out.println("Digite o valor do pagamento: ");
        double pagamento = input.nextDouble();
        double litros = pagamento/preçoLitro;
        System.out.println("Quantidade de litros: " + litros);
        input.close();
    }
}
