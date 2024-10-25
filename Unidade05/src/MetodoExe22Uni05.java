public class MetodoExe22Uni05 {
    public static void main(String[] args) {
        new MetodoExe22Uni05();
    }

    MetodoExe22Uni05(){
        double salário = 2000;
        salário = calculateSalario(salário);
        System.out.println("Salário atual: R$"+salário);
    }

    private double calculateSalario(double salário){
        int ano = 1995;
        
        while (ano<=2023){
            ano++;
            salário = ifMethod(salário, ano);
        }
        return salário;
    }

    private double ifMethod(double salário, int ano){
        if (ano == 1996){
            return salário*1.5;
        }
        else{
            return salário*2;
        }
    }


}
