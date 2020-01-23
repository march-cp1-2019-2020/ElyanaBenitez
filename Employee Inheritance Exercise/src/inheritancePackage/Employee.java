/** 
 * 
 * Elyana Benitez
 * 01-24-2020
 * 
 */
package inheritancePackage;

public class Employee {

	public static void main(String[] args) {
		
//  TODO: name
		String name = new String();
		//System.out.println(name);
//	TODO: ssn
		/**
		 * I don't know what ssn is.
		 */
//	TODO: dateOfBirth
		String dateOfBirth = new String();
		//dateOfBirth = "01/24/2020";
	}
//  TODO: paySalary()
		double num = 0;
		double Salary;
		double bonus = num + 100;
		double punishment = num - 50;
		public void paySalary() {	
		    if(num > 0) {
			 	Salary = num;
		    } else {
		    	num = 0;
		    } 
	}

//	TODO: takeVacation()
		  public void takeVacation() {
			  int freeDays = 12;
			  if (freeDays >= 7) {
				  System.out.println("You may take a Vacation.");
				  System.out.println("Have a good time!");
			  } else if(freeDays > 7) {
				  System.out.println("No vacation for you!");
				  System.out.println("BACK TO WORK!!!");
			  }
		  }
		    	
}
