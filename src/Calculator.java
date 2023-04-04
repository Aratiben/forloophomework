import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        int number1, number2, result;

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the first number");
        int a = scanner.nextInt();
        System.out.println("please enter the second number");
        int b = scanner.nextInt();
        System.out.println("please enter any oprator from +,-,*,/");
        char c = scanner.next().charAt(0);


        switch (c) {
            case '+':
                result = a + b;
                System.out.println(result);
                break;
            case '-':
                result = a - b;
                System.out.println(result);
                break;
            case '*':
                result = a *b;
                System.out.println(result);
                break;
            case '/':
                result = a / b;
                System.out.println(result);
                break;
            default:
                System.out.println("this entry is invalid");
        }
    }
}