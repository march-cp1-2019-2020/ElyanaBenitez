/**
 * 
 * Elyana Benitez
 * 03/25/2020
 * 
 */

package guessNumber;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessNumberApp {

	public static void main(String[] args) {
		final int LIMIT = 10;
		
        System.out.println("Guess the number!");
        System.out.println("To exit the game at any time, just type 'Quit'");
        System.out.println("I'm thinking of a number from 1 to " + LIMIT);
        System.out.println();
         	
        // get a random number between 1 and the limit
        double d = Math.random() * LIMIT; // d is >= 0.0 and < limit
        int randomNum = (int) d;             // convert double to int
        randomNum++;                         // int is >= 1 and <= limit
        
        
            Scanner sc = new Scanner(System.in);
            int count = 1;
       		
           
        	while (true) {
        		
        				
	       		try { 
	       			
	        		System.out.print("Guess a Number: ");	
	        		
//	        		I don't know how to make this an IgnoreCase Method...
		    		if (sc.hasNext("quit")) {
		    			System.out.println("Thanks for playing");
		      			break;
		        	}	
		       		
		       	    int guess = sc.nextInt();
		       		
		       		
		       		if ((guess > LIMIT) || (guess < 1)) {
		        		System.out.println("Not valid");
		       			System.out.println("Please pick a number within the range 1 - 10 \n");
		       			continue;
		       		}
		        	
		        		//TODO: print out a message to the user saying "Too high" or "Too low"
		        	
		       		if (guess < randomNum)  {
		       			System.out.println("\n You guessed " + guess);
		       			System.out.println("too low \n");
		       		} else if (guess > randomNum) {
	        			System.out.println("\n You guessed " + guess);
	        			System.out.println("too high \n");		        	
	        		} else {
		        	System.out.print("\n");
		       		System.out.println("You WON!!!");
		       		System.out.println("You guessed the number in " +
		  				count + " tries. \n");
		       	   break;
		       		} 	
	        		count++;
	        		
	        	} catch(InputMismatchException ime) {
	        		System.out.print("\n");
	       			System.out.println("You must enter a numerical digit.");
	       			System.out.println("Please try again. \n");
	       			sc = new Scanner(System.in);
	       		} catch(Exception e) {
	       			System.out.print("\n");
	        		System.out.println("Apologies, but an error has occured");
	        		System.out.println("Please try again. \n");
	       		}
	      		
        }
       	sc.close();
		System.out.println("Bye!");	
	}
}

