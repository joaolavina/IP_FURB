import java.util.Scanner;

public class MetodoExe05Uni05 {
    public static void main(String[] args) {
        new MetodoExe05Uni05();
    }

    MetodoExe05Uni05(){
        Scanner input = new Scanner(System.in);

        int n = readSize(input);

        if(n>2){
            calculateNWriteSequence(n);
        }
        else{
            System.out.println("O tamanho deve ser maior que 2.");
        }
    }

    private int readSize(Scanner input){
        System.out.print("Digite o tamanho da sequência: ");
        return input.nextInt(); 
    }

    private void calculateNWriteSequence(int n){
        int a = 8;
        int b = 10;
        int c = 8;

        System.out.println("Sequência:");
        System.out.println(a);
        System.out.println(b);

        for(int i=3; i<=n; i++){
            if(i%2==0){
                b = a + b;
                System.out.println(b);
                a = c;
                }
            else if(i%2!=0){
                c *= 2;
                System.out.println(c);
            }

        }
    }
}
