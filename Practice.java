import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("You have 4 tries.");
        int randomNumber;
        Random random = new Random();
        randomNumber = random.nextInt(20);
        System.out.println("Hint it is under 20.");
        int k = sc.nextInt();

        if (k != randomNumber) {
            System.out.println("Guess again:");
            k = sc.nextInt();
        } else {
            System.out.println("Good job you were right! The number was: " + randomNumber);
            System.exit(0);
        }
        if (k != randomNumber) {
            System.out.println("Keep gussing, two more tries");
            System.out.println("Incorrect guess again: ");
            k = sc.nextInt();
        }
else{
            System.out.println("Good job you were right! The number was: " + randomNumber);
            System.exit(0);
        }

        if (k != randomNumber) {
            System.out.println("Guess again: ");
            k = sc.nextInt();
        }
else{
            System.out.println("Good job you were right! The number was: " + randomNumber);
            System.exit(0);
        }
        System.out.println("Sorry out of tries...");
        System.out.println("The number was: " + randomNumber);

    }
}
