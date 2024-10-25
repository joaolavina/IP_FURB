/*Faça um algoritmo que escreva o menu abaixo, leia uma opção do usuário 
e execute a operação correspondente. 
O algoritmo deve exibir uma mensagem de erro se a opção for inválida. O menu tem as seguintes opções:
Escolha uma opção:
1 - Soma de dois números.
2 - Diferença entre dois números.
3 - Produto entre dois números.
4 - Divisão entre dois números (o denominador não pode ser zero).*/
    
import java.util.Scanner;

public class Exe25Uni04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor 1: ");
        double num1 = input.nextDouble();
        System.out.println("Digite o valor 2: ");
        double num2 = input.nextDouble(); 

        System.out.println("Escolha uma opção: ");
        System.out.println("1 - Soma de dois números.");
        System.out.println("2 - Diferença entre dois números.");
        System.out.println("3 - Produto entre dois números.");
        System.out.println("4 - Divisão entre dois números");
        int opcao = input.nextInt();

        input.close();

        switch(opcao){
            case 1:
                System.out.println(num1+num2);
                break;
            case 2:
                System.out.println(num1-num2);
                break;
            case 3:
                System.out.println(num1*num2);
                break;
            case 4:
                System.out.println(num1/num2);
                break;
            default:
                System.out.println("Opção Inválida.");
        }
    }
}
