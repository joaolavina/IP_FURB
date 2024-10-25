import java.util.Scanner;

public class MetodoExe30Uni05 {
    public static void main(String[] args) {
        new MetodoExe30Uni05();
    }

    MetodoExe30Uni05(){
        int somaMochila = 0, somaFora = 0;
        Scanner input = new Scanner(System.in);
        int n = returnN(input);
        int k = returnK(input);
        int m = returnM(input);
        System.out.println("Elementos dentro da mochila: ");
        while (somaMochila <= m && n > 0) {
            somaMochila = somaDentroMochila(somaMochila, m, n, k);
            System.out.println(n);
            n -= k;
        }
        System.out.println("Elementos fora da mochila: ");
        while (n > 0) {
            somaFora = somaForaMochila(somaFora, m, n, k);
            System.out.println(n);
            n -= k;
        }
        writeValues(somaFora, somaMochila);
        input.close();
    }

    private int returnN(Scanner input){
        System.out.println("Digite o valor de N");
        return input.nextInt();
    }
    
    private int returnK(Scanner input){
        System.out.println("Digite o valor de K");
        return input.nextInt();
    }

    private int returnM(Scanner input){
        System.out.println("Digte o valor de M:");
        return input.nextInt();
    }

    private int somaDentroMochila(int somaMochila, int m, int n, int k){
        return somaMochila + n;
    }

    private int somaForaMochila(int somaFora, int m, int n, int k){
        return somaFora + n;
    }

    private void writeValues(int somaFora, int somaMochila){
        System.out.println("Soma elementos dentro da mochila: " + somaMochila);
        System.out.println("Soma elementos fora da mochila: " + somaFora);
    }

}
