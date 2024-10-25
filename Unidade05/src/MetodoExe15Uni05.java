import java.util.Scanner;

public class MetodoExe15Uni05 {
    public static void main(String[] args) {
        new MetodoExe15Uni05();
    }

    MetodoExe15Uni05(){
        Scanner input = new Scanner(System.in);

        String nome = readStudentName(input);
        while (nome != "fim") {
            readGrades(input, nome);
            nome = readStudentName(input);
        }
        input.close();
    }

    private String readStudentName(Scanner input){
        System.out.println("Digite o nome do aluno: ");
        return input.nextLine().trim().toLowerCase();
    }

    private void readGrades(Scanner input, String nome){
        System.out.println("Digite as notas: ");
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        double media = (n1 + n2) / 2;
        System.out.println("NOME: " + nome.toUpperCase());
        System.out.println("MÉDIA: " + media);
    }

}
