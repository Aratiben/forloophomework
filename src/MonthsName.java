import java.util.Scanner;

public class MonthsName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //using inbuilt method to input data
        System.out.println("Please input any number ");  //printing message
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                System.out.println("January");         //month name
                break;
            case 2:
                System.out.println("February");         //month name
                break;
            case 3:
                System.out.println("March");              //month name
                break;
            case 4:
                System.out.println("April");              //month name
                break;
            case 5:
                System.out.println("May");                  //month name
                break;
            case 6:
                System.out.println("June");                  //month name
                break;
            case 7:
                System.out.println("July");                 //month name
                break;
            case 8:
                System.out.println("August");              //month name
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");           //month name
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid Entry");        // if number is more than 12 then entry is invalid
        }
    }
}