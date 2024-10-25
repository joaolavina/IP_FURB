/*Uni6Exe06.java - Faça um programa que leia um valor N inteiro. 
Com base neste valor, crie um vetor do tipo real. 
Em seguida, solicite ao usuário informar essa quantidade N de valores reais para popular o vetor. 
Após ter preenchido o vetor, solicite que o usuário informe um outro valor real. 
Informe para o usuário se este valor informado se encontra cadastrado no vetor. 
Faça um método para ler o vetor e outro, que retorne verdadeiro ou falso, para encontrar o valor. */

import java.util.Scanner;

public class Exe06Uni06 {
    
    Exe06Uni06(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o valor de N: ");
        int qnt = input.nextInt();

        double[] array = new double[qnt];

        readValues(array, input);

        System.out.print("Digite um valor para verificar se existe no vetor: ");
        double valor = input.nextDouble();
        String vouf ="falso";
        vouf = returnVouF(array, valor, vouf);


        System.out.println("Valor encontrado: "+vouf);

        input.close();
    }


    private void readValues(double array[], Scanner input){
        for (int i = 0; i<array.length; i++){
            System.out.println("Digite o valor da posição ["+i+"] do vetor");
            array[i] = input.nextDouble();
        }
    }

    private String returnVouF(double array[], double valor, String vouf){
        for (int i = 0; i<array.length; i++){
            if(array[i] == valor){
                vouf = "verdadeiro";
            }
        }
        return vouf;
    }
    public static void main(String[] args) {
        new Exe06Uni06();
    }
}
