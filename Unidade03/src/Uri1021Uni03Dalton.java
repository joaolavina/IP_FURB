import java.util.Scanner;

public class Uri1021Uni03Dalton {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double nota = teclado.nextDouble();

        double nota100 = nota / 100;
        nota %= 100;
        double nota50 = nota / 50;
        nota %= 50;
        double nota20 = nota / 20;
        nota %= 20;
        double nota10 = nota / 10;
        nota %= 10;
        double nota5 = nota / 5; 
        nota %= 5;
        double nota2 = nota / 2;
        nota %= 2;
        double nota1 = nota;
        nota %= 1;
        double nota050 = nota/(0.5);
        nota %= (0.5);
        double nota025 = nota/(0.25);
        nota %= (0.25);
        double nota010 =nota/(0.10);
        nota %= (0.10);
        double nota005 = nota/(0.05);
        nota %= nota005 = nota/(0.05);
        double nota001 = nota/(0.01);


        System.out.println("NOTAS:");
        System.out.println((int)nota100 + " nota(s) de R$ 100,00");
        System.out.println((int)nota50 + " nota(s) de R$ 50,00");
        System.out.println((int)nota20 + " nota(s) de R$ 20,00");
        System.out.println((int)nota10 + " nota(s) de R$ 10,00");
        System.out.println((int)nota5 + " nota(s) de R$ 5,00");
        System.out.println((int)nota2 + " nota(s) de R$ 2,00");
        System.out.println("MOEDAS:");
        System.out.println((int)nota1 + " moedas(s) de R$ 1.00");
        System.out.println((int)nota050 + " moeda(s) de R$ 00.50");
        System.out.println((int)nota025 + " moeda(s) de R$ 0.25");
        System.out.println((int)nota010 + " moeda(s) de R$ 00.10");
        System.out.println((int)nota005+ " moeda(s) de R$ 0.05");
        System.out.println((int)nota001 + " moeda(s) de R$ 0.01");

        teclado.close();
    }
}