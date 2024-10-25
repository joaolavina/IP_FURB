/*Uni6Exe05.java - Com o objetivo de determinar o índice de afinidade entre um rapaz 
e uma moça cada um respondeu um questionário com 5 perguntas, como por exemplo:

Gosta de música sertaneja?
Gosta de futebol?
Gosta de seriados?
Gosta de redes sociais?
Gosta da Oktoberfest?
A resposta a cada pergunta pode ser: SIM, NÃO ou IND (indiferente). O índice de afinidade é medido da seguinte maneira:

se ambos deram a mesma resposta soma-se 3 pontos ao índice;
se um respondeu IND e o outro SIM ou NÃO soma-se 1;
se um respondeu SIM e o outro NÃO subtrai-se 2 ao índice.
Crie um vetor para armazenar as respostas do rapaz e outro para armazenar as respostas da moça. 
Crie um método que possa ler tanto as respostas do rapaz como da moça, e outro para calcular e retornar a afinidade. 
Por fim, escreva a afinidade considerando os seguintes intervalos:

Afinidade	Mensagem
15	        “Casem!
10 a 14	    “Vocês têm muita coisa em comum!”
5 a 9	    “Talvez não dê certo :(”
0 a 4	    “Vale um encontro.”
-1 a -9	    “Melhor não perder tempo”
-10	        “Vocês se odeiam!” */

import java.util.Scanner;

public class Exe05Uni06 {
    Exe05Uni06(){
        Scanner input = new Scanner(System.in);

        String[] boyArray = new String[5];
        String[] girlArray = new String[5];
        int afinidade = 0;

        String[] pergunta = {"Gosta de música sertaneja?","Gosta de futebol?", "Gosta de seriados?", 
                                "Gosta de redes sociais?", "Gosta da Oktoberfest?"};


        for (int i = 0; i < girlArray.length; i++){
            readAnswers(pergunta, boyArray, girlArray, i, input);
            afinidade = returnAfinidade(boyArray, girlArray, i, afinidade);
        }

        if(afinidade == 15){
            System.out.println("Casem!");
        }
        else if(afinidade <= 14 && afinidade >= 10){
            System.out.println("Vocês têm muita coisa em comum!");
        }
        else if(afinidade <= 9 && afinidade >= 5 ){
            System.out.println("Talvez não dê certo :(");
        }
        else if(afinidade <= 4 && afinidade >= 0){
            System.out.println("Vale um encontro.");
        }
        else if(afinidade <= -1 && afinidade >= -9){
            System.out.println("Melhor não perder tempo.");
        }
        else {
            System.out.println("Vocês se odeiam!");
        }
    
        input.close();
    }

    private void readAnswers(String pergunta[], String boyArray[], String girlArray[], int i, Scanner input){
        System.out.println(pergunta[i]);
        boyArray[i] = input.nextLine().trim().toUpperCase();
        girlArray[i] = input.nextLine().trim().toUpperCase();
    }

    private int returnAfinidade(String boyArray[], String girlArray[], int i, int afinidade){
        if(boyArray[i].equals(girlArray[i])){
            afinidade += 3;
        }
        else if(boyArray[i].equals("IND") || girlArray[i].equals("IND")){
            afinidade++;
        }
        else {
            afinidade -= 2;
        }
        return afinidade;
    }
    public static void main(String[] args) {
        new Exe05Uni06();
    }
    
}