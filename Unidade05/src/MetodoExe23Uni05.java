import java.util.Scanner;

public class MetodoExe23Uni05 {
    public static void main(String[] args) {
        new MetodoExe23Uni05();
    }

    MetodoExe23Uni05(){
        Scanner input = new Scanner(System.in);
  
        double salario= 0 , totalVendas = 0;
        char resposta = ' ';

        loopMethod(resposta, input, totalVendas, salario);
    }

    private void loopMethod(char resposta, Scanner input, double totalVendas, double salario){
        double preço = 0;
        int qnt = 0;
        while (resposta != 'n'){
            String nome = readName(input);
            int n = qntProdutos(input);
                for (int i = 0; i<n; i++){
                    preço = readPreço(input);
                    qnt = readQnt(input);
                    totalVendas = calculateTotalVendas(totalVendas, preço, qnt);
                    salario = calculateSalario(salario, preço, qnt);
                }
            
            if(n==0){
                totalVendas = 0;
                salario = 0;
            }

            writeValues(nome, totalVendas, salario);
            resposta = readResposta(input);
        }
        input.close();
    }

    private int qntProdutos(Scanner input){
        System.out.println("Quantos produtos foram vendidos?");
        return input.nextInt();
    }

    private String readName(Scanner input){
        System.out.println("Digite o nome do funcionário: ");
        return input.next();
    }

    private double readPreço(Scanner input){
        System.out.println("Digite o preço do produto: ");
        return input.nextDouble();
    }
    
    private int readQnt(Scanner input){
        System.out.println("Digite a quantidade do produto: ");
        return input.nextInt();
    }

    private double calculateTotalVendas(double totalVendas, double preço, int qnt){
        return totalVendas + (preço*qnt);
    }

    private double calculateSalario(double salario, double preço, int qnt){
        return salario + (preço*qnt*0.3);
    }

    private void writeValues(String nome, double totalVendas, double salario){
        System.out.println(nome);
        System.out.println("Total vendas = R$ "+totalVendas);
        System.out.println("Salário = R$ "+salario);
    }

    private char readResposta(Scanner input){
        System.out.println("Deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)?");
        return input.next().trim().toLowerCase().charAt(0);
    }
}
