public class MetodoExe02Uni05 {
    public static void main(String[] args) {
        new MetodoExe02Uni05();
    }

    MetodoExe02Uni05(){
        parNum();
        imparNum();
    }

    private void parNum(){
        int soma = 0;
        for (int i=2; i<=100; i= i+2){
            soma = soma + i; 
        }
        System.out.println(soma);
    }

    private void imparNum(){
        int soma = 0;
        for (int i=1; i<=100; i= i+2){
            soma = soma + i; 
        }
        System.out.println(soma);
    }

}
