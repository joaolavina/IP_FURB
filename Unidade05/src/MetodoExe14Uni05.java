import java.util.Scanner;

public class MetodoExe14Uni05 {
    public static void main(String[] args) {
        new MetodoExe14Uni05();
    }

    MetodoExe14Uni05(){
        Scanner input = new Scanner(System.in);

        double pcTotal = 0;
        double pvTotal = 0;
        int lucro1 = 0;
        int lucro2 = 0;
        int lucro3 = 0;

        for(int i=0; i<20; i++){
            double pc = readPrecoCompra(i, input);
            double pv = readPrecoVenda(i, input);
            returnLucro(i, i, lucro1, lucro2, lucro3);
            pcTotal = pcTotal+pc;
            pvTotal = pvTotal+pv;
        }
        writeValues(lucro1, lucro2, lucro3, lucro2, lucro3);

        input.close();
    }

    private double readPrecoCompra(int i, Scanner input){
        System.out.println("Digite o preço de compra da "+(i+1)+"° mercadoria: ");
        return input.nextDouble();
    }

    private double readPrecoVenda(int i, Scanner input){
        System.out.println("Digite o preço de venda da "+(i+1)+"° mercadoria: ");
        return input.nextDouble();
    }

    private int returnLucro(int pv, int pc, int lucro1, int lucro2, int lucro3){
        double lucroPorcentagem =((pv-pc)/pc)*100;

        if (lucroPorcentagem<10){
            return lucro1++;
        }
        else if(lucroPorcentagem>=10 && lucroPorcentagem<=20){
            return lucro2++;
        }
        else if(lucroPorcentagem>20){
            return lucro3++;
        }
        else{
            return 0;
        }
    }

    private void writeValues(int lucro1, int lucro2, int lucro3, int pcTotal, int pvTotal){
        System.out.println("Quantidade de mercadorias que possuem menos de 10% de lucro: "+lucro1);
        System.out.println("Quantidade de mercadorias que possuem entre 10% e 20% de lucro: "+lucro2);
        System.out.println("Quantidade de mercadorias que possuem mais de 20% de lucro: "+lucro3);
        System.out.println("Preço de compra total: R$"+pcTotal);
        System.out.println("Preço de venda total: R$"+pvTotal);
        System.out.println("Lucro total: R$"+(pvTotal-pcTotal));
    }
    
}
