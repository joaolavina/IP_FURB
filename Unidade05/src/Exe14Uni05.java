/*Um comerciante deseja fazer um levantamento do lucro das 20 mercadorias que comercializa. 
Para cada mercadoria ele tem o nome, o preço de compra (PC) e o preço de venda (PV). Descreva um algoritmo que:

escreva quantas mercadorias proporcionam: (lucro < 10%), (10% <= lucro <= 20%) e (lucro > 20%), 
onde o percentual de lucro é calculado da seguinte forma: % = (PV - PC) / PC * 100;
determine e escreva o valor total de compra e de venda de todas as mercadorias, assim como o lucro total.
 */

import java.util.Scanner;

 public class Exe14Uni05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double pcTotal = 0;
        double pvTotal = 0;
        int lucro1 = 0;
        int lucro2 = 0;
        int lucro3 = 0;



        for(int i=0; i<20; i++){
            System.out.println("Digite o preço de compra e o preço de venda da "+(i+1)+"° mercadoria: ");
            double pc = input.nextDouble(); double pv = input.nextDouble();

            double lucroPorcentagem =((pv-pc)/pc)*100;

            if (lucroPorcentagem<10){
                lucro1++;
            }
            else if(lucroPorcentagem>=10 && lucroPorcentagem<=20){
                lucro2++;
            }
            else if(lucroPorcentagem>20){
                lucro3++;
            }

            pcTotal = pcTotal+pc;
            pvTotal = pvTotal+pv;
        }
        System.out.println("Quantidade de mercadorias que possuem menos de 10% de lucro: "+lucro1);
        System.out.println("Quantidade de mercadorias que possuem entre 10% e 20% de lucro: "+lucro2);
        System.out.println("Quantidade de mercadorias que possuem mais de 20% de lucro: "+lucro3);
        System.out.println("Preço de compra total: R$"+pcTotal);
        System.out.println("Preço de venda total: R$"+pvTotal);
        System.out.println("Lucro total: R$"+(pvTotal-pcTotal));
        input.close();
    }
}
