import java.util.Scanner;

public class Uri1021Uni03Thomas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double valor = input.nextDouble();
        input.close();
        
        int nota = (int) (valor * 100);
        
        int nota100 = nota / 10000;
        nota %= 10000;
        int nota50 = nota / 5000;
        nota %= 5000;
        int nota20 = nota / 2000;
        nota %= 2000;
        int nota10 = nota / 1000;
        nota %= 1000;
        int nota5 = nota / 500;
        nota %= 500;
        int nota2 = nota / 200;
        nota %= 200;
        int nota1 = nota / 100;
        nota %= 100;
        int nota050 = nota / 50;
        nota %= 50;
        int nota025 = nota / 25;
        nota %= 25;
        int nota010 = nota / 10;
        nota %= 10;
        int nota005 = nota / 5;
        nota %= 5;
    
        System.out.println("NOTAS:");
        System.out.println(nota100 + " nota(s) de R$ 100.00");
        System.out.println(nota50 + " nota(s) de R$ 50.00");
        System.out.println(nota20 + " nota(s) de R$ 20.00");
        System.out.println(nota10 + " nota(s) de R$ 10.00");
        System.out.println(nota5 + " nota(s) de R$ 5.00");
        System.out.println(nota2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(nota1 + " moeda(s) de R$ 1.00");
        System.out.println(nota050 + " moeda(s) de R$ 0.50");
        System.out.println(nota025 + " moeda(s) de R$ 0.25");
        System.out.println(nota010 + " moeda(s) de R$ 0.10");
        System.out.println(nota005 + " moeda(s) de R$ 0.05");
        System.out.println(nota + " moeda(s) de R$ 0.01");       
    }
}