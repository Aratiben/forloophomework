import java.util.Scanner;

public class NumberDisplayandTheirSum {
    public static void main(String[] args) {  //main method
        Scanner scanner=new Scanner(System.in);              //scanner class
        System.out.println("please type number");        //printing message
        int a = scanner.nextInt();
        System.out.println(a);
        int result =0;
        for (int i = 0; i <=a; i++) {                    //for loop method
            System.out.println(i);
            result = result+i;                         //result
        }
        System.out.println(result);                 //printing final result

    }
}


