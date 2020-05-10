/**
 * Elyana Benitez
 * 04/16/2020
 */
package murach.io;

import java.util.*;
import java.io.*;
import java.nio.file.*;
import murach.business.Customer;

public class CustomerTextFile {
    private static final String FIELD_SEP = "\t";
    //TEACHER NOTES: need to initialize these 3 variables so that they are not null
    private static final Path customersPath = null;      // add code here
    private static final File customersFile = null;      // add code here
    private static ArrayList<Customer> customers = null; // add code here
    
    // prevent instantiation of the class
    private CustomerTextFile() {}

    public static List<Customer> getCustomers() {
        // if the customers file has already been read, don't read it again
        if (customers != null) {
            return customers;    
        }

        customers = new ArrayList<>();  
        
        // load the array list with Customer objects created from
        // the data in the file
        
        if (Files.exists(customersPath)) {
        	try (BufferedReader in = new BufferedReader( new FileReader(customersFile))) {
        		String line = in.readLine();
        		while (line != null) {
        			String[] columns = line.split(FIELD_SEP);
        			String code = columns[0];
        			String description = columns[1];
        			String price = columns[2];
        			
        			Customers c = new Customers();
        			c.setCode(code);
        			c.setDescription(description);
        			c.setPrice(Double.parseDouble(price));
        			customers.add(c);
        			
        			line = in.readLine();
        		}
        	} catch(IOException e) {
        		System.out.println(e);
        		return null;
        	}
        }
        

        return customers;            
    }

    public static Customer getCustomer(String email) {
        for (Customer c : customers) {
            if (c.getEmail().equals(email)) {
                return c;
            }
        }
        return null;
    }
    


    public static boolean addCustomer(Customer c) {
        customers.add(c);
        return saveCustomers();
    }

    public static boolean deleteCustomer(Customer c) {
        customers.remove(c);
        return saveCustomers();
    }

    public static boolean updateCustomer(Customer newCustomer) {
        // get the old customer and remove it
        Customer oldCustomer = getCustomer(newCustomer.getEmail());
        int i = customers.indexOf(oldCustomer);
        customers.remove(i);

        // add the updated customer
        customers.add(i, newCustomer);

        return saveCustomers();
    }

    private static boolean saveCustomers() {
    	try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(customersFile)))) {
    		for (Customer c : customers) {
    			out.print (c.getCode() + FIELD_SEP);
    			out.print(c.getDescription() + FIELD_SEP);
    			out.println(c.getPrice());
    		}
    	} catch(IOException e) {
    		System.out.println(e);
    		return false;
    	}
    	return true;
    }
}
