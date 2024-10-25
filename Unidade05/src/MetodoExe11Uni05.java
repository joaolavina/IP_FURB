public class MetodoExe11Uni05 {
    public static void main(String[] args) {
        new MetodoExe11Uni05();  
    }

    MetodoExe11Uni05(){
        int biscoito = 3;
        int qntBiscoitos = 0;

        for(int i=3; i<=16; i++){
            biscoito = biscoitoVezes3(qntBiscoitos);
            qntBiscoitos = qntBiscoitosFor(biscoito, qntBiscoitos);
        }
        qntBiscoitosTotal(qntBiscoitos);
    }

    private int biscoitoVezes3(int biscoito){
        return biscoito*3;
    }

    private int qntBiscoitosFor(int biscoito, int qntBiscoitos){
        return  qntBiscoitos + biscoito;
    }

    private void qntBiscoitosTotal(int qntBiscoitos){
        qntBiscoitos = qntBiscoitos+4;
        System.out.println("Quantidade de biscoitos quebrados: "+qntBiscoitos); 
    }
}