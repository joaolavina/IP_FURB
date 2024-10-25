import java.util.Scanner;

public class MetodoExe12Uni05 {
    public static void main(String[] args) {
        new MetodoExe12Uni05();
    }

    MetodoExe12Uni05(){
        Scanner input = new Scanner(System.in);
        int numero = 0;

        int n = readQntd(input);
        input.close();
        floydsTriangule(n, numero);
    }

    private int readQntd(Scanner input){
        System.out.print("Digite a quantidade de linhas do Triângulo de Floyd: ");
        return input.nextInt();
    }

    private void floydsTriangule(int n, int numero){
        for(int i=0; i<n; i++){
            System.out.println();
            for(int j=0; j<=i; j++){
                numero++;
                System.out.print(numero + " ");
            }
        }
    }

}
