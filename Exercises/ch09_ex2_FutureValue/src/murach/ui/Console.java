/**
 * 
 * Elyana Benitez
 * 04/07/2020
 * 
 */
package murach.ui;
       
import java.util.Scanner;
  
public class Console {

    private static Scanner sc = new Scanner(System.in);
    
    public static void displayLine() {
        System.out.println();
    }

    public static void displayLine(String s) {
        System.out.println(s);
        
    }

    public static String getString(String prompt) {
        System.out.print(prompt);
        String s = sc.nextLine();
        
        
        return s;
    }

    public static int getInt(String prompt) {
        int i = 0;
        while (true) {
            System.out.print(prompt);
            try {
                i = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Error! Invalid integer. Try again.");
            }
        }
        return i;
    }

    public static double getDouble(String prompt) {
        double d = 0;
        while (true) {
            System.out.print(prompt);
           
            try {
                d = Double.parseDouble(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
               System.out.println("Error! Invalid decimal. Try again.");
            	
//               I have no idea what i'm supposed to do.
                   // TEACHER NOTES: you are on the right track.  You need to look through the whole String to see if 
                   // the $ or % exists and then remove them.
            /**	
               if (s.startsWith("$")) {
            	   s = s.substring(1);
               } else if (s.endsWith("%")) {
            	   s = s.substring(0, 1);
               } else {
               }
            */   
               
            }  
            
       } 
         return d;
        
    }
}
