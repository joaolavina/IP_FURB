import java.util.Scanner;

public class MetodoExe24Uni05 {
    public static void main(String[] args) {
        new MetodoExe24Uni05();
    }

    MetodoExe24Uni05(){
        Scanner input = new Scanner(System.in);

        double limite = readLimit(input);
        whileMethod(limite, input);
        input.close();
    }

    private double readLimit(Scanner input){
        System.out.println("Digite o limite diário de peso (kg): ");
        return input.nextDouble();
    }

    private void whileMethod(double limite, Scanner input){
        double pesoTotal = 0;
        char resposta = ' ';

        while (resposta != 'n' || limite > pesoTotal) {
            double pesoPeixe = readPeso(input);
            pesoTotal = calculatePesoTotal(pesoTotal,pesoPeixe);
            resposta = ifMethod(input, limite, pesoTotal);
        }
    }

    private double readPeso(Scanner input){
        System.out.println("Digite o peso do peixe (g):");
        return input.nextDouble();
    }

    private double calculatePesoTotal(double pesoTotal, double pesoPeixe){
        pesoTotal += (pesoPeixe / 1000);
        System.out.println("Peso total: " + pesoTotal + "kg");
        return pesoTotal;
    }

    private char ifMethod(Scanner input, double limite, double pesoTotal){
        if (limite < pesoTotal) {
            System.out.println("Limite de peso diário excedido.");
            return 'n';
        } else {
            System.out.println("Deseja informar o peso de mais um peixe: s (SIM) / n (NÃO)?");
            return input.next().trim().toLowerCase().charAt(0);
        }
    }
}
