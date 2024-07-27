package codsoft;
import java.util.Scanner;
import java.util.Random;

public class NumGuess {

	public static void main(String args[]) 
	{
		generateRandom();
		}
	

public static void generateRandom() {
   Random random=new Random();
   int randomNum = random.nextInt(99);
   guess(randomNum);
}
public static void guess(int randomNum) {
	Scanner in=new Scanner(System.in);
	System.out.println("");
	System.out.println("Number Guessing Game");
	System.out.print("Guess a number between 0-100:");
	int guess=in.nextInt();
	System.out.println("");
	while (guess<0 || guess>100) {
		System.out.print("Guess a number between 0-100: ");
		guess=in.nextInt();
		System.out.println("");
	}
	int tries=0;
	while(guess!=randomNum) {
		tries++;
		System.out.println("Wrong Guess!");
		System.out.println("Guess again:");
		guess=in.nextInt();
		System.out.print("");
	while (guess<0|| guess>100) {
		System.out.println("Guess the number between 0-100:");
		guess=in.nextInt();
		System.out.println("");
		
	}
	}

{
	System.out.println("Correct Answer.you won!");
	System.out.println("You scored 100!");
	System.out.println("wrong Tries:" +tries);
	System.out.println("");
	System.out.println("Press 1 to Play again");
	System.out.println("Press 0 to exit");
	int choice=in.nextInt();
	
	if(choice==1)
		generateRandom();
	else
		return;
	
}
}
}
	

  