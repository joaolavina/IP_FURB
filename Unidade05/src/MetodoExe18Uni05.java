import java.util.Scanner;

public class MetodoExe18Uni05 {
    public static void main(String[] args) {
        new MetodoExe18Uni05();
    }

    MetodoExe18Uni05(){
        Scanner input = new Scanner(System.in);

        int pessoas4 = 0;
        int pessoas5 = 0;
        int pessoas9 = 0;
        int pessoas12 = 0;
        int totalPessoas = 0;

        int canal = readChannel(input);

        while (canal != 0) {
            int pessoas = readPessoas(input);
            switch (canal) {
                case 4:
                    pessoas4 = case4(pessoas, pessoas4);
                    break;
                case 5:
                    pessoas5 = case5(pessoas, pessoas5);
                    break;
                case 9:
                    pessoas9 = case9(pessoas, pessoas9);
                    break;
                case 12:
                    pessoas12 = case12(pessoas, pessoas12);
                    break;
            }
            totalPessoas = calculateTotal(totalPessoas, pessoas);
            canal = readChannel(input);
        }

        writeValues(pessoas12, pessoas4, pessoas5, pessoas9, totalPessoas);

    }

    private int readChannel(Scanner input) {
        System.out.print("Digite o número do canal: ");
        return input.nextInt();
    }

    private int readPessoas(Scanner input) {
        System.out.print("Quantidade de pessoas que estavam assistindo: ");
        return input.nextInt();
    }

    private int case4(int pessoas, int pessoas4) {
        return pessoas4 + pessoas;
    }
    private int case5(int pessoas, int pessoas5) {
        return pessoas5 + pessoas;
    }
    private int case9(int pessoas, int pessoas9) {
        return pessoas9 + pessoas;
    }
    private int case12(int pessoas, int pessoas12) {
        return pessoas12 + pessoas;
    }

    private int calculateTotal(int totalPessoas, int pessoas) {
        return totalPessoas + pessoas;
    }

    private void writeValues(int pessoas12, int pessoas4, int pessoas5, int pessoas9, int totalPessoas) {
        pessoas4 = (pessoas4 * 100) / totalPessoas;
        pessoas5 = (pessoas5 * 100) / totalPessoas;
        pessoas9 = (pessoas9 * 100) / totalPessoas;
        pessoas12 = (pessoas12 * 100) / totalPessoas;

        System.out.println("Canal 4: " + pessoas4 + "%");
        System.out.println("Canal 5: " + pessoas5 + "%");
        System.out.println("Canal 9: " + pessoas9 + "%");
        System.out.println("Canal 12: " + pessoas12 + "%");
    }

}
