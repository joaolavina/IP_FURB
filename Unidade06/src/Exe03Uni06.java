/*Uni6Exe03.iava - 
Descreva um algoritmo que leia 12 valores reais e os coloque em um vetor de 12 posições do tipo real. 
Em seguida, modifique o vetor de modo que os valores das posições ímpares seiam aumentados em 5% 
e os das posições pares seiam aumentados em 2%. Imprima o vetor resultante. 
Faça um método para ler os valores, outro para aiustar os valores dentro do vetor 
e outro para escrever os valores atualizados do vetor. */

import java.util.Scanner;

public class Exe03Uni06 {
    public static void main(String[] args) {
        new Exe01Uni06();
    }

    Exe03Uni06() {
        Scanner input = new Scanner(System.in);

        double[] array = new double[12];
        for (int i = 0; i < array.length; i++) {
            readValue(array,input,i);
            changeValue(array, i);
        }

        writeValue(array);

        input.close();
    }

    private void readValue(double array[], Scanner input, int i){
        System.out.println("Digite o valor da posição [" + i + "]");
        array[i] = input.nextDouble();
    }

    private void changeValue(double array[], int i){
        if ((int) array[i] % 2 == 0){
            array[i] = array[i] * 1.02;
        }
        else {
            array[i] = array[i] * 1.05;
        }
    }

    private void writeValue(double array[]){
        System.out.println("Novos valores:");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
        }
    }
}
