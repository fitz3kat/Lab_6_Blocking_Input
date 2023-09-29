import java.util.Scanner;
public class MetricConverter {
    public static void main(String[] args) {
        double meters = 0;
        double miles = 0;
        double feet  = 0;
        double inches = 0;
        boolean done = false;
        String trash = "";

        Scanner in = new Scanner(System.in);

        do {
            System.out.print("Enter a numeric distance in meters: ");
            if (in.hasNextDouble())
            {
                meters = in.nextDouble();
                in.nextLine();
                miles = meters/ 1609.34;
                feet = 3.28084 * meters;
                inches = 39.3701 * meters;

                System.out.println(meters + " in miles is " + miles);
                System.out.println(meters + " in feet is " + feet);
                System.out.println(meters + " in inches is " + inches);


                done = true;

            }

            else
            {
                trash = in.nextLine();
                System.out.println("You told me " + trash);
                System.out.println("Please try again and enter a numeric distance.");
            }


        } while (!done);
    }
}
