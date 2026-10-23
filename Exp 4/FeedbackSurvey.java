
import java.util.Scanner;

public class FeedbackSurvey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ratings[] = new int[5];
        int sum = 0;
        double average;

        System.out.println("Enter 5 feedback ratings (1-5):");

        for (int i = 0; i < 5; i++) {
            ratings[i] = sc.nextInt();
            sum += ratings[i];
        }

        average = (double) sum / 5;

        System.out.println("Total Rating: " + sum);
        System.out.println("Average Rating: " + average);

        sc.close();
    }
}
