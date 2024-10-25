/*Uma grande loja de departamentos paga aos vendedores um salário com base nas vendas efetuadas durante o mês, 
que é igual a 30% de comissão sobre o preço de cada produto vendido. Cada vendedor, em um determinado mês, vende n produtos,
 onde, para cada produto tem-se o preço unitário e a quantidade vendida. 
 O departamento de pessoal deseja obter um relatório com: nome, total de vendas (em R$) e salário de cada vendedor.
  Descreva um algoritmo que gere o relatório desejado. 
  Para prosseguir com a entrada de dados o algoritmo deve apresentar a seguinte mensagem: 
  “deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)?”. O número de produtos (n) de cada vendedor deve ser informado. */

  import java.util.Scanner;

  public class Exe23Uni05 {
      public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
  
          double salario = 0;
          double totalVendas = 0;
          char resposta = ' ';

          while (resposta != 'n'){
              System.out.println("Digite o nome do funcionário: ");
              String nome = input.next();
              System.out.println("Quantos produtos foram vendidos?");
              int n = input.nextInt();
  
              for (int i = 0; i<n; i++){
                  System.out.println("Digite o preço do produto e a quantidade vendida: ");
                  double preço = input.nextDouble(); int qnt = input.nextInt();
                  totalVendas = totalVendas + (preço*qnt);
                  salario = salario + (preço*qnt*0.3);
              }
  
              if(n==0){
                  totalVendas = 0;
                  salario = 0;
              }
  
              System.out.println(nome);
              System.out.println("Total vendas = R$ "+totalVendas);
              System.out.println("Salário = R$ "+salario);
  
              System.out.println("Deseja digitar os dados de mais um vendedor: s (SIM) / n (NÃO)?");
              resposta = input.next().trim().toLowerCase().charAt(0);
          }
  
          input.close(); 
      }
  }
  