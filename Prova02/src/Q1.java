import java.util.Scanner;

public class Q1 {
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);

        int age15 = 0, age16to30 = 0, age31to45 = 0, age46to60 = 0, ageAbove61 = 0, qnt = 0;
        double ageTotal = 0;
        String maior = "";

        System.out.println("Digite a idade: ");
        int age = input.nextInt();
        while (age >= 0) {
            if(age<=15){
                age15++;
            }
            else if(age>=16 && age<=30){
                age16to30++;
            }
            else if(age>=31 && age<=45){
                age31to45++;
            }
            else if(age>=46 && age<=60){
                age46to60++;
            }
            else{
                ageAbove61++;
            }

            ageTotal += age;

            qnt++;

            if(age15>age16to30 && age15>age31to45 && age15>age46to60 && age15>ageAbove61){
                maior = "Pessoas com até 15.";
            }
            else if(age16to30>age15 && age16to30>age31to45 && age16to30>age46to60 && age16to30>ageAbove61){
                maior = "Pessoas de 16 a 30 anos.";
            }
            else if(age31to45>age15 && age31to45>age16to30 && age31to45>age46to60 && age31to45>ageAbove61){
                maior = "Pessoas de 31 a 45 anos.";
            }
            else if(age46to60>age15 && age46to60>age16to30 && age46to60>age31to45 && age46to60>ageAbove61){
                maior = "Pessoas de 46 a 60 anos.";
            }
            else if(ageAbove61>age15 && ageAbove61>age16to30 && ageAbove61>age31to45 && ageAbove61>age46to60){
                maior = "Pessoas acima de 60 anos.";
            }

            System.out.println("Digite a idade: ");
            age = input.nextInt();
        }

        input.close();

        System.out.println("Quantidade de pessoas com até 15 anos: "+age15);
        System.out.println("Quantidade de pessoas de 16 a 30 anos: "+age16to30);
        System.out.println("Quantidade de pessoas de 31 a 45 anos: "+age31to45);
        System.out.println("Quantidade de pessoas de 46 a 60 anos: "+age46to60);
        System.out.println("Quantidade de pessoas acima de 60 anos: "+ageAbove61);

        System.out.println("Percentual de pessoas com até 15 anos em relação ao total: "+((age15*100)/qnt)+"%");
        System.out.println("Faixa etária com mais pessoas: "+maior);
        System.out.println("Média da iadde das pessoas: "+((ageTotal)/qnt));

    }
}
