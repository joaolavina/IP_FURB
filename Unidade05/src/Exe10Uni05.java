/* O número 3025 possui a seguinte característica:

30+25=55 | 55^2=3025

Escreva um programa que pesquise e imprima os 10 primeiros números naturais que apresentam tal propriedade. 
Outros exemplos:

20+25=45 | 45^2=2025 */

public class Exe10Uni05 {
    public static void main(String[] args) {
        
        int a = 0;
        int b;
        int c;
        // divide em duas partes
        
        for(int i = 0; i<10; i++){
            b = a/100;
            c = a%100;
            if(Math.pow((b+c), 2)==a){
                System.out.println(a);
                a++;
            }
            else{
                a++;
                i--;
            }
        }
    }
}
