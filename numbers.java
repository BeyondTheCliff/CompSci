import java.util.Scanner; // Basic input
public class numbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] nums = new double[100]; // Using doubles to support decimals 
        int counter = 0;                 // Array set to 100, I hope that is enough
        String in = "";

        while (true) { // Run forever. Rely on system exit condidtion
            System.out.print("Enter Number >");
            in = scan.nextLine(); // Read line as string then parse
            try {
                double d = Double.parseDouble(in);
                nums[counter] = d;
                counter++;
            } catch (NumberFormatException nfe) { // Exit on any non-double
            	System.out.println("Exiting:")
                System.exit(1);
            }
            printArray(nums, counter); // I did not want to do a full array to string translation
            System.out.println("The new average is " + average(nums, counter));
            System.out.println("The new sum is " + sum(nums, counter));
            System.out.println("The new max is " + max(nums, counter));
            System.out.println("The new min is " + min(nums, counter));


        }
        
    // All important statistics run as functions for portability 
    }
    public static double average(double[] numsList, int count)  {
        double sum = 0;
        for (int i =0; i<count; i++) {
            sum=sum+numsList[i];
        }
        double ans = sum/count;
        return ans;
    }
    public static double sum(double[] numsList, int count)  {
        double sum = 0;
        for (int i =0; i<count; i++) {
            sum=sum+numsList[i];
        }
        return sum;
    }
    public static double max(double[] numsList, int count)  {
        double max = -10000;
        for (int i =0; i<count; i++) {
            if (numsList[i]>max) {
            	max=numsList[i];
            }
        }
        return max;
    }
    public static double min(double[] numsList, int count)  {
        double min = 10000;
        for (int i =0; i<count; i++) {
            if (numsList[i]<min) {
            	min=numsList[i];
            }
        }
        return min;
    }
    public static void printArray(double[] numsList, int count) {
        // Print out array as Python style 
    	System.out.print("The current array is [");
    	for (int i=0; i<count; i++) {
    		System.out.print(numsList[i]+",");
    	}
    	System.out.println("]");
    }

}
