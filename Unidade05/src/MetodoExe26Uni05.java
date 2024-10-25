import java.util.Scanner;

public class MetodoExe26Uni05 {
    public static void main(String[] args) {
        new MetodoExe26Uni05();
    }

    MetodoExe26Uni05(){
        Scanner input = new Scanner(System.in);

        int qntNegada = 0, trechos = 0, acima150 = 0;

        double valorNegado = readValorNegado(input);
        double valorPedagio = readPedagio(input);

        while (valorPedagio>0){
            double distancia = readDistancia(input);
            trechos++;
            if (valorPedagio>valorNegado){
                qntNegada++;
            }
            else if (distancia>150){
                    acima150++;
            }
            valorPedagio = readPedagio(input);
        }
        writeValues(qntNegada, trechos, acima150);
        input.close();
    }

    private double readValorNegado(Scanner input){
        System.out.println("Digite o valor que Astolfo se nega a pagar:");
        return input.nextDouble();
    }

    private double readPedagio(Scanner input){
        System.out.println("Digite o valor do pedágio: ");
        return input.nextDouble(); 
    }

    private double readDistancia(Scanner input){
        System.out.println("Digite a distância (km) do trecho:");
        return input.nextDouble();
    }

    private void writeValues(int qntNegada, int trechos, int acima150){
        System.out.println(qntNegada+" (trechos com valor acima do qual ele nega-se a pagar)");
        System.out.println(trechos+" (quantidade de trechos informados)");
        System.out.println(acima150+" (trechos acima de 150km com valor aceito por ele)");
    }
}
