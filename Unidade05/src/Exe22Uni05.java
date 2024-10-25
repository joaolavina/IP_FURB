/*Um funcionário recebe aumento anual.
 Em 1995 foi contratado por 2000 reais. 
 Em 1996 recebeu aumento de 1.5%. 
 A partir de 1997, os aumentos sempre correspondem ao dobro do ano anterior. 
 Faça programa que determine o salário atual do funcionário. */

 public class Exe22Uni05 {
    public static void main(String[] args) {
        

        int ano = 1995;
        double salário = 2000;

        while (ano<=2023) {
            ano++;
            if (ano == 1996){
                salário = salário*1.5;
            }
            else{
                salário = salário*2;
            }
        }
        System.out.println("Salário atual: R$"+salário);
    }
}
