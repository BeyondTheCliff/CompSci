public class two {
	public static void main(String[] args) {
		int i, x;

		x=2;
		for (i=5;i>3;i--) {
			do {
				x=x*2-1;
				System.out.println(x);
			} while (x<5);
			x=x+i;
			System.out.println(i+" "+x);
		}
	}
}