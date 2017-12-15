// Ian Smelser
//Saturday, November 11, 2017

import java.util.Scanner;
import java.util.Random;

public class rouge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		room[] rooms = new room[100];
		for (int i = 0; i<100; i++) {
			rooms[i] = new room();
			rooms[i].setDescription("Room "+i);
		}
	}
}



