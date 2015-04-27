import java.util.Scanner;


public class DiceDisplayMessage {
	



//constructor
public DiceDisplayMessage()

{
	
	
}


	public void displayMessage(Object Roll1, Object Roll2, Object Roll3)
	
	{ 
		Scanner input = new Scanner(System.in);

		Dice R1 = new Dice(Roll1, 0, 0);
		Dice R2 = new Dice(Roll2, 0, 0);
		Dice R3 = new Dice(Roll3, 0, 0);
		
		String Answer;
		int Answer2;
		int Guess;
		int Guess2;
		int Guess3;
	
	
		//asks player if the want to play
		System.out.print("Do you want to play a dice guessing game? ");
		Answer = input.next();//stores answer
		
		switch(Answer) //depending on the answer it will run the game.
		{
			
		case ("yes"):  System.out.print("how many dice do you want to play with?");
			    Answer2 = input.nextInt();	//we input how many dice they want to use.
		
			   
				switch (Answer2)//depending on the answer, it will run one of these cases.
				{ 
					
				case 1: System.out.print("Guess a Number between 1-6.");//rolling 1 die.
						Guess = input.nextInt();	// stores number player guessed.
					
						
						if (Guess == R1.Roll1) //player guess and random die roll match, player wins.
						{
							System.out.print("you guessed correct!" );
						}
						else
							
				   	 		System.out.printf("%s%d%s"," The computer chose ",Roll1," you guessed wrong!");
						
				break;
				case 2: System.out.print("Guess a number between 2-12.");//rolling 2 dice.
				  		Guess2 = input.nextInt();
					
				   	 	if (Guess2 == R2.Roll2)
				   	 	{
				   	 		System.out.print("you guessed correct!");
				   	 		
				   	 		
				   	 	}
				   	 	else
				   	 		System.out.printf("%s%d%s"," The computer chose ",Roll2," you guessed wrong!");
				
				break;
				case 3: System.out.print("Guess a number between 3-18.");//rolling 3 dice.
						Guess3 = input.nextInt();
						
						
				 
						if(Guess3 == R3.Roll3)
						{
							System.out.print("you guessed correct!");
						}
						
						else
				   	 		System.out.printf("%s%d%s"," The computer chose ",Roll3," you guessed wrong!");
				
				}
				
				
		break;
	
		case ("no"):
		
			System.out.println("Sorry to see you go! Goodbye!");
		}
		
	}

	
	
}
