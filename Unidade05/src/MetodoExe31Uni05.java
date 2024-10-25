import java.util.Scanner;

public class MetodoExe31Uni05 {
    public static void main(String[] args) {
        new MetodoExe31Uni05();
    }
    MetodoExe31Uni05(){
        Scanner input = new Scanner(System.in);
        int n = readNum(input);
        int divisor = 2;
        System.out.println("Número/Decomposição");
        while (n != 1) {
            n = divide(n, divisor);
            divisor++;
        }
        System.out.println(n);
        input.close();
    }

    private int readNum(Scanner input){
        System.out.println("Digite um número");
        return input.nextInt();
    }

    private int divide(int n, int divisor){
        while(n%divisor == 0){
            System.out.println(n+ " "+divisor);
            n = n/divisor;
        }
        return n;
    }
}
