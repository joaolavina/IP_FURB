import java.util.Scanner;

public class MetodoExe09Uni05 {
    public static void main(String[] args) {
        new MetodoExe09Uni05();
    }

    MetodoExe09Uni05(){
        Scanner input = new Scanner(System.in);
        int qntMaiorque20 = 0;
        String nome18= " ";

        int n = readQnt(input);
        readStudents(input, qntMaiorque20, nome18, n);

        input.close();
    }

    private int readQnt(Scanner input){
        System.out.print("Digite a quantidade de alunos: ");
        return input.nextInt();
    }

    private void readStudents(Scanner input, int qntMaiorque20, String nome18, int n){
        input.nextLine();
        System.out.println("Digite o nome e idade dos alunos: ");
        for (int i = 1; i<=n; i++){
            String nome = input.next().trim(); int idade = input.nextInt();


            if (idade>20){
                qntMaiorque20++;
            }
            else if(idade==18){
                if(i==n){
                nome18 = nome18 + nome + ".";    
                }
                else{
                nome18 = nome18 + nome + ", ";    
                }
            }

        }
        
        System.out.println("Quantidade de alunos com mais de 20 anos: "+qntMaiorque20);
        System.out.println("Alunos com 18 anos:"+nome18);
    }

}
