package FirstToOneGame;

public class FirstToOneGame {

	public static void main(String[] args) {
		Dice d = new Dice();

		Player p = new Player(2);
		int turn = 0;
		while (true) {
			turn++;
			System.out.println("turn : " + turn);
			for (int i = 0; i < p.getNumberPlayer(); i++) {
				d.rollDice();
				p.currentPoint(i, d);
				if (p.getpoint()[i] == 1) {
					System.out.println("Player " + (i + 1) + " is winner.");
					return;
				}
			}
		}

	}

}
