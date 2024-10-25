/*Uni6Exe04.java - 
Faça um programa para ler os valores de dois vetores de inteiros, cada um contendo 10 elementos. 
Crie um terceiro vetor em que cada elemento é a soma dos valores contidos nas posições respectivas dos vetores originais.
 Por exemplo, vetor1 = [1,2,3] vetor2 = [1,5,6] vetor3 = [2,7,9]. 
 Exiba, ao final, os três vetores na tela. 
 Faça três métodos: um método para ler valores dos vetores, outro para somar e outro para escrever os vetores.

 */

import java.util.Scanner;

public class Exe04Uni06 {
    public static void main(String[] args) {
        new Exe04Uni06();    
    }

    Exe04Uni06(){
        Scanner input = new Scanner(System.in);

        int[] array1 = new int[10];
        int[] array2 = new int[10];
        int[] sumArray = new int[10];

        for (int i = 0; i < sumArray.length; i++) {
            readValue(array1, array2, sumArray, i, input);
            sumArray[i]=  onSumArray(array1, array2, i);
        }

        writeArray(array1, array2, sumArray);

        input.close();
    }

    private void readValue(int array1[], int array2[], int sumArray[], int i, Scanner input){
        System.out.println("Digite o elemento ["+i+"] do 1° e 2° vetor");
        array1[i] = input.nextInt(); array2[i] = input.nextInt();
    }

    private int onSumArray(int array1[], int array2[], int i){
        return array1[i] + array2[i];
    }

    private void writeArray(int array1[], int array2[], int sumArray[]){
        for (int i = 0; i<1; i++) {
            System.out.print("[");
            for(int j = 0; j<sumArray.length; j++){
                System.out.print(array1[j]+ ",");
            }
            System.out.println("]");
            System.out.print("[");
            for(int j = 0; j<sumArray.length; j++){
                System.out.print(array2[j]+ ",");
            }
            System.out.println("]");
            System.out.print("[");
            for(int j = 0; j<sumArray.length; j++){
                System.out.print(sumArray[j]+ ",");
            }
            System.out.println("]");
        }
    }
}
