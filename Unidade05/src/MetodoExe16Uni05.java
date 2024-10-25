import java.util.Scanner;

public class MetodoExe16Uni05 {
    public static void main(String[] args) {
        new MetodoExe16Uni05();
    }

    MetodoExe16Uni05() {
        Scanner input = new Scanner(System.in);

        double alturaF = 0;
        double alturaTotal = 0;
        int vezesF = 0;
        int vezes = 0;

        char sexo = readGender(input);
        double altura = readHeight(input);

        calculateAltura(sexo, vezesF, alturaF, altura, alturaTotal, vezes, input);

        input.close();
    }

    private char readGender(Scanner input) {
        System.out.print("Digite o sexo: ");
        return input.next().toLowerCase().trim().charAt(0);
    }

    private double readHeight(Scanner input) {
        System.out.print("Digite a altura: ");
        return input.nextDouble();
    }

    private void calculateAltura(char sexo, int vezesF, double alturaF, double altura, double alturaTotal, int vezes,
            Scanner input) {
        while (altura != 0) {
            if (sexo == 'f') {
                vezesF++;
                alturaF += altura;
            }

            alturaTotal += altura;
            vezes++;
            sexo = readGender(input);
            altura = readHeight(input);
        }
        double mediaF = alturaF / vezesF;
        double media = alturaTotal / vezes;
        System.out.println("MÉDIA ALTURA FEMININA = " + mediaF);
        System.out.println("MÉDIA ALTURA DO GRUPO = " + media);
    }
}
