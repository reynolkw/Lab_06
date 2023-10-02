import java.util.Scanner;

public class RectangleInfo {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        boolean success = false;

        double rectWidth = 0.0;
        do {
            System.out.print("Enter the width of the rectangle: ");
            if (in.hasNextDouble()) {
                rectWidth = in.nextDouble();
                in.nextLine();
                if (rectWidth > 0)
                    success = true;
            } else
                System.out.println("ERROR: invalid value of '" + in.nextLine() + "'");
        } while (!success);

        success = false;
        double rectHeight = 0.0;
        do {
            System.out.print("Enter the height of the rectangle: ");
            if (in.hasNextDouble()) {
                rectHeight = in.nextDouble();
                in.nextLine();
                if (rectHeight > 0)
                    success = true;
            } else
                System.out.println("ERROR: invalid value of '" + in.nextLine() + "'");
        } while (!success);

        System.out.println("The area of the rectangle is: " + rectHeight * rectWidth);
        System.out.println("The perimeter of the rectangle is: " + ((rectHeight * 2) + (rectWidth * 2)));
        System.out.println("The diagonal of the rectangle is: " + (Math.sqrt(Math.pow(rectHeight, 2.0) + Math.pow(rectWidth, 2.0))));
    }
}
