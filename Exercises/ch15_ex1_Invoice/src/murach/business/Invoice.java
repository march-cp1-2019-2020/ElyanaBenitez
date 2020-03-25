/**
 * 
 * Elyana Benitez
 * 03/25/2020
 * 
 */
package murach.business;

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAccessor;
import java.util.ArrayList;

public class Invoice {

	// the instance variables
    private ArrayList<LineItem> lineItems;
    private LocalDateTime invoiceDate;
	private LocalDateTime newDueDate;
    
    // the constructor
    public Invoice() {
        lineItems = new ArrayList<>();
        invoiceDate = LocalDateTime.now();
        newDueDate = LocalDateTime.now();
        }

    public void addItem(LineItem lineItem) {
        lineItems.add(lineItem);
    }

    public ArrayList<LineItem> getLineItems() {
        return lineItems;
    }

    public double getTotal() {
        double invoiceTotal = 0;
        for (LineItem lineItem : lineItems) {
            invoiceTotal += lineItem.getTotal();
        }
        return invoiceTotal;
    }

    public String getTotalFormatted() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(getTotal());
    }
    
    public void setInvoiceDate(LocalDateTime invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public LocalDateTime getInvoiceDate() {
        return invoiceDate;
    }

    public String getInvoiceDateFormatted() {
        DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(
                FormatStyle.MEDIUM);        
        return dtf.format(invoiceDate);
    }    
    
    public String getDueDate() {
    	LocalDateTime newDueDate = invoiceDate.plus(30, ChronoUnit.DAYS);
		return null;
    }
    
    public String getDueDateFormatted() {
    DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate( 
    		FormatStyle.MEDIUM);        
	return dtf.format(newDueDate);
    }
}