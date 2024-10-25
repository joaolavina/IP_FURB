import java.util.Scanner;

public class Exe31Uni05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número");
        int n = input.nextInt();
        int divisor = 2;
        System.out.println("Número/Decomposição");
        while (n != 1) {
            while(n%divisor == 0){
                System.out.println(n+ " "+divisor);
                n = n/divisor;
            }
            divisor++;
        }
        System.out.println(n);
        input.close();
    }
}
