
import java.util.Scanner;

public class FactorialNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        //using scanner inbuilt method
        System.out.println("please type number");
        int number = scanner.nextInt();
        System.out.println(number);            //printing number
        int result = 1;
        for (int i = 1; i <= number; i++) {      //using for loop

           result = result * i;     // multiple with i
        }

        System.out.println(result);        // printing final result
    }
}
