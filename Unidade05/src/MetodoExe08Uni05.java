import java.util.Scanner;

public class MetodoExe08Uni05 {
    public static void main(String[] args) {
        new MetodoExe08Uni05();
    }

    MetodoExe08Uni05(){
        Scanner input = new Scanner(System.in);
        double media = 0;
        int menor = 0;
        int qntPositivos = 0;

        int n = readQnt(input);
        readNum(n, input, qntPositivos, media, menor);

        input.close();

    }

    private int readQnt(Scanner input){
        System.out.println("Digite uma quantidade de números: ");
        return input.nextInt();
    }

    private void readNum(int n, Scanner input, int qntPositivos, double media, int menor){
        System.out.println("Digite os números: ");
        for (int i=0; i<n; i++){
            int num = input.nextInt();

            if(num>0){
                qntPositivos++; 
                media = media + num;
            }
            else {
                menor = Math.min(num, menor);
            }
        }

        System.out.println("média dos números positivos: "+(media/qntPositivos));
        System.out.println("Menor valor negativo: "+menor);
    }

}
