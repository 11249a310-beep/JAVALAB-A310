import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number:");
        int a=sc.nextInt();
        System.out.print("enter second number:");
        int b=sc.nextInt();
        System.out.println("Choose an operation:");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multipication");
        System.out.println("4.Division");
        System.out.print("Enter your choice (1-4):");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Addition ="+(a+b));
                break;
            case 2:
                    System.out.println("Subtraction="+(a-b));  
                    break;
            case 3:
                System.out.println("Multiplication = " + (a * b));
                break;

            case 4:
                if (b != 0)
                    System.out.println("Division = " + (a / b));
                else
                    System.out.println("Cannot divide by zero.");
                break;

            default:
                System.out.println("Invalid choice.");
        }

        sc.close();          
        }
    } 
