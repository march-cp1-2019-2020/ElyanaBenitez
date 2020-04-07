/**
 * 
 * Elyana Benitez
 *04/07/2020
 * 
 */
//			I couldn't figure out how to make 3 names.
package murach.name;

import java.util.Scanner;

public class NameParserApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a name: ");
        String name = sc.nextLine();
        System.out.println();
        sc.close();
        
                
        int index = name.indexOf(" ");
        String firstName = name.substring(0, index);
        String lastName = name.substring(index + 1);
        
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        
        
//        I did it two ways, this second way was more complicated.
        /**
        int index1 = name.lastIndexOf(" ");
        int index2 = name.length();
        
//        System.out.println(index1);
//        System.out.println(index2);
        
        int count = 0;
        System.out.print("First Name:");
        
        while (count <= index1) {
        	
	        char char1 = name.charAt(count);
	        System.out.print(char1);
	        count++;
        }
        
        System.out.print("\nLast Name:");
        
        while (count < index2) {
        	char char2 = name.charAt(count);
        	System.out.print(char2);
        	count++;
        }**/
        
    } 
}

