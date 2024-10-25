import java.util.Scanner;

public class MetodoExe13Uni05 {
    public static void main(String[] args) {
        new MetodoExe13Uni05();
    }

    MetodoExe13Uni05(){
        Scanner input = new Scanner(System.in);

        double km = 0;
        double kmTotal = 0;
        double litrosTotal = 0;

        int reabastecimentos = readReabastecimentos(input);
        calculos(reabastecimentos, km, input, kmTotal, litrosTotal);
        input.close();
    }

    private int readReabastecimentos(Scanner input){
        System.out.print("Digite o número de reabastecimentos: ");
        return input.nextInt();
    }

    private void calculos(int reabastecimentos, double km, Scanner input, double kmTotal, double litrosTotal){
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
    }
}
