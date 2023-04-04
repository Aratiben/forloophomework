import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //scanner method
        System.out.println("enter any number");          //printing message
        int n = scanner.nextInt();
        System.out.println(n);
        int count = 0;           //creating int

        for (int i = 1; i <= n; i++) {           //using for loop method
            if (n % i == 0)
                count++;

        }
        if (count == 2) {
            System.out.println("prime number");}     //printing message
         else {
                System.out.println("not prime number");

            }




        }
    }
