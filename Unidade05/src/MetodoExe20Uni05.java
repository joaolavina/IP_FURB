import java.util.Scanner;

public class MetodoExe20Uni05 {
    public static void main(String[] args) {
        new MetodoExe20Uni05();
    }

    MetodoExe20Uni05(){
        Scanner input = new Scanner(System.in);
 
        int tempo = 0;
        double massa = readMassa(input);
        writeMassa(massa, tempo);

        input.close();
    }

    private void writeMassa(double massa, int tempo){
        double massaInicial = massa;
        while (massa>0.005){
            massa = halfLife(massa);
            tempo = addTempo(tempo);
        }
        System.out.println("Massa inicial: "+ massaInicial + " kg");
        System.out.println("Massa final: "+ massa + " kg");
        System.out.println("Tempo de decomposição: "+ tempo + " segundos");
    }

    private double halfLife(double massa){
        return massa/2;
    }

    private int addTempo(int tempo){
        return tempo+50;
    }

    private double readMassa(Scanner input){
        System.out.println("Digite a massa do material (kg): ");
        return input.nextDouble();
    }
}
