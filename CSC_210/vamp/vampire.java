// Ian Smelser
// Sunday, November 5, 2017
import java.util.Scanner;
import java.util.Random;

public class vampire {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		int[][] grid = new int[10][10];
		int x1 = rand.nextInt(9);
		int y1 = rand.nextInt(9);
		grid[x1][y1] = 3;
		int cheat = 0;
		System.out.println("Would you like to cheat? (1/0)");
		cheat=sc.nextInt();
		int bp = rand.nextInt(5) + 5;

		while (bp > 0) {
			printArray(grid, cheat);
			System.out.println("You have " + bp + " Bloodpoints");
			System.out.print("Enter your next x coordinate (0,9): ");
			int x = sc.nextInt();
			if (x<0) {x=0;}
			if (x>9) {x=9;}
			System.out.print("Enter your next y coordinate (0,9): ");
			int y = sc.nextInt();
			if (y<0) {y=0;}
			if (y>9) {y=9;}
			if (x == x1 && y == y1) {
				System.out.println("You have killed your target.");
				System.exit(0);
			}
			dist(x1, y1, x, y);
			grid[x][y]=2;
			int nextRandom = rand.nextInt(3);
			bp = bp-fireArrow(nextRandom);


		}
		System.out.println("You are dead");


	}
	public static void printArray(int[][] arr, int cheat) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (arr[i][j] == 3 && cheat == 1) {
					System.out.print("+");
				}
				if (arr[i][j] == 0) {
					System.out.print(" ");
				}
				if (arr[i][j] == 1) {
					System.out.print("X"); // unused 
				}
				if (arr[i][j] == 2) {
					System.out.print("x");
				}

			}
			System.out.println("");
		}
	}
	public static int fireArrow(int randomNum) {
		int random = randomNum;
		if (randomNum == 0) {
			System.out.println("An arrow misses you; no damage is done.");
		} else if (randomNum == 1) {
			System.out.println("an arrow grazes you; you lose one bloodpoint.");
		} else if (randomNum == 2) {
			System.out.println("an arrow hits you; you lose two bloodpoint.");
		}
		return randomNum;
	}
	public static void dist(int x1, int y1, int x, int y) {
		double distance = Math.sqrt((x1 - x) * (x1 - x) + (y1 - y) * (y1 - y));  // Avoid Math functions
		System.out.println("You are "+distance + " units away.");
	}
}