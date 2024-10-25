import java.util.Scanner;

public class MetodoExe19Uni05 {
    public static void main(String[] args) {
        new MetodoExe19Uni05();
        }

        

        MetodoExe19Uni05(){
            Scanner input = new Scanner(System.in);
    
            double ganho = 0;
            double valorCompra = readShoppingValue(input);
            whileMethod(valorCompra, ganho, input);
            input.close();
            System.out.println("Ganho da loja: R$ " + ganho);
        }
    
        private double readShoppingValue(Scanner input){
            System.out.println("Digite o valor da compra:");
            return input.nextDouble();
        }
    
        private void whileMethod(double valorCompra, double ganho, Scanner input){
            while (valorCompra != 0) {
                if (valorCompra <= 500) {
                    valorCompra = valorCompraMaior(valorCompra);
                }
                else{
                    valorCompra = valorCompraMenor(valorCompra);
                }
                ganho = calculateGanho(valorCompra, ganho);
                valorCompra = readShoppingValue(input);
            }
            System.out.println("Ganho da loja: R$ " + ganho);
        }

        private double valorCompraMaior(double valorCompra){
            System.out.println("Desconto de 15%");
            return valorCompra * 0.85;
        }

        private double valorCompraMenor(double valorCompra){
            System.out.println("Desconto de 20%");
            return valorCompra * 0.80;
        }

        private double calculateGanho(double valorCompra, double ganho){
            System.out.println("Valor compra: R$ " + valorCompra);
            return ganho + valorCompra;
        }
    }


