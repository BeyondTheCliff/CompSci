import java.util.Scanner;
public class ThreeA {
	public static void main(String[] args) {
		double[] x = {0.2,-0.1,2.7,-1.6,1.5};
		int n;

		Scanner input = new Scanner(System.in);

		n = input.nextInt();

		if (x[n]<0) {
			x[n-1]=2.0 * x[n];
		}
		else {
			x[n+1] = x[n];
		}

		if (x[n+1]<x[n]) {
			x[0]=1.0-x[n];
		}
		else {
			x[0]=x[n];
		}

		for (n=0; n<5; n++) {
			System.out.println(x[n]);
		}
	}
	
}