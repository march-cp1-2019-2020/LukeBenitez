package murach.business;										//Luke Benitez

import java.text.NumberFormat;

public class LineItem {

    private Product product;
    private int quantity; //defining instance variables

    public LineItem() {
        this.product = null;
        this.quantity = 0;
    }

    public LineItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public void setProduct(Product product) {  //second constructor
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public void setQuantity(int quantity) { //Other second constructor
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotal() { 
        double total = quantity * product.getPrice(); //goes to Product code and gets the price.
        return total;
    }
    
    public String getTotalFormatted() {
        double total = this.getTotal();
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String totalFormatted = currency.format(total);  
        return totalFormatted;
    }
}