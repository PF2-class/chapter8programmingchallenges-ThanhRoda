package HeadsorTailsGame;

public class HeadsorTailsGame {

	public static void main(String[] args) {
		Player p = new Player(2);
		Coin c = new Coin();
		System.out.println("Welcome to Heads or Tails Game ");
		int turn =0;
		while(true) {
			turn++;
			System.out.println("turn : " +turn);
			for(int i =0;i < p.getNumberPlayer();i++) {
				
				c.rollCoin();
				p.FindWiner(i, c);
				if(p.getpoint()[i] == 5) {
				System.out.println("Player " + (i + 1) + " is winner.");
				return;
				}
		}
		
	}

}
}