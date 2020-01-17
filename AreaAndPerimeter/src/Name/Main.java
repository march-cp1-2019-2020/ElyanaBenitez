/**
 * 
 * Elyana Benitez
 * 01/16/2020
 * 
 * 
 */

package Name;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
	        //  welcome message
		    System.out.println("Welcome to the Area and Perimeter Calculator");
	        System.out.println();
	        
	        Scanner sc = new Scanner(System.in);
	        String choice = "y";
	        while (choice.equalsIgnoreCase("y")) {
	            System.out.print("Enter length: ");
	            double length = Integer.parseInt(sc.nextLine());

	            System.out.print("Enter width:  ");
	            double width = Integer.parseInt(sc.nextLine());
	            
	            double area = width * length;
	            double perimeter = 2 * width + 2 * length;
	            
	            NumberFormat number = NumberFormat.getNumberInstance(); 
	            String areaFormatted = number.format(area);
	            String perimeterFormatted = number.format(perimeter);
	            
	            String message = 
	            		"Area:        " + areaFormatted + "\n"
	            	+   "Perimeter    " + perimeterFormatted + "\n";
	            System.out.println(message);
	            
	            System.out.print("Continue? (y/n): ");
	            choice = sc.nextLine();
	            System.out.println();
	          } 
	        sc.close();
	        // exit message
	        System.out.println("Bye!");
	}
}
