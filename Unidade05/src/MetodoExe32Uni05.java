import java.util.Scanner;

public class MetodoExe32Uni05 {
    public static void main(String[] args) {
        new MetodoExe32Uni05();
    }

    MetodoExe32Uni05() {
        Scanner input = new Scanner(System.in);
        String espaço = "";
        int dia = 0, dias1Semana = 0;
        int diaDaSemana = readDiaDaSemana(input);
        int qntDias = readQntdDias(input);
        System.out.println("D    S    T    Q    Q    S    S");
        while (dia != qntDias) {
            if (dias1Semana == 0) {
                switch (diaDaSemana) {
                    case 1:
                        espaço = "";
                        dias1Semana = 7;
                        break;
                    case 2:
                        espaço = "      ";
                        dias1Semana = 6;
                        break;
                    case 3:
                        espaço = "          ";
                        dias1Semana = 5;
                        break;
                    case 4:
                        espaço = "             ";
                        dias1Semana = 4;
                        break;
                    case 5:
                        espaço = "                  ";
                        dias1Semana = 3;
                        break;
                    case 6:
                        espaço = "                      ";
                        dias1Semana = 2;
                        break;
                    case 7:
                        espaço = "                         ";
                        dias1Semana = 1;
                        break;
                }
                System.out.print(espaço);
            } else {
                dia = printDias(dias1Semana, diaDaSemana, qntDias);
                dias1Semana = 7;
                System.out.println();
            }
            input.close();
        }
    }

    private int readDiaDaSemana(Scanner input) {
        System.out.println("Digite em que dia cai o primeiro dia do mês:");
        return input.nextInt();
    }

    private int readQntdDias(Scanner input) {
        System.out.println("Digite o número de dias que o mês possui:");
        return input.nextInt();
    }

    private int printDias(int dias1Semana, int dia, int qntDias) {
        for (int j = 1; j <= dias1Semana; j++) {
            dia++;
            System.out.print(dia + "   ");
            if (dia == qntDias) {
                break;
            }
        }
        return dia;
    }
}
