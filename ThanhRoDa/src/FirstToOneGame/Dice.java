package FirstToOneGame;

import java.util.Random;

public class Dice {
	private  int dice;

	public void rollDice() {
		Random r = new Random();
		dice = r.nextInt(6) + 1;
	}
	public int getDice() {
		return dice;
	}
	
	public void DisplayDice() {
		System.out.println("Roll is:  " + dice);
	}
}
