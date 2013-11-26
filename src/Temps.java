import java.util.Scanner;
public class Temps
{
// --------------------------------------------------
// Reads in a sequence of temperatures and finds the
// maximum and minimum read in.
// --------------------------------------------------
    public static void main (String[] args)
    {
        final int HOURS_PER_DAY = 24;
        int temp; // a temperature reading
        int maxTemp = -1000;
        int timeofmax = 0;
        int minTemp = 1000;
        int timeofmin = 0;
        Scanner scan = new Scanner(System.in);
        // print program heading
        
        System.out.println ();
        System.out.println ("Temperature Readings for 24 Hour Period");
        System.out.println ();
        for (int hour = 0; hour < HOURS_PER_DAY; hour++)
        {
            System.out.print (" Enter the temperature reading at " + hour +
                    " hours: ");
            temp = scan.nextInt();
            if (temp > maxTemp){
                maxTemp = temp;
                timeofmax = hour;
            }
            if (temp < minTemp){
                minTemp = temp;
                timeofmin = hour;
            }
        }
        // Print the results
        System.out.print("The maximum temperature is " + maxTemp + " at " + timeofmax + " hours.");
        System.out.println("The minimum temperature is "  + minTemp + " at " + timeofmin + " hours.");
        scan.close();
    }
}