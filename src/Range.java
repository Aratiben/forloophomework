import java.util.Scanner;

public class Range {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);             //using inbuilt class
        System.out.print("please type your start number: ");     //printing message
        int number1 = scanner.nextInt();
        System.out.println(number1);
        System.out.print("please type your end number: ");
        int number2 = scanner.nextInt();          //creating int
        System.out.println(number2);              //printing number
        for (int i = number1+1; i < number2; i++) {          //for loop method
            System.out.println(i);         //printing final message
        }
    }
}


