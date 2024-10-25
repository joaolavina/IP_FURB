import java.util.Scanner;

public class App {
    App() {
        Scanner teclado = new Scanner(System.in);

        char[][] matriz = new char[6][7];
        int resposta = 0, jogada = 1;
        char usuário = ' ', computador = ' ';
        String ganhador = "", computadorString = "Computador", usuárioString = "Jogador";
        boolean casaDisponivel;

        do {
            do {
                usuário = lerCorUsuario(teclado);
                computador = retornarCorComputador(usuário, computador);
            } while (usuário != 'V' && usuário != 'A');

            imprimirTabuleiroBranco(matriz);

            ganhador = "";
            while (ganhador == "") {
                casaDisponivel = false;
                while (!casaDisponivel) {
                    jogada = lerJogadaUsuário(jogada, teclado);
                    casaDisponivel = checarCasaDisponivel(casaDisponivel, matriz, jogada, usuário);
                    imprimirJogadaUsuário(casaDisponivel, matriz);
                }
                ganhador = checagemGanhador(matriz, ganhador, usuário, usuárioString);
                jogadaComputador(matriz, computador, ganhador);
                ganhador = checagemGanhador(matriz, ganhador, computador, computadorString);
            }
            resposta = jogarNovamente(resposta, teclado, ganhador);
        } while (resposta == 1);
        teclado.close();
    }

    private char lerCorUsuario(Scanner teclado) {
        System.out.println("Escolha a cor ((V) Vermelho | (A) Azul)");
        return teclado.next().trim().toUpperCase().charAt(0);
    }

    private char retornarCorComputador(char usuário, char computador) {
        if (usuário != 'V' && usuário != 'A') {
            System.out.println("Resposta inválida.");
        } else {
            if (usuário == 'V') {
                computador = 'A';
            } else {
                computador = 'V';
            }
        }
        return computador;
    }

    private void imprimirTabuleiroBranco(char matriz[][]) {
        System.out.println("1 2 3 4 5 6 7");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = 'B';
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private int lerJogadaUsuário(int jogada, Scanner teclado) {
        do {
            System.out.println("Digite uma coluna para jogar: ");
            jogada = teclado.nextInt();
            if (jogada < 0 || jogada > 7) {
                System.out.println("A coluna a se jogada deve estar entre 1 e 7.");
            }
        } while (jogada < 0 || jogada > 7);
        return jogada;
    }

    private boolean checarCasaDisponivel(boolean casaDisponivel, char matriz[][], int jogada, char usuário) {
        int indice = 5;
        while (!casaDisponivel && indice >= 0) {
            if (matriz[indice][jogada - 1] == 'B') {
                matriz[indice][jogada - 1] = usuário;
                casaDisponivel = true;
            } else {
                indice--;
            }
        }
        return casaDisponivel;
    }

    private void imprimirJogadaUsuário(boolean casaDisponivel, char matriz[][]) {
        if (!casaDisponivel) {
            System.out.println("Coluna cheia.");
        } else {
            System.out.println();
            System.out.println("1 2 3 4 5 6 7");
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    private String checagemGanhador(char matriz[][], String ganhador, char charPessoaDaVez, String stringPessoaDaVez) {
        ganhador = checagemEmpate(matriz, ganhador);
        ganhador = checarHorizontal(matriz, charPessoaDaVez, stringPessoaDaVez, ganhador);
        ganhador = checarVertical(matriz, charPessoaDaVez, stringPessoaDaVez, ganhador);
        ganhador = checarDiagonalDireita(matriz, charPessoaDaVez, stringPessoaDaVez, ganhador);
        ganhador = checarDiagonalEsquerda(matriz, charPessoaDaVez, stringPessoaDaVez, ganhador);
        return ganhador;
    }

    private String checagemEmpate(char matriz[][], String ganhador) {
        int qntB = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == 'B') {
                    qntB++;
                }
            }
        }
        if (qntB == 0) {
            ganhador = "Empate!";
        }
        return ganhador;
    }

    private String checarHorizontal(char matriz[][], char charPessoaDaVez, String stringPessoaDaVez, String ganhador) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] == charPessoaDaVez &&
                        matriz[i][j] == matriz[i][j + 1] &&
                        matriz[i][j] == matriz[i][j + 2] &&
                        matriz[i][j] == matriz[i][j + 3]) {
                    ganhador = stringPessoaDaVez + " venceu!";
                }
            }
        }
        return ganhador;
    }

    private String checarVertical(char matriz[][], char charPessoaDaVez, String stringPessoaDaVez, String ganhador) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] == charPessoaDaVez &&
                        matriz[i][j] == matriz[i + 1][j] &&
                        matriz[i][j] == matriz[i + 2][j] &&
                        matriz[i][j] == matriz[i + 3][j]) {
                    ganhador = stringPessoaDaVez + " venceu!";
                }
            }
        }
        return ganhador;
    }

    private String checarDiagonalDireita(char matriz[][], char charPessoaDaVez, String stringPessoaDaVez,
            String ganhador) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] == charPessoaDaVez &&
                        matriz[i][j] == matriz[i + 1][j + 1] &&
                        matriz[i][j] == matriz[i + 2][j + 2] && 
                        matriz[i][j] == matriz[i + 3][j + 3]) {
                    ganhador = stringPessoaDaVez + " venceu!";
                }
            }
        }
        return ganhador;
    }

    private String checarDiagonalEsquerda(char matriz[][], char charPessoaDaVez, String stringPessoaDaVez,
            String ganhador) {
        for (int i = 0; i < 3; i++) {
            for (int j = 3; j < 7; j++) {
                if (matriz[i][j] == charPessoaDaVez && 
                        matriz[i][j] == matriz[i + 1][j - 1] &&
                        matriz[i][j] == matriz[i + 2][j - 2] && 
                        matriz[i][j] == matriz[i + 3][j - 3]) {
                    ganhador = stringPessoaDaVez + " venceu!";
                }
            }
        }
        return ganhador;
    }

    private void jogadaComputador(char matriz[][], char computador, String ganhador) {
        if(ganhador == ""){
            System.out.println("Vez do computador: ");
            boolean casaDisponivel = false;
            while (!casaDisponivel) {
                int jogada = (int) (Math.random() * 7);
    
                int indice = 5;
                while (!casaDisponivel && indice >= 0) {
                    if (matriz[indice][jogada] == 'B') {
                        matriz[indice][jogada] = computador;
                        casaDisponivel = true;
                    } else {
                        indice--;
                    }
                }
    
                if (casaDisponivel) {
                    System.out.println(); 
                    System.out.println("1 2 3 4 5 6 7");
                    for (int i = 0; i < matriz.length; i++) {
                        for (int j = 0; j < matriz[i].length; j++) {
                            System.out.print(matriz[i][j] + " ");
                        }
                        System.out.println();
                    }
                    System.out.println(); 
                }
            }
        }
    }

    private int jogarNovamente(int resposta, Scanner teclado, String ganhador) {
        System.out.println(ganhador);
        
        do {
            System.out.println("Deseja jogar mais uma vez? (1.Sim 2.Não)");
            resposta = teclado.nextInt();
            if (resposta != 1 && resposta != 2) {
                System.out.println("Resposta inválida.");
            }
        } while (resposta != 1 && resposta != 2);
        return resposta;
    }

    public static void main(String[] args) {
        new App();
    }
}