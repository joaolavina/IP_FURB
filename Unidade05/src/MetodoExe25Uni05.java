import java.util.Scanner;

public class MetodoExe25Uni05 {
    public static void main(String[] args) {
        new MetodoExe25Uni05();
        Scanner input = new Scanner(System.in);

        int pontosD = 0;
        int pontosE = 0;
        String vencedor = " ";

        while (vencedor == " ") {
            System.out.println("Código do jogador:");
            char codigo = input.next().trim().toLowerCase().charAt(0);

            switch (codigo) {
                case 'd':
                    pontosD++;
                    break;
                case 'e':
                    pontosE++;
                    break;
            }

            System.out.println("Placar: ");
            System.out.println("D: " + pontosD);
            System.out.println("E: " + pontosE);

            if (((pontosD == 21) && (pontosD - pontosE == 2))
                    || ((pontosD >= 21) && (pontosD - pontosE >= 2))) {
                vencedor = "JOGADOR D";
                System.out.println(vencedor + " É O VENCEDOR!");
            } else if (((pontosE == 21) && (pontosE - pontosD == 2))
                    || ((pontosE >= 21) && (pontosE - pontosD >= 2))) {
                vencedor = "JOGADOR E";
                System.out.println(vencedor + " É O VENCEDOR!");

            }
        }
        input.close();
    }

    MetodoExe25Uni05() {
        Scanner input = new Scanner(System.in);

        int pontosD = 0;
        int pontosE = 0;
        String vencedor = " ";

        while (vencedor == " ") {
            char codigo = readCode(input);
            switch (codigo) {
                case 'd':
                    pontosD++;
                    break;
                case 'e':
                    pontosE++;
                    break;
            }

            writeScore(pontosD, pontosE);
            vencedor = returnWinner(pontosD, pontosE, vencedor);
        }
    }

    private char readCode(Scanner input) {
        System.out.println("Código do jogador:");
        return input.next().trim().toLowerCase().charAt(0);
    }

    private void writeScore(int pontosD, int pontosE) {
        System.out.println("Placar: ");
        System.out.println("D: " + pontosD);
        System.out.println("E: " + pontosE);

    }

    private String returnWinner(int pontosD, int pontosE, String vencedor) {
        if (((pontosD == 21) && (pontosD - pontosE == 2))
                || ((pontosD >= 21) && (pontosD - pontosE >= 2))) {
            vencedor = "JOGADOR D";
            System.out.println(vencedor + " É O VENCEDOR!");
        } else if (((pontosE == 21) && (pontosE - pontosD == 2))
                || ((pontosE >= 21) && (pontosE - pontosD >= 2))) {
            vencedor = "JOGADOR E";
            System.out.println(vencedor + " É O VENCEDOR!");
        }
        return vencedor;
    }
}
