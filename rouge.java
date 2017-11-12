// Ian Smelser
//Saturday, November 11, 2017

import java.util.Scanner;
import java.util.Random;
// import System.out.println;

public class rouge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		int winRoom = rand.nextInt(90)+10;
		int currentRoom = 10;
		room[] rooms = new room[100];

		for (int i = 0; i<100; i++) {
			rooms[i] = new room(rand, i);
		}

		System.out.println("==========Welcome to ROUGE==========");
		//System.out.println("------------------------------------");
		System.out.println("You wake up in a weird room.");
		System.out.println("You do not know where you are.");


		while (currentRoom!=winRoom) {
			System.out.println("You are in room "+currentRoom);
			System.out.println("Choose a direction N/S");
			char c = sc.next().charAt(0);
			rooms[currentRoom].printRoom();
			if (c=='N' || c=='n') {
				currentRoom=rooms[currentRoom].roomN();
			}
			if (c=='S' || c=='s') {
				currentRoom=rooms[currentRoom].roomS();
			}
			c=' ';

		}
		System.out.println("Oh Hey! You won!");
		

		
		
	}
}

class room {
	
	public static int connectNorth;
	public static int connectSouth;
	room(Random rand, int i) {

		connectNorth = i+1;
		connectSouth = 50;
	}

	public static void printRoom() {
		System.out.println("N="+connectNorth);
		System.out.println("S="+connectSouth);
	}
	public static int roomN() {
		return connectNorth;
	}
	public static int roomS() {
		return connectSouth;
	}
}