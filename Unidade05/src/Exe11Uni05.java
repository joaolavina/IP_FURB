/*Uma máquina de biscoito está com problemas. 
Quando ligada, após 1 hora ela quebra 1 biscoito, 
na segunda hora ela quebra 3 biscoitos, na hora seguinte ela quebra 3 vezes 
a quantidade de biscoitos quebrados na hora anterior, e assim por diante. 
Faça um algoritmo que calcule quantos biscoitos são quebrados no final de cada dia
 (a máquina opera 16 horas por dia).

 */

public class Exe11Uni05 {
    public static void main(String[] args) {
        
        int biscoito = 3;
        int qntBiscoitos = 0;

        for(int i=3; i<=16; i++){

            biscoito = biscoito*3;

            qntBiscoitos = qntBiscoitos + biscoito;
        }
        qntBiscoitos = qntBiscoitos+4;
        System.out.println("Quantidade de biscoitos quebrados: "+qntBiscoitos);
    }
}
