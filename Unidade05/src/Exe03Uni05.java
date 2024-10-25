// Descreva um algoritmo que calcule e escreva a soma da seguinte série de 100 termos:

public class Exe03Uni05 {
    public static void main(String[] args) {
        double sum = 0;
        
        for (int i=1; i<=100; i++){
            sum = sum + (1.0/i);
        }

        System.out.println(sum);
    }
}
