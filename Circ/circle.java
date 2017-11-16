// Ian Smelser

import java.util.Scanner;  // int input
import java.util.Random;  // random numbers
public class circle {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();


        System.out.print("Enter radius: ");
        int radius = sc.nextInt(); // Large radius might be better for pi

        System.out.println("Enter -1 to use random numbers, or 0 to set your own coordinates: ");
        int choice = sc.nextInt();



        if (choice < 0) {
            System.out.print("Enter number of random points: ");
            int count = sc.nextInt(); // Get 
            x = 0; // Ugly. I know. 
            int y = 0; // Reset both x and y for use in random numbers
            int ins = 0; // Count inside points
            for (int i = 0; i < count; i++) {
                x = rand.nextInt(radius); // Would doubles make it more accurate?
                y = rand.nextInt(radius);
                if (x * x + y * y <= radius * radius) {
                    //System.out.println("Point (" + x + ", " + y + ") falls inside the circle.");
                    // Removed to speed things up
                    ins=ins+1;
                } else {
                    //System.out.println("Point (" + x + ", " + y + ") falls outside the circle.");
                    // Still here for demonstration 
                }
            }
            double piNum = ((double)ins*4)/(double)count;
            System.out.println(piNum);
        } else {
        	System.out.print("Enter X point: ");
        	int x = sc.nextInt();

            System.out.print("Enter Y point: ");
            int y = sc.nextInt();

            if (x * x + y * y <= radius * radius) {
                System.out.println("Point " + x + ", " + y + " falls inside the circle.");
            } else {
                System.out.println("Point (" + x + ", " + y + ") falls outside the circle.");
            }
        }
    }
}