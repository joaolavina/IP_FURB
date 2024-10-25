/* 
Descreva um algoritmo para calcular o valor de S dado por:

S=(3/2)+(5/6)+(7/12)+(9/20)+(11/30)

Considere os 20 primeiros termos da série.
*/

public class Exe04Uni05 {
    public static void main(String[] args) {
        double numerador = 1;
        int denominador = 0;
        double soma = 0;

        for (int i=1; i<=20; i++){
            numerador = numerador + 2;
            denominador =  denominador + i*2;
            soma = soma + (numerador/denominador);
        }
        
        System.out.println(soma);

    }
}
