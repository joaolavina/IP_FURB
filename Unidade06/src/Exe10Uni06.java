/*Uni6Exe10.java - Dado um vetor de números inteiros, com capacidade limitada a 50 elementos, 
faça um programa que construa um menu com as seguintes opções:

“1 – Incluir valor”: nesta opção inclua o valor no fim do vetor, se houver espaço. 
Informe o usuário se o valor foi incluído no vetor ou não;

“2 – Pesquisar valor”: nesta opção leia um valor e informe se o mesmo está no vetor;

“3 – Alterar valor”: nesta opção informe um número a ser alterado e um novo número a ser colocado no lugar 
(só para a primeira ocorrência deste número). Caso o número a ser alterado exista no vetor, substitua-o pelo novo número. 
Caso contrário, informe “número não encontrado”;

“4 – Excluir valor”: nesta opção leia um valor e, caso ele esteja no vetor, exclua-o. 
Informe o usuário se o valor foi excluído do vetor ou não.
 A posição que foi excluída o valor deve ser preenchida pelo valor seguinte, sucessivamente até o final dos valores do vetor;
 
“5 – Mostrar valores”: nesta opção mostre todos os valores armazenados no vetor;

“6 – Ordenar valores”: ordene todos os valores do vetor em ordem crescente;

“7 – Inverter valores”: desafio (ver abaixo);

“8 – Sair do sistema”: nesta opção deve ser finalizada a execução do programa.

Faça um método para cada uma das opções do menu. O menu deve-se repetir até que o usuário escolha a opção 8.

Para a opção "6 - Ordenar valores" se pode usar o "método bolha" explicado neste vídeo. 
Existem também outros vídeos que mostram a lógica de ordenação usando o "método bolha", no caso é só procurar por "Bubble Sort". 
Um deles é Bubble Sort | GeeksforGeeks. 
Um outro um pouco mais "divertido" procura mostrar a lógica usando uma coreografia de dança: Bubble sort with Hungarian, folk dance.

Desafio: adapte o código acima para ter mais uma opção no menu para também poder inverter os elementos dentro de um vetor. 
Assim o último elemento passa a ser o primeiro, o penúltimo passa ser o segundo, e assim sucessivamente para todos os elementos da lista. 
Mas lembre, não se deve considerar o vetor inteiro, mas somente os elementos que já foram adicionados no vetor. 
Como base use o código descrito em vetorInverter.java.

 */

import java.util.Scanner;

public class Exe10Uni06 {
    Exe10Uni06() {
        Scanner input = new Scanner(System.in);

        int resposta;
        int contador = 0;
        int array[] = new int[50];

        do {
            resposta = returnResposta(input);

            switch (resposta) {
                case 1:
                    contador = case1(input, contador, array);
                    break;

                case 2:
                    case2(input, contador, array);
                    break;

                case 3:
                    case3(input, contador, array);
                    break;

                case 4:
                    contador = case4(input, array, contador);
                    break;

                case 5:
                    case5(contador, array);
                    break;

                case 6:
                    case6(array, contador);
                    break;

                case 7:
                    case7(contador, array);
                    break;

                case 8:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (resposta != 8);
        input.close();
    }

    private int returnResposta(Scanner input) {
        System.out.println("Escolha uma das opções:");
        System.out.println("1 - Incluir valor");
        System.out.println("2 - Pesquisar valor");
        System.out.println("3 - Alterar valor");
        System.out.println("4 - Excluir valor");
        System.out.println("5 - Mostrar valores");
        System.out.println("6 - Ordenar valores");
        System.out.println("7 - Inverter valores");
        System.out.println("8 - Sair do sistema");
        return input.nextInt();
    }

    private int case1(Scanner input, int contador, int array[]) {
        System.out.print("Digite o valor a ser incluido: ");
        int incluido = input.nextInt();
        if (contador >= 50) {
            System.out.println("Valor não incluído (array cheio).");
        } else {
            array[contador] = incluido;
            contador++;
            System.out.println("Valor incluído.");
        }
        return contador;
    }

    private void case2(Scanner input, int contador, int array[]) {
        System.out.print("Digite o valor a ser procurado: ");
        int procurado = input.nextInt();
        boolean encontrado2 = false;
        for (int i = 0; i < contador; i++) {
            if (array[i] == procurado) {
                encontrado2 = !encontrado2;
            }
        }
        if (!encontrado2) {
            System.out.println("Valor não encontrado.");
        } else {
            System.out.println("Valor encontrado.");
        }
    }

    private void case3(Scanner input, int contador, int array[]) {
        System.out.println("Digite o numero a ser alterado");
        int numeroParaAlterar = input.nextInt();
        boolean encontrado3 = false;
        for (int i = 0; i < contador; i++) {
            if (array[i] == numeroParaAlterar) {
                encontrado3 = !encontrado3;
                System.out.println("Digite o novo número a ser colocado: ");
                int novoNumero = input.nextInt();
                array[i] = novoNumero;
                System.out.println("Número alterado");
                break;
            }
        }
        if (!encontrado3) {
            System.out.println("Valor não encontrado.");
        }
    }

    private int case4(Scanner input, int array[], int contador) {
        System.out.println("Digite o número a ser excluido: ");
        int excluido = input.nextInt();
        boolean encontrado4 = false;
        if (array[0] == excluido) {
            array[0] = array[1];
            array[1] = excluido;
            encontrado4 = true;
        }
        for (int i = 0; i < contador - 1; i++) {
            if (array[i] == excluido) {
                array[i] = array[i + 1];
                array[i + 1] = excluido;
                encontrado4 = true;
            }
        }
        if (encontrado4) {
            contador--;
            System.out.println("Número excluído.");
        } else {
            System.out.println("Número não encontrado.");
        }

        return contador;
    }

    private void case5(int contador, int array[]) {
        System.out.print("Vetor: ");
        for (int i = 0; i < contador; i++) {
            System.out.print("[" + array[i] + "]");
        }
        System.out.println();
    }

    private void case6(int array[], int contador) {
        for (int i = 0; i < (contador - 1); i++) {
            if (array[i] > array[i + 1]) {
                int bubble = array[i];
                array[i] = array[i + 1];
                array[i + 1] = bubble;
                i = 0;
            }
        }
        System.out.println("Valores ordenados.");
    }

    private void case7(int contador, int array[]) {
        int temp = 0;
        for (int i = 0; i < contador; i++) {
            for (int x = 0; x < i; x++) {
                temp = array[i];
                array[i] = array[x];
                array[x] = temp;
            }
        }
        System.out.println("Valores invertidos.");
    }

    public static void main(String[] args) {
        new Exe10Uni06();
    }
}