/**
 * 
 * 01/09/2020
 * Elyana Benitez
 * 
 */
package murach.test;

public class CodeTesterApp {

    public static void main(String args[]) {
        // display a welcome message
        System.out.println("Welcome to the Code Tester");
        System.out.println();

        // calculate and display a total
        String productCode = "java";
        double price = 49.50;
        int quantity = 2;
        double total = price * quantity;
        String message = 
            "Code:     " + productCode + "\n" +
            "Price:    " + price + "\n" +
            "Quantity: " + quantity + "\n" +
            "Total:    " + total + "\n";
        System.out.println(message);

        // display your name       
        // TODO: add code here
        
        String firstname = "Elyana";
        String lastname = "Benitez";
        String message1 =
        	"Name:     " + lastname + ", " + firstname + "\n";
        System.out.println(message1);
        
        // calculate and display an average        
        // TODO: add code here
        
        double average = total/quantity;
        String message2 =
        	"Sum:      " + total + "\n" +
            "Count     " + quantity + "\n" +
        	"Average:  " + average + "\n";
        System.out.println(message2);
        
        // display a goodbye message
        System.out.println("Bye!"); 
    }
}
