import java.util.Random;
import java.util.Scanner;

public class thing {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		System.out.print("Enter N");
		int N = sc.nextint();
		System.out.print("Enter min");
		int min = sc.nextint();

		int x= new int[N];
		generateNumList(x, min, 999);
		for (int i; i<N; i++) {
			if (x[i]==111 || x[i]==222 || x[i]==333 || x[i]==444 || x[i]==555 || x[i]==666 || x[i]==777 || x[i]==888 || x[i]==999) {
				System.out.println(x[i]);
			}
		}
	}
}