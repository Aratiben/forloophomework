import javax.swing.text.StringContent;
 import java.util.Scanner;

public class FindOutTotalOfA {


    public static void main(String[] args) {             // main method
        Scanner scanner = new Scanner(System.in);        //using inbuilt method
        System.out.println("please input any string");      // printing message
        String name = scanner.nextLine();
        char a='a';
        int total = 0;                          //

        for (int i = 0; i < name.length(); i++) {    // using for loop
            if (name.charAt (i) == a) {          //
                total = total + 1;
            }
        }  System.out.println(total);

    }
}