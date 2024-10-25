import java.util.Scanner;

public class MetodoExe27Uni05 {
    public static void main(String[] args) {
        new MetodoExe27Uni05();
    }

    MetodoExe27Uni05(){
        Scanner input = new Scanner(System.in);

        int totalPeças = 0, totalPeçasManhã = 0, totalPeçasTarde = 0, diaMaiorProdução = 0, resposta = 0;
        double valor = 0;

        while (resposta != 2) {
            int dia = readDias(input);
            if (dia >= 31 || dia <= 0) {
                System.out.println("Dia inválido.");
            } else {
                int peçasManhã = readPeçasManha(input);
                int peçasTarde = readPeçasTarde(input);
                if (totalPeças < (peçasManhã + peçasTarde)) {
                    diaMaiorProdução = dia;
                }
                totalPeças = peçasManhã + peçasTarde;
                totalPeçasManhã += peçasManhã;
                totalPeçasTarde += peçasTarde;
                valor = calculateValor(dia, totalPeças, peçasManhã, peçasTarde, valor);
                resposta = readResposta(input);
            }
        }
        writeValues(diaMaiorProdução, totalPeçasManhã, totalPeçasTarde); 
        input.close();
    }

    private int readDias(Scanner input){
        System.out.println("Digite o dia do mês de abril: ");
        return input.nextInt();
    }

    private int readPeçasManha(Scanner input){
        System.out.println("Digite o total de peças produzidas no turno da manhã: ");
        return input.nextInt();
    }

    private int readPeçasTarde(Scanner input){
        System.out.println("Digite o total de peças produzidas no turno da tarde: ");
        return input.nextInt();
    }

    private double calculateValor(int dia, int totalPeças, int peçasManhã, int peçasTarde, double valor){
        if (dia <= 15) {
            if ((totalPeças >= 100) && peçasManhã >= 30 && peçasTarde >= 30) {
                valor = totalPeças * 0.8;
            } else {
                valor = totalPeças * 0.5;
            }
        } else {
            valor = (peçasManhã * 0.4) + (peçasTarde * 0.3);
        }
        System.out.println("R$ " + valor);
        return valor;
    }

    private int readResposta(Scanner input){
        System.out.println("Novo funcionário: (1.sim 2.não)?");
        return input.nextInt();
    }

    private void writeValues(int diaMaiorProdução, int totalPeçasManhã, int totalPeçasTarde){
        System.out.println("Dia de maior produção: " + diaMaiorProdução);
        System.out.println("Quantidade produzida no turno da manhã: " + totalPeçasManhã);
        System.out.println("Quantidade produzida no turno da tarde: " + totalPeçasTarde);
        if (totalPeçasManhã > totalPeçasTarde) {
            System.out.println("O funcionário produz mais no turno da manhã");
        } else {
            System.out.println("O funcionário produz mais no turno da tarde");
        }
    }
}
