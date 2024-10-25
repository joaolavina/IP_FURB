public class MetodoExe10Uni05 {
    public static void main(String[] args) {
        new MetodoExe10Uni05();
        int a = 0;
        int b;
        int c;
        
        for(int i = 0; i<10; i++){
            b = a/100;
            c = a%100;
            if(Math.pow((b+c), 2)==a){
                System.out.println(a);
                a++;
            }
            else{
                a++;
                i--;
            }
        }
    }

    MetodoExe10Uni05(){
        int a = 0;
        int b;
        int c;

        for(int i = 0; i<10; i++){
            b = a/100;
            c = a%100;
            if(Math.pow((b+c), 2)==a){
                a = case1(a);
            }
            else{
                a = case21(a);
                i = case22(i);
            }
        }
    }

    private int case1(int a){
        System.out.println(a);
        return a++;
    }

    private int case21(int a){
        return a++;
    
    }

    private int case22(int i){
        return i--;
    }
}
