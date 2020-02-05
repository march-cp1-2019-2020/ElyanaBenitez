/**
 * 
 * Elyana Benitez
 * 02/07/2020
 * 
 */
package package08;

public class Student extends Person {
	/**
	 * Private
	 */
//	TODO: Classification= Freshman; Sophomore; junior; senior.
	private String classification;
	private int grade;
	
	public void main(String [] args) {
		if (grade < 9) {
			classification = "Pre-K - MiddleSchoool";
		} else if (grade == 9) {
			classification = "Freshman";
		} else if (grade == 10) {
			classification = "Sophmore";
		} else if (grade == 11) {
			classification = "Junior";
		} else if (grade == 12) {
			classification = "Senior";
		} else if (grade < 12) {
			classification = "College";
		} System.out.println(classification);
	} 
}
