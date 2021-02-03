import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) throws IOException {	
		Scanner reader = new Scanner(System.in); //Creates an object to read user input
		Random rand = new Random(); //Creates an object from Random class
		int number =rand.nextInt(100); //generates a number between 0 and 99
		
		
		System.out.println("Hi! I'm thinking of a number between 0 and 99.");
		System.out.print("Can you guess it: ");
		
		//int guess = reader.nextInt(); //Read the user input
		int count=1;
		while(true) {
			int guess = reader.nextInt();
			reader.nextLine();
			if ((number == guess)){
				System.out.println("Congratulations! You won after "+count+(count==1 ? " attempt!" : " attempts!"));
				break;
			}
			else if (guess==-1) {
				System.out.println("sorry the number was " + number);
				break;
			}else {
				if (guess<number) {
					System.out.println("Sorry!\nMine is greater than yours\nType -1 to quit or guess another");
				}
				else {
					System.out.println("Sorry!\nMine is less than yours\nType -1 to quit or guess another");
				}
				}
		count+=1;
		}
		reader.close(); //Close the resource before exiting


	}
	
	
}