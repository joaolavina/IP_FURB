/* Read two integer values. After this, calculate the product between them 
and store the result in a variable named PROD. Print the result like the example below. 
Do not forget to print the end of line after the result, otherwise you will receive “Presentation Error”.

Input
The input file contains 2 integer numbers.

Output
Print the message "PROD" and PROD according to the following example, 
with a blank space before and after the equal signal.
*/
 
import java.util.Scanner;

public class Uri1004Uni03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1 = input.nextInt();
        int n2 = input.nextInt();

        input.close();

        int PROD = n1*n2;

        System.out.println("PROD = "+PROD);
    }
}
