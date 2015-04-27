

public class DiceGameMain {

	public static void main(String[] args ){
		
		DiceDisplayMessage myDiceDisplayMessage = new DiceDisplayMessage();
		
		Object Roll1 = 1 + (int)(Math.random()*6);
		Object Roll2 = 2 + (int)(Math.random()*6);
		Object Roll3 = 3 + (int)(Math.random()*6);
		
		myDiceDisplayMessage.displayMessage(Roll1, Roll2, Roll3);
		
	}
}
