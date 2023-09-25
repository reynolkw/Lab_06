import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double tempCelsius = 0.0;
        boolean success = false;
        do {
            System.out.print("Enter the temperature in Celsius: ");
            if (in.hasNextDouble()) {
                tempCelsius = in.nextDouble();
                in.nextLine(); // clear in buffer
                success = true;
            } else
                System.out.println("ERROR: invalid value of '" + in.nextLine() + "'");
        } while (!success);

        double tempFahrenheit = (tempCelsius * 9/5) + 32;
        System.out.println("The temperature " + tempCelsius + "C is " + tempFahrenheit + "F.");
    }
}