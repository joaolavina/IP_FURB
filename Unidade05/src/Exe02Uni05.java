// Descreva um algoritmo que calcule e escreva a soma dos números pares e a soma dos números ímpares entre 1 e 100.

public class Exe02Uni05 {
    public static void main(String[] args) {

        int soma = 0;

        for (int i=2; i<=100; i= i+2){
            soma = soma + i; 
        }

        System.out.println(soma);
        soma = 0;

        for (int j=1; j<=100; j= j+2){
            soma = soma + j; 
        }
        System.out.println(soma);

    }
}
