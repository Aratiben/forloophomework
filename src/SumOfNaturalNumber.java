import java.util.Scanner;

public class SumOfNaturalNumber {

    public static void main(String[] args) {          //main method
        Scanner scanner=new Scanner(System.in);   //scanner class inbuilt class
        System.out.println("please type number");
        int number =scanner.nextInt();
        int result =0;                       //creating int
        for (int i = 0; i <=number; i++) {   //using for loop method

            result = result+i;                  //making final result

        }
        System.out.println(result);     //printing final result
    }
}
