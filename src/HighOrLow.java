import java.util.Random;
import java.util.Scanner;

public class HighOrLow {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        boolean success = false;

        int MIN = 1;
        int MAX = 10;
        int random = rand.nextInt(10) + 1;

        int guess = 0;
        do {
            System.out.print("Guess the number [1-10]: ");
            if (in.hasNextInt()) {
                guess = in.nextInt();
                in.nextLine();
                if (guess > 0)
                    success = true;
            } else
                System.out.println("ERROR: invalid value of '" + in.nextLine() + "'");
        } while (!success);

        if (guess > random)
            System.out.println("The guess of " + guess + " was higher than the selected number of " + random + ".");
        else if (guess < random)
            System.out.println("The guess of " + guess + " was lower than the selected number of " + random + ".");
        else
            System.out.println("The guess of " + guess + " was on the money! The selected number was " + random + "." );

    }
}
