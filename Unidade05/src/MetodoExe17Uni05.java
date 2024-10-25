import java.util.Scanner;

public class MetodoExe17Uni05 {
    public static void main(String[] args) {
        new MetodoExe17Uni05();
    }

    MetodoExe17Uni05(){
        Scanner input = new Scanner(System.in);

        double maior = Double.MIN_VALUE;
        double menor = Double.MAX_VALUE;
        int niMaior = 0;
        int niMenor = 0;
        int atletas = 0;
        double media = 0;
        double altura = media;

        int numeroInscricao = readNumeroDeInscriçao(input);
        calculateMedia(input, numeroInscricao, altura, maior, menor, media, atletas, niMaior, niMenor);

        input.close();
    }

    private int readNumeroDeInscriçao(Scanner input){
        System.out.print("Número de inscrição: ");
        return input.nextInt();
        
    }

    private double readAltura(Scanner input){
        System.out.print("Altura: ");
        return input.nextDouble();
    }

    private void calculateMedia(Scanner input, int numeroInscricao, double altura, double maior, double menor, double media, int atletas, int niMaior, int niMenor){
        while (numeroInscricao != 0) {
            altura = readAltura(input);
            if (altura > maior) {
                maior = altura;
                niMaior = numeroInscricao;
            }

            if (altura < menor) {
                menor = altura;
                niMenor = numeroInscricao;
            }

            atletas++;

            media = media + altura;

            numeroInscricao = readNumeroDeInscriçao(input);
        }
        media = media / atletas;
        System.out.println("ATLETA MAIS BAIXO: " + niMenor);
        System.out.println("Altura: " + menor);
        System.out.println("ATLETA MAIS ALTO: " + niMaior);
        System.out.println("Altura: " + maior);
        System.out.println("ALTURA MÉDIA DOS ATLETAS: " + media);
    }
}
