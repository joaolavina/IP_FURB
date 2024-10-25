/*Um motorista acaba de voltar de um feriado prolongado. 
Antes de sair de viagem e imediatamente após retornar, 
o motorista encheu o tanque do veículo e registrou as medidas do odômetro. 
Em cada parada feita durante a viagem, foi registrado o valor do odômetro 
e a quantidade de combustível comprado para reabastecer o veículo 
(suponha que o tanque foi enchido a cada parada). 
Descreva um algoritmo que leia o número total de reabastecimentos feitos 
e os dados registrados relativos à compra de combustível. Calcule e escreva:

a quilometragem obtida por litro de combustível em cada parada;
a quilometragem média obtida por litro de combustível em toda a viagem.
 */

import java.util.Scanner;

public class Exe13Uni05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double km = 0;
        double kmTotal = 0;
        double litrosTotal = 0;

        System.out.print("Digite o número de reabastecimentos: ");
        int reabastecimentos = input.nextInt();

        for(int i=0; i<reabastecimentos; i++){
            double kmAntigo = km;
            System.out.print("Quantidade abastecida na "+(i+1)+"° parada (litros): ");
            double litros = input.nextDouble();
            System.out.print("Valor obtido no odômetro na "+(i+1)+"° parada (km): ");
            km = input.nextDouble();

            if (i==0){
                kmAntigo = km;
            }

            double kmLParada = (km - kmAntigo)/litros;
            System.out.println("Quilometragem por litro na "+(i+1)+"° parada: "+kmLParada+" km/L.");
            kmTotal = (kmTotal)+(km - kmAntigo);
            litrosTotal = litrosTotal + litros;
        }
        double kmLTotal = kmTotal/litrosTotal;
        System.out.println("Quilometragem por litro durante toda a viagem: "+kmLTotal+" km/L.");
        input.close();
    }
}