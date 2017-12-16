// Ian Smelser
// Dec 16, 2017

import java.util.Scanner;
import java.util.Random;

public class rouge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();


		int invIndex = 0;
		item[] inv = {new item(), new item(), new item(), new item(), new item()};
		room[] rooms = {new room(), new room(), new room(), new room(), new room()};

		rooms[0].setDiscription("Hallway");
		rooms[1].setDiscription("Study");
		rooms[2].setDiscription("Lounge");
		rooms[3].setDiscription("Greenhouse");
		rooms[4].setDiscription("Dining Room");

		rooms[0].num = 0;
		rooms[1].num = 1;
		rooms[2].num = 2;
		rooms[3].num = 3;
		rooms[4].num = 4;

		rooms[0].localItem.setDiscription("A silver key");
		rooms[0].localItem.setName("Key");

		rooms[1].localItem.setDiscription("An old revolver");
		rooms[1].localItem.setName("Revolver");

		rooms[2].localItem.setDiscription("An old book");
		rooms[2].localItem.setName("Book");

		rooms[3].localItem.setDiscription("null");
		rooms[3].localItem.setName("null");
		rooms[4].localItem.setDiscription("null");
		rooms[4].localItem.setName("null");

		rooms[0].Exits[0].target = rooms[1];
		rooms[0].Exits[1].target = rooms[2];

		rooms[1].Exits[0].target = rooms[3];
		rooms[1].Exits[1].target = rooms[0];

		rooms[2].Exits[0].target = rooms[0];
		rooms[2].Exits[1].target = rooms[4];

		rooms[3].Exits[0].target = rooms[1];
		rooms[3].Exits[1].target = rooms[4];

		rooms[4].Exits[0].target = rooms[2];
		rooms[4].Exits[1].target = rooms[1];

		int CR = 0;
		String in;
		int i, n, x;
		while (rooms[CR].getDescription() != "free") {
			System.out.println("You are in the " + rooms[CR].getDescription());
			System.out.println("You see a " + rooms[CR].localItem.getName());
			System.out.println("One door leads to the " + rooms[CR].Exits[0].getRoom().getDescription() + " and the other leads to the " + rooms[CR].Exits[1].getRoom().getDescription());
			System.out.print(">");
			in = sc.nextLine();
			System.out.println(in);
			for (i = 0; i < 5; i++) {
				for (n = 0; n < 2; n++) {
					if (rooms[i].Exits[n].target.getDescription().equals(in)) {
						CR = rooms[i].Exits[n].target.num;
					}
				}

			}
			if (in.contains("get") && in.contains(rooms[CR].localItem.getName())) {
				inv[invIndex] = rooms[CR].localItem;
				System.out.println(inv[invIndex].getName());
			}
			if (in.contains("use")) {
				for (x = 0; x < 5; x++) {
					System.out.println(inv[x].getName() == "Key");
					if (in.contains(inv[x].getName())) {
						if (inv[x].getName() == "Key") {
							if (CR == 0) {
								rooms[CR].setDiscription("free");
								System.out.println("You have escaped!");
							}
						}
					}
				}
			}
		}
	}

}



