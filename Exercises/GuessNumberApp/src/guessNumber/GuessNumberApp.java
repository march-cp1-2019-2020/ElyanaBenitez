/**
 * 
 * Elyana Benitez
 * 03/25/2020
 * 
 */
// When I got to the point of adding the while loop, it didn't work. I don't know why.
package guessNumber;

import java.util.Scanner;

public class GuessNumberApp {

	public static void main(String[] args) {
		final int LIMIT = 10;
		
        System.out.println("Guess the number!");
        System.out.println("I'm thinking of a number from 1 to " + LIMIT);
        System.out.println();
         
        Scanner sc = new Scanner(System.in);
    String choice = "y";
    while (choice.equalsIgnoreCase("y")) {
    	
        // get a random number between 1 and the limit
        double d = Math.random() * LIMIT; // d is >= 0.0 and < limit
        int randomNum = (int) d;             // convert double to int
        randomNum++;                         // int is >= 1 and <= limit
        
        
        String choice1 = "y";
        
        	// prepare to read input from the user
        	//Scanner sc = new Scanner(System.in);
        	
        	int guess = sc.nextInt();
        	System.out.println("You guessed: " + guess);
        	
        		
        		// Scanner sc1 = new Scanner(System.in);
        	while (!(guess = randomNum)) {
    		
        		guess = sc.nextInt();
        		System.out.println("You guessed: " + guess);
        		
        		//TODO: compare the guess to the random number
        		
        		//  ??? NOT SURE WHAT TO DO HERE ???
        		
        		//TODO: what should happen if the user enters a number outside the range?
        	
        		if ((guess > LIMIT) || (guess < 1)) {
        			System.out.println("Not valid");
        			System.out.println("Please pick a number within the range 1 - 10");
        		}
        	
        		//TODO: print out a message to the user saying "Too high" or "Too low"
        	
        		if ((guess < randomNum) && (guess >= 1)) {
        			System.out.println("too low");
        		} else if ((guess > randomNum) && (guess <= 10) ) {
        			System.out.println("too high");
        		}
        	}
	    		//guess == randomNum
        	if (guess.equals(randomNum)) {
        		System.out.println("You WON!!!");
        	}
        		System.out.print("Continue? (y/n): ");
        		choice = sc.nextLine();
        		System.out.println();
        		}
       
        	}
			sc.close();
			System.out.println("Bye!");
		}
	}
}

