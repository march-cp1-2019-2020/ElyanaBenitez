package murach.ui;

/**
 * Elyana Benitez
 * 04/20/2020
 */
import java.io.IOException;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import murach.business.Product;
import murach.io.ProductIO;

@SuppressWarnings("serial")
public class ProductTableModel extends AbstractTableModel {
    private List<Product> products;
    private final String[] COLUMN_NAMES = { "Code", "Description", "Price" };
 
    public ProductTableModel() {
        products = ProductIO.getProducts();
        
        System.out.println(products.size());
        
        if(products == null) {
        	System.out.println(new IOException("IOException: Cannot retrieve Product data."));
        }
    }
    
    @Override
    public int getRowCount() {
        return products.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMN_NAMES.length;
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        return COLUMN_NAMES[columnIndex];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return products.get(rowIndex).getCode();
            case 1:
                return products.get(rowIndex).getDescription();
            case 2:
                return products.get(rowIndex).getPriceFormatted();
            default:
                return null;
        }
    }   
    
    Product getProduct(int rowIndex) {
        return products.get(rowIndex);
    }
    
    void fileUpdated() {
        products = ProductIO.getProducts();
        fireTableDataChanged();
    }    
}