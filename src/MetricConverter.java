import java.util.Scanner;
public class MetricConverter {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        boolean success = false;

        double measureMeters = 0.0;
        do {
            System.out.print("Enter the measurement in meters: ");
            if (in.hasNextDouble()) {
                measureMeters = in.nextDouble();
                in.nextLine();
                if (measureMeters > 0)
                    success = true;
            } else
                System.out.println("ERROR: invalid value of '" + in.nextLine() + "'");
        } while (!success);

        double METERS_IN_MILE = 1609.344;
        System.out.println("The measurement in miles is: " + (measureMeters / METERS_IN_MILE));

        double METERS_IN_FOOT = 0.3048;
        System.out.println("The measurement in feet is: " + (measureMeters / METERS_IN_FOOT));

        double METERS_IN_INCH = 0.0254;
        System.out.println("The measurement in inches is: " + (measureMeters / METERS_IN_INCH));
    }
}
