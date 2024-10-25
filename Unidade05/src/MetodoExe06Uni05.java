import java.util.Scanner;

public class MetodoExe06Uni05 {
    public static void main(String[] args) {
        new MetodoExe06Uni05();
    }

    MetodoExe06Uni05(){
        Scanner input = new Scanner(System.in);

        double media = readAltura(input);
        calculateMedia(media);
    }

    private double readAltura(Scanner input){
        System.out.println("Digite a altura de 20 pessoa: ");
        double media = 0;
        for(int i=0; i<20; i++){
            double altura = input.nextDouble();
            media += altura;
        }
        return media;
    }

    private void calculateMedia(double media){
        media = media/20;
        System.out.println("Média de altura: " + media);
    }
}
