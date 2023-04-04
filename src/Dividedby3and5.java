import java.util.Scanner;

public class Dividedby3and5 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);                   //scanner inbuilt class
        System.out.println("please enter any number from 1 to 100");       //printing message
        int a=scanner.nextInt();

        for (int i = 1; i <=a; i++) {                         //using for loop method
            if (i % 3 == 0)
                System.out.println(i + " is divisible by 3");
        }
        System.out.println("________________________________");
        for (int i = 1; i <= a; i++) {                    //using for method
            if (i % 5 == 0)
                System.out.println(i + " is divisible by 5");     // printing method
        }
    }
}



