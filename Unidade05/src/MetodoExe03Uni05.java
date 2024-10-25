public class MetodoExe03Uni05 {
   public static void main(String[] args) {
    new MetodoExe03Uni05();
   } 

   MetodoExe03Uni05(){
    calcular();
   }

   private void calcular(){
    double sum = 0;
        
    for (int i=1; i<=100; i++){
        sum = sum + (1.0/i);
    }

    System.out.println(sum);
   }
}
