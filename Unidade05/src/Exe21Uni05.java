/*Chico tem 1,50 metro e cresce 2 centímetros por ano, enquanto Zé tem 1,10 metros e cresce 3 centímetros por ano. 
Construa um algoritmo que calcule e imprima quantos anos serão necessários para que Zé seja maior que Chico. */


public class Exe21Uni05 {
    public static void main(String[] args) {
        double alturaChico = 1.50;
        double alturaZé = 1.10;
        int anos = 0;

        while (alturaChico>alturaZé){
            alturaChico += 0.02;
            alturaZé += 0.03;
            anos++;
        }

        System.out.println("São necessários "+anos+" anos para Zé ser maior que Chico");
    }
}
