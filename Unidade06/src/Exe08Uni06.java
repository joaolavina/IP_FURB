/* Uni6Exe08.java - 
Faça um programa que leia um valor N inteiro limitado a 20 posições. 
Com base neste valor, crie um vetor do tipo real. 
Faça o usuário informar valores para as posições deste vetor 
e coloque-as nas posições na sequência informada pelo usuário. 
Imprima uma tabela contendo cada valor diferente 
e o número de vezes que o valor aparece no vetor (veja exemplo a seguir). Uni6Exe08*/

import java.util.Scanner;

public class Exe08Uni06 {
    Exe08Uni06(){
        Scanner input = new Scanner(System.in);
        int n;
        do {
            System.out.println("Digite o valor de N");
            n = input.nextInt();
        } while (n <= 0 && n > 20);
        double[] array = new double[n];
        double[] arrayUnico = new double[array.length];
        
        readValues(n, input, array);
        calculateFrequency(array, arrayUnico);
        writeFrequency(array, arrayUnico);

        input.close();
    }

    private void readValues(int n, Scanner input, double array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.println("Digite o valor da posição [" + i + "]");
            array[i] = input.nextInt();
        }
    }

    private void calculateFrequency(double array[], double arrayUnico[]){
        int posicao = 0;
        for (int i = 0; i < array.length; i++) {
            boolean existe = false;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j] && i != j) {
                    existe = true;
                }
            }

            if(!existe){
                arrayUnico[posicao] = array[i];
                posicao++;
            }
        }
    }

    private void writeFrequency(double array[], double arrayUnico[]){
        System.out.println("VALOR   |   FREQUÊNCIA");
        System.out.println("--------|-------------");

        for(int i = 0; i < arrayUnico.length; i++){
            System.out.print(arrayUnico[i]+" - ");
            int quantidade = 0;

            for(int j = 0; j<array.length; j++){
                if( arrayUnico[i] == array[j]){
                    quantidade++;
                }
            }
            System.out.println(quantidade);
        }
    }

    public static void main(String[] args) {
        new Exe08Uni06();
    }
}