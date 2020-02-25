/**
 * 
 * Elyana Benitez
 * 01/16/2020
 * 02/25/2020
 * 
 */

package Name;


import murach.rectangle.Rectangle;
import java.text.NumberFormat;
import java.util.Scanner;


public class Main {

	public static void main(String args[]) {
		// welcome message
		System.out.println("Welcome to the Area and Perimeter Calculator");
		System.out.println();

		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		Rectangle r = new Rectangle();
		r.getLength();
		r.getWidth();
		
		while (choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("yes")) {
			System.out.print("Enter length: ");
			String length = sc.nextLine();
			Double dlength = Double.parseDouble(length.trim());
			// My code:
			// double length = Integer.parseInt(sc.nextLine());

			System.out.print("Enter width:  ");
//			String width = sc.nextLine();
			Double dwidth = Double.parseDouble(sc.nextLine());
			// My code:
			// double width = Integer.parseInt(sc.nextLine());

			double area = dwidth * dlength;
			double perimeter = 2 * dwidth + 2 * dlength;
  
			NumberFormat number = NumberFormat.getNumberInstance();
			String areaFormatted = number.format(area);
			String perimeterFormatted = number.format(perimeter);
			
			/** String message = 
					"Area:        " + r.getArea() + "\n" 
				  + "Perimeter    " + r.getPerimeter() + "\n";
			System.out.println(message);
			
//			I tried to do this, but everytime no matter what numbes i put in, the output was
// 			Area:       0
//			Perimeter:  0
*/
			String message = 
					"Area:        " + areaFormatted + "\n" 
				  + "Perimeter    " + perimeterFormatted + "\n";
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


/**
 * I did not understand steps 12-14 on page 130
 */
