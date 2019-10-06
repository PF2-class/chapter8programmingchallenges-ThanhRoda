package HeadsorTailsGame;

import java.util.Scanner;

public class Player {
private int[] player;
	
	
	public Player(int number) {
		player = new int[number];
		for (int i=0;i<player.length;i++)
			player[i]=0;
	}
	public int getpoint()[] {	
			return player;
	}
	public int  getNumberPlayer() {
		return player.length;
	}
	public Player() {
		super();
	}
	public int PlayerGuess() {
		Scanner k = new Scanner(System.in);
		System.out.println("Enter number 1 for up and 2 for down ");
		return k.nextInt();
	}
	public void FindWiner(int i, Coin c) {
		System.out.println("Player " + (i+1) +" :");
		if (PlayerGuess() == c.getCoin())
			System.out.println("Correct " +" your point : " + (player[i] += 1));
		else System.out.println("Sorry " +" your point : " + (player[i] -= 1));
	}
}
