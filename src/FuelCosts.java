import java.util.Scanner;

public class FuelCosts {
    public static void main(String [] args) {

        Scanner in = new Scanner(System.in);
        double gasTankGallons = 0.0;
        double fuelEfficiency = 0.0;
        double gasPricePerGallon = 0.0;

        boolean success = false;
        do {
            System.out.print("Enter the number of gallons in the tank: ");
            if (in.hasNextDouble()) {
                gasTankGallons = in.nextDouble();
                in.nextLine();
                if (gasTankGallons > 0)
                    success = true;
            } else
                System.out.println("ERROR: invalid value of '" + in.nextLine() + "'");
        } while (!success);

        success = false;
        do {
            System.out.print("Enter the fuel efficiency in miles per gallon: ");
            if (in.hasNextDouble()) {
                fuelEfficiency = in.nextDouble();
                in.nextLine();
                if (fuelEfficiency > 0)
                    success = true;
            } else
                System.out.println("ERROR: invalid value of '" + in.nextLine() + "'");
        } while (!success);

        success = false;
        do {
            System.out.print("Enter the price of gas per gallon: ");
            if (in.hasNextDouble()) {
                gasPricePerGallon = in.nextDouble();
                in.nextLine();
                if (gasPricePerGallon > 0)
                    success = true;
            } else
                System.out.println("ERROR: invalid value of '" + in.nextLine() + "'");
        } while (!success);

        double costPer100 = 100 / fuelEfficiency * gasPricePerGallon;
        System.out.println("Cost per 100 miles: $" + String.format("%.2f", costPer100));

        double remainingMiles = gasTankGallons * fuelEfficiency;
        System.out.println("Miles remaining on the tank: " + String.format("%.2f", remainingMiles));
    }
}
