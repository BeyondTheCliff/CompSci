// Sorry. My code did not get saved to the server.



import java.util.Scanner;
public class PlantGrowth {
    public static void main(String [] args) {

    	Scanner scan = new Scanner(System.in);

		final int NUMMONTHS = 12;
		int [] avgTemp = {46, 48, 49, 50, 51, 53, 54, 55, 56, 55, 51, 47};
		int [] avgRain = {5, 3, 3, 1, 1, 0, 0, 0, 0, 1, 3, 4};
		int [] newGrowth;
	
		newGrowth = new int[NUMMONTHS];
	
		System.out.print("Enter minimum temperature for plant:");
		int minTMP = scan.nextInt();
		System.out.print("Enter maximum temperature for plant:");
		int maxTMP = scan.nextInt();
		System.out.print("Enter minimum rainfall for plant:");
		int minRain = scan.nextInt();

		int[] tst = new int[3];
		tst[0]=minTMP;
		tst[1]=maxTMP;
		tst[2]=minRain;
		System.out.println(formater(tst));

		System.out.println("Month    Temp    Rain    Growth    Plant Height");
		for (int i=0; i<NUMMONTHS; i++) {
			if (avgTemp[i]>minTMP && avgTemp[i]<maxTMP && avgRain[i]>minRain) {
				if (i==0) {
					newGrowth[i]=avgRain[i];
				} else {
					newGrowth[i]=newGrowth[i-1]+avgRain[i];
				}
			}
			System.out.print(i);
			System.out.print("    ");
			System.out.print(avgTemp[i]);
			System.out.print("    ");
			System.out.print(avgRain[i]);
			System.out.print("    ");
			System.out.print("nan");
			System.out.print("    ");
			System.out.println(newGrowth[i]);
		}
    }
    public static String formater(int[] inpu) {
    	String nuw = new String("");
    	for (int i=0; i<3; i++) {
    		nuw=nuw+String.valueOf(inpu[i]);
    	}
    	return nuw;
    }
}