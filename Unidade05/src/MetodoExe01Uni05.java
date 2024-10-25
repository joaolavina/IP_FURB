import java.util.Scanner;

public class MetodoExe01Uni05 {
    public static void main(String[] args) {
        new MetodoExe01Uni05();
        Scanner input = new Scanner(System.in);

        for (int qnt = 0; qnt<20; qnt++){
            System.out.println("Digite um número:");
            int num = input.nextInt();

            if (num%2==0){
                System.out.println("O número é par");
            }
            else {
                System.out.println("O número é ímpar");
            }
        }

        input.close();
    }

    MetodoExe01Uni05(){
        Scanner input = new Scanner(System.in);

        for (int qnt = 0; qnt<20; qnt++){
            int num = readNumber(input);
            verificaImparPar(num);
        }

        input.close();
    }

    private int readNumber(Scanner input){
        System.out.println("Digite um número:");
        return input.nextInt();
    }

    private void verificaImparPar(int num){
        if (num%2==0){
            System.out.println("O número é par");
        }
        else {
            System.out.println("O número é ímpar");
        }
    }
}
