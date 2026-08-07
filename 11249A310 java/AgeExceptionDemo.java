import java.util.Scanner;
public class AgeExceptionDemo {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            System.out.print("enter your age:");
            String input=sc.nextLine();
            int age = Integer.parseInt(input);
            int result=100/age;
            System.out.println("Age entered:" +age);
            System.out.println("100/Age=" +result);
        } catch(NumberFormatException e) {
            System.out.println("Error:please enter a valid numeric age:");
        } catch(ArithmeticException e) {
            System.out.println("error:Age cannot be zero.");
        }
        sc.close();
           

    }
}