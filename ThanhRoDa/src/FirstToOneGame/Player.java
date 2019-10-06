package FirstToOneGame;

public class Player {
	
	private int[] player;
	
	
	public Player(int number) {
		player = new int[number];
		for (int i=0;i<player.length;i++)
			player[i]=50;
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

	public void currentPoint(int i,Dice d) {
		if (( player[i] < d.getDice()) )
			player[i] = (player[i] + d.getDice());
		else
			player[i] = player[i] - d.getDice();
		
		System.out.println(" Dice : " + d.getDice() + " Remaind Score player "+ (i+1) + " : " + player[i] );
	}

//	public boolean winner() {
//		return (player[] == 1);
//	}

}
