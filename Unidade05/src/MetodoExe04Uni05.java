public class MetodoExe04Uni05 {
    public static void main(String[] args) {
        new MetodoExe04Uni05();
    }

    MetodoExe04Uni05(){
        calcular();
    }

    private void calcular(){
        double numerador = 1;
        int denominador = 0;
        double soma = 0;

        for (int i=1; i<=20; i++){
            numerador = numerador + 2;
            denominador =  denominador + i*2;
            soma = soma + (numerador/denominador);
        }
        
        System.out.println(soma);

    }

}
