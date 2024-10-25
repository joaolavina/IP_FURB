import java.util.Scanner;

public class MetodoExe07Uni05 {
    public static void main(String[] args) {
        new MetodoExe07Uni05();
    }

    MetodoExe07Uni05(){
        Scanner input = new Scanner(System.in);
        double maior = Double.MIN_VALUE;
        double menor = Double.MAX_VALUE;

        int n = readNum(input);
        verifyNum(n, input, maior, menor);
        input.close();
    }

    private int readNum(Scanner input){
        System.out.print("Digite a quantidade de números: ");
        return input.nextInt();
    }

    private void verifyNum(int n, Scanner input, double maior, double menor){
        System.out.println("Digite os números: ");
        for(int i=0; i<n; i++){
            double a = input.nextDouble();
        
            maior = Math.max(a, maior);
            menor = Math.min(a, menor);         
        }
        System.out.println("Maior: "+maior);
        System.out.println("Menor: "+menor);
    }

}
