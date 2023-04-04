import java.util.Scanner;

public class SumOfSeries {

  public static void main(String[] args) {          //main method
      Scanner scanner=new Scanner(System.in);   //using inbuilt class to input the value
      System.out.println("please type any number");  //printing message
      float n =scanner.nextInt();
        float result = 0;
      for (float i = 1; i <=n ; i++) {          //using for loop
           result= result+1/i;      }
        System.out.println(result);    // printing final method
    }
}
