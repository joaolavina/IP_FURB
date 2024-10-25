import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner (System.in);

        String genero = input.nextLine().trim();

        if (genero.equals("")){
            System.out.println("Dados incorretos");
        }
        else {
            int mesNascimento = input.nextInt();

            if (mesNascimento>7){
                System.out.println("Nasceu no segundo semestre");
            }
            else {
                String texto = "Gênero " + genero + " Mês: "+ mesNascimento;
                System.out.println(texto+ " nasceu no primeiro semestre.");
            }
        }
        
        input.close();

    }
}
