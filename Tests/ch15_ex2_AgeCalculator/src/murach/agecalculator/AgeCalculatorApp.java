/**
 * 
 * Elyana Benitez
 * 03/25/2020
 * 
 */
package murach.agecalculator;
 
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAmount;
import java.util.Scanner;

public class AgeCalculatorApp { 

    public static void main(String[] args) {
        System.out.println("Welcome to the Age Calculator\n");

        // Get input from the the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your date of birth (YYYY-MM-DD): ");
        String dateOfBirthString = sc.nextLine();
        System.out.println();
        
        LocalDate dateOfBirth = LocalDate.parse(dateOfBirthString);
        
        //format dateOfBirth
        DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(
        		FormatStyle.MEDIUM);
        String dateOfBirthFormatted = dtf.format(dateOfBirth);
        
        //get and format currentDate
        
        LocalDate currentDate = LocalDate.of(2020, 03, 25);
        
        String currentDateFormatted = dtf.format(currentDate);
        
        
        // Get and print user's date of birth
        System.out.println("Your date of birth is " + dateOfBirthFormatted);
        

        // Get and print the current date
        System.out.println("The current date is " + currentDateFormatted);

        //Calculate the user's age
        
        int yearCurrentDate = currentDate.getYear();
        int yearDateOfBirth = dateOfBirth.getYear();
        
       // LocalDate usersAge =  currentDate.minus(dateOfBirth); Did not work
       // Used this instead >>>
        int usersAge = yearCurrentDate - yearDateOfBirth;
                
        //Print the user's age
        System.out.println("Your age is " + usersAge);
        sc.close();
    }
}
