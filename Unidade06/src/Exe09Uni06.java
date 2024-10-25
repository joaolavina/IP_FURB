/*Uni6Exe09.java - 
Um cinema pretende fazer uma pesquisa para avaliar o grau de satisfação de seus clientes. 
Trinta deles foram ouvidos e para cada um perguntou-se o sexo (1=feminino 2=masculino), 
uma nota para o cinema (zero até dez, valor inteiro) e a idade.

Baseado nisto faça um programa que informe:

qual a nota média recebida pelo cinema;
qual a nota média atribuída pelos homens;
qual a nota atribuída pela mulher mais jovem;
quantas das mulheres com mais de 50 anos deram nota superior a média recebida pelo cinema.
Utilize os conceitos aprendidos sobre vetores (ou mesmo o uso de matriz) 
e métodos para a resolução deste exercício */

import java.util.Scanner;

public class Exe09Uni06 {
    Exe09Uni06(){
        Scanner input = new Scanner(System.in);

        int[][] array = new int[4][3];
        int[] teste = new int[4];
        int nota = 0;
        int homems = 0;
        int notaHomem = 0;
        int mulherMaisNova = Integer.MAX_VALUE;
        int mulheres50 = 0;

        readValues(array, input);
        calculateValues(array, teste, notaHomem, mulherMaisNova,  notaHomem, homems, mulheres50);
        writeValues(nota, teste,notaHomem, array);

        input.close();
    }

    private void calculateValues(int array[][], int[] teste,int notaHomem, int mulherMaisNova, int nota, int homems, int mulheres50){
        for(int i = 0; i<array.length; i++){     
            nota += array[i][1];

            if(array[i][0] == 2){
                notaHomem += array[i][1];
                homems++;
            }
            if(array[i][0] == 1 && mulherMaisNova>array[i][2]){
                mulherMaisNova = array[i][2];
                teste[2] = i;
            }
        }
        nota = nota/4;
        notaHomem = notaHomem/homems;
        teste[0] = nota;
        teste[1] = notaHomem;


        for(int i = 0; i<array.length; i++){
            if(array[i][2]>50 && array[i][1]>nota && array[i][0] == 2){
                mulheres50++;
                teste[3] = mulheres50;
            }
        }
    }

    
    private void readValues(int array[][], Scanner input){
        for(int i = 0; i<array.length; i++){
            System.out.println("Digite o sexo (1=feminino 2=masculino): ");
            array[i][0] = input.nextInt();
            System.out.println("Digite a nota para o cinema: ");
            array[i][1] = input.nextInt();
            System.out.println("Digite a idade: ");
            array[i][2] = input.nextInt();
        }
    }
    
    private void writeValues(int nota,int teste[], int notaHomem, int array[][]){
        System.out.println("Nota média recebida pelo cinema: "+teste[0]);
        System.out.println("Nota média atribuída pelos homens: "+teste[1]);
        System.out.println("Nota atribuída pela mulher mais jovem: "+array[teste[2]][1]);
        System.out.println("Mulheres com mais de 50 anos que deram nota superior a média recebida pelo cinema: "+teste[3]);
    }
    
    public static void main(String[] args) {
        new Exe09Uni06(); 
    }
}
