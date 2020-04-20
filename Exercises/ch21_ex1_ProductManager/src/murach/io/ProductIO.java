/**
 * Elyana Benitez
 * 04/20/2020
 */
package murach.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import murach.business.Product;

public class ProductIO {
	private static final String FIELD_SEP = "\t";
	private static final Path productsPath = Paths.get("products.txt"); // add code here
	private static final File productsFile = productsPath.toFile(); // add code here
	private static List<Product> products = getProducts(); // add code here

	// prevent instantiation of the class
	private ProductIO() {
	}

	public static List<Product> getProducts() {
		// if the products file has already been read, don't read it again
		if (products != null)
			return products;

		products = new ArrayList<>();

		// load the array list with Product objects created from
		// the data in the file
		if (Files.exists(productsPath)) {

			try (BufferedReader in = new BufferedReader(new FileReader(productsFile))) {

				// read all products stored in the file
				// into the array list
				String line;
				while ((line = in.readLine()) != null) {
					String[] columns = line.split(FIELD_SEP);
	                String code = columns[0];
	                String description = columns[1];
	                String price = columns[2];

	                Product p = new Product();
	                p.setCode(code);
	                p.setDescription(description);
	                p.setPrice(Double.parseDouble(price));
	                products.add(p);

				}
				
				in.close();
				
			} catch (NumberFormatException nfe) {
				System.out.println(nfe);
				return null;
			} catch (IOException ioe) {
				System.out.println(ioe);
				return null;
			}

		}
		return products;
	}

    public static Product get(String code) throws IOException {
        products = getProducts();
        for (Product p : products) {
            if (p.getCode().equals(code))
                return p;
        }
        return null;
    }

    private static boolean saveAll() throws IOException {
        products = getProducts();
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(productsFile)));
        System.out.println("Saving " + products.size() + " products.");
        
        // write all products in the array list to the file
        for (Product p : products) {
            out.print(p.getCode() + FIELD_SEP);
            out.print(p.getDescription() + FIELD_SEP);
            out.println(p.getPrice());
        }
        out.close();
        return true;
    }

    public static boolean add(Product p) throws IOException {
        products = getProducts();
        products.add(p);
        return saveAll();
    }

    public static boolean delete(Product p) throws IOException {
        products = getProducts();
        System.out.println("Removing product " + p);
        products.remove(p);
        return saveAll();
    }

    public static boolean update(Product newProduct) throws IOException {
        products = getProducts();
        
        // get the old product and remove it
        Product oldProduct = get(newProduct.getCode());
        int i = products.indexOf(oldProduct);
        products.remove(i);

        // add the updated product
        products.add(i, newProduct);

        return saveAll();
    }
}