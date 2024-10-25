import java.util.Scanner;

public class Q2 {
    Q2() {
        Scanner input = new Scanner(System.in);

        int[] pacotesEnviados = new int[2];
        int[] pacotes = new int[2];
        int contador1 = 0, contador2 = 0;
        boolean teste = false;
        char resposta = lerResposta(input);

        while (resposta != 'e') {
            switch (resposta) {
                case 'a':
                    contador1 = caseA(input, contador1, pacotes);
                    break;
                case 'b':
                    caseB(input, contador1, pacotes);
                    break;
                case 'c':
                    teste = caseCteste(input, pacotesEnviados, pacotes, contador1, contador2, teste);
                    contador1 = caseC1(contador1, teste);
                    contador2 = caseC2(contador2, teste);
                    break;
                case 'd':
                    System.out
                            .println("Digite qual pacote deseja visualizar (A - Armazém geral E - Pacotes Enviados): ");
                    char pacoteVisualizar = input.next().toUpperCase().trim().charAt(0);
                    caseD(input, contador1, contador2, pacotesEnviados, pacotes, pacoteVisualizar);
                    break;
                case 'e':
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("ERRO: Opção inválida.");
                    System.out.println();
                    break;
            }
            resposta = lerResposta(input);
        }
        input.close();
        System.out.println("Programa encerrado.");
    }

    private int caseA(Scanner input, int contador1, int pacotes[]) {
        System.out.println("Digite o código do pacote a ser cadastrado: ");
        int novoCodigo = input.nextInt();
        if (contador1 == 2) {
            System.out.println("ERRO: Armazém cheio.");
            System.out.println();
        } else {
            boolean encontrado = false;
            for (int i = 0; i < contador1 + 1; i++) {
                if (pacotes[i] == novoCodigo) {
                    encontrado = !encontrado;
                    System.out.println("ERRO: Pacote já cadastrado.");
                    System.out.println();
                }
            }
            if (!encontrado) {
                for (int i = 0; i < contador1 + 1; i++) {
                    if (pacotes[i] == 0) {
                        pacotes[i] = novoCodigo;
                        System.out.println("Pacote cadastrado.");
                        System.out.println();
                        contador1++;
                        break;
                    }
                }
            }
        }
        return contador1;
    }

    private void caseB(Scanner input, int contador1, int pacotes[]) {
        System.out.println("Digite o código do pacote a ser consultado: ");
        int consultaPacote = input.nextInt();
        boolean encontrado = false;
        for (int i = 0; i < contador1; i++) {
            if (pacotes[i] == consultaPacote) {
                System.out.println("Pacote já cadastrado.");
                System.out.println();
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Pacote ainda não foi cadastrado.");
            System.out.println();
        }
    }

    private boolean caseCteste(Scanner input, int pacotesEnviados[], int pacotes[], int contador1, int contador2,
            boolean teste) {
        System.out.println("Digite o código do pacote a ser enviado: ");
        int codigoEnviado = input.nextInt();
        boolean encontrado = false;

        if (contador2 == 2) {
            System.out.println("ERRO: Limite de pacotes não pode ser ultrapassado.");
        }
        else{
            for (int i = 0; i < contador1; i++) {
                if (pacotes[i] == codigoEnviado) {
                    encontrado = true;
                    pacotesEnviados[contador2] = pacotes[i];
                }
            }
    
            for (int j = 0; j < contador1-1; j++) {
                if (pacotes[j] == codigoEnviado) {
                    pacotes[j] = pacotes[j + 1];
                    pacotes[j + 1] = codigoEnviado;
                }
            }
    
            if (encontrado) {
                if (contador2 == 2) {
                    System.out.println("ERRO: Limite de pacotes não pode ser ultrapassado.");
                } else {
                    pacotes[contador1-1] = 0;
                    System.out.println("Pacote enviado.");
                    System.out.println();
                    contador1--;
                    contador2++;
                    teste = true;
                }
            } else {
                System.out.println("ERRO: Pacote não cadastrado.");
                System.out.println();
            }
        }
        return teste;
    }

    private int caseC1(int contador1, boolean teste) {
        if (teste) {
            contador1--;
        }
        return contador1;
    }

    private int caseC2(int contador2, boolean teste) {
        if (teste) {
            contador2++;
        }
        return contador2;
    }

    private void caseD(Scanner input, int contador1, int contador2, int pacotesEnviados[], int pacotes[],
            char pacoteVisualizar) {
        switch (pacoteVisualizar) {
            case 'A':
                System.out.print("Pacotes armazém geral: ");
                for (int i = 0; i < contador1; i++) {
                    System.out.print(pacotes[i] + " | ");
                }
                System.out.println();
                break;

            case 'E':
                System.out.print("Pacotes enviados: ");
                for (int i = 0; i < contador2; i++) {
                    System.out.print(pacotesEnviados[i] + " | ");
                }
                System.out.println();
                break;
            default:
                System.out.println("ERRO: Opção inválida.");
                System.out.println();
                break;
        }
    }

    private char lerResposta(Scanner input) {
        System.out.println("Escolha uma opção: ");
        System.out.println("a. Cadastrar pacote");
        System.out.println("b. Consultar pacote");
        System.out.println("c. Enviar pacote");
        System.out.println("d. Mostrar pacote");
        System.out.println("e. Encerrar programa");
        return input.next().toLowerCase().trim().charAt(0);
    }

    public static void main(String[] args) {
        new Q2();
    }
}
