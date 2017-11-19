import java.util.Scanner;

public class test {
	

	public static void main(String[] args) {
		String in = "";
		int num = 0;
		int count = 0;

		System.out.print("> ");

		Scanner scan = new Scanner(System.in);

		in = scan.nextLine();

		for(int i=0; i<in.length(); i++) {
			if (in.charAt(i)=='a' || in.charAt(i)=='e' || in.charAt(i)=='i' || in.charAt(i)=='o' || in.charAt(i)=='u') {
				count++;
				System.out.print(in.charAt(i));
			}
		}
		System.out.println("");
		System.out.print("Vowel count = ");
		System.out.println(count);
	}
}