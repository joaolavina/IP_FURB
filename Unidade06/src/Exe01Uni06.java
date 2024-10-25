/*Uni6Exe01.java - 
Descreva um algoritmo que leia 10 números inteiros e os coloque em um vetor de 10 posições do tipo inteiro.
Escreva na ordem inversa em que foram lidos. Faça um método para ler e outro para escrever. */

import java.util.Scanner;

public class Exe01Uni06 {
    public static void main(String[] args)  {
        new Exe01Uni06(){};
    }

    Exe01Uni06(){
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        readArray(input, array);
        writeArray(array);
        input.close();
    }

    private void readArray(Scanner input, int[] array){
        for(int i = 0; i<array.length; i++){
            System.out.println("Digite o número da posição ["+i+"]");
            array[i] = input.nextInt();
        }
    }

    private void writeArray(int[] array){
        for(int i = array.length -1; i>= 0; i--){
            System.out.print(array[i]+ " ");
        }
    }
}


