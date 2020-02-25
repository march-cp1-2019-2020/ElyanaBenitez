/**
 * 
 * Elyana Benitez
*02/25/2020
*
*/

package murach.rectangle;

import java.text.NumberFormat;

public class Rectangle {
	
	    double length;
	    double width;
		
	    
	    
	public void main(String [] args) {
	}
	
	public double getLength() {
		return length;
	}
		
	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
	public String getArea() {
		
		double area = width * length;
		NumberFormat number = NumberFormat.getNumberInstance();
		String areaFormatted = number.format(area);
		return areaFormatted;		
	}
	
	public String getPerimeter() {
		double perimeter = 2 * width + 2 * length;
		NumberFormat number = NumberFormat.getNumberInstance();
		String perimeterFormatted = number.format(perimeter);
		return perimeterFormatted;
	}

}

/**
 * I had trouble with some of the steps outputting the right 
 * numbers, I also had trouble with steps 12-14, I did not 
 * understand them
 */
