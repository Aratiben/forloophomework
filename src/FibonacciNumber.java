import java.util.Scanner;

public class FibonacciNumber {                         //class name

    public static void main(String[] args) {           //main method
        Scanner scanner = new Scanner(System.in);       //scanner using inbuilt method
        System.out.println("please input your number");
        int n = scanner.nextInt();
        System.out.println(n);
        int a = 0;                                   //int
        int b = 1;

        for (int i = b; i <= n; ++i) {                  //using for loop

            System.out.println(a + "");
            int c = a + b;
            a = b;
            b = c;

        }
    }
}
