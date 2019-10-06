package HeadsorTailsGame;

import java.util.Random;

public class Coin {
	private  int coin;

	public void rollCoin() {
		Random r = new Random();
		coin = r.nextInt(2) + 1;
	}
	public int getCoin() {
		return coin;
	}
}
