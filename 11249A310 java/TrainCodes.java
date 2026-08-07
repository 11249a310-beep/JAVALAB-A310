import java.util.Scanner;

public class TrainCodes {
    public static void main(String[] args) {

        String[] trainCodes = {"TN01", "TN02", "TN03", "TN04"};

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the train index (0-3): ");
        int index = sc.nextInt();

        try {
            System.out.println("Train Code: " + trainCodes[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid train index!");
        }

        sc.close();
    }
}