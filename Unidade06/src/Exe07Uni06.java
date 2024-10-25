/*Uni6Exe07.java - Faça um programa que leia um valor N inteiro limitado a 20 posições.
 Com base neste valor, crie um vetor do tipo inteiro. 
 Em seguida, solicite ao usuário para digitar um número inteiro várias vezes, até preencher o vetor. 
 Esse número deverá ser armazenado no vetor caso ainda não exista, e
se o valor já existir deve ser pedido um novo valor. 
Isto é, se o usuário informar o número 2 e já existir o número 2 em alguma posição do vetor, 
o número não deve ser adicionado. Após ter adicionado todos os números dentro do vetor, o mesmo deve ser ordenado.
Para isso reordene os elementos internos do vetor de modo que este fique em ordem crescente, conforme no exemplo:

Vetor origem: [0][4][2][6][3]
Vetor ordenado: [0][2][3][4][6]

Crie um método para inserir os valores no vetor, o
utro para ordenar o vetor e outro para informar o vetor resultante. 
Para "método ordenar" se pode usar o "método bolha" explicado neste vídeo. */

import java.util.Scanner;

public class Exe07Uni06 {
    Exe07Uni06() {
        Scanner input = new Scanner(System.in);
        int n;

        do {
            System.out.println("Digite o valor de N");
            n = input.nextInt();
        } while (n <= 0 || n > 20);

        double[] array = new double[n];

        insertValues(array, input);

        System.out.print("Vetor origem: ");
        readValues(array);

        organizeValues(array);

        System.out.print("Vetor ordenado: ");
        readValues(array);

        input.close();
    }

    private void insertValues(double array[], Scanner input) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Digite um valor para a posição [" + i + "]");
            double numero = input.nextDouble();

            for (int j = 0; j < array.length; j++) {
                if (j != i) {
                    if (numero != array[j] && j != i) {
                        array[i] = numero;
                    } else {
                        System.out.println("Valor já existente no vetor");
                        i--;
                        j = array.length;
                    }
                }
            }
        }
    }

    private void readValues(double array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + array[i] + "]");
        }
        System.out.println();
    }

    private void organizeValues(double array[]) {
        for (int i = 0; i < (array.length - 1); i++) {
            if (array[i] > array[i + 1]) {
                double bubble = array[i];
                array[i] = array[i + 1];
                array[i + 1] = bubble;
                i = 0;
            }
        }
    }

    public static void main(String[] args) {
        new Exe07Uni06();
    }
}