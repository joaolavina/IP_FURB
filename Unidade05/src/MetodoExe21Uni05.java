public class MetodoExe21Uni05 {
    public static void main(String[] args) {
        new MetodoExe21Uni05();
    }

    MetodoExe21Uni05(){
        int anos = 0;
        anos = whileMethod(anos);
        System.out.println("São necessários "+anos+" anos para Zé ser maior que Chico");
    }

    private int whileMethod(int anos){
        double alturaChico = 1.50;
        double alturaZé = 1.10;
        while (alturaChico>alturaZé){
            alturaChico = addChico(alturaChico);
            alturaZé = addZé(alturaZé);
            anos++;
        }
        return anos;
    }

    private double addChico(double alturaChico){
        return alturaChico + 0.02;
    }

    private double addZé(double alturaZé){
        return alturaZé + 0.03;
    }
}
