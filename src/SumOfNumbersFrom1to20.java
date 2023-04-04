import java.util.Scanner;

public class SumOfNumbersFrom1to20 {

    public static void main(String[] args) {         //main method
        Scanner scanner = new Scanner(System.in);   //scanner inbuilt class
        System.out.println("please type number from 1 to 20"); //printing message
        int a = scanner.nextInt();

        System.out.println(a);        //printing result
        int result = 0;

        for (int i = 0; i <= a; i++) {      //using for loop
            result = result + i;
        }  System.out.println(result);   //printing final result

    }
}


