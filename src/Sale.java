import java.util.ArrayList;
import java.util.List;
import java.util.Collections;



public class Sale {
   private  List<Product> products;
    private double totalPrice;

    public Sale() {
        this.products = new ArrayList<>();
        this.totalPrice = 0.0;
    }

    public void addProduct(Product p) {
        this.products.add(p);
    }

    public double calculateTotal() throws EmptySaleException {
        if (this.products.isEmpty()) {
            throw new EmptySaleException("To make a sale, first you have to add products.");
        }
        double currentTotal = 0;
        for (Product p : this.products) {
            currentTotal += p.getPrice();
        }
        this.totalPrice = currentTotal;
        return this.totalPrice;

    }

    public List<Product> getProducts() {
        return Collections.unmodifiableList(this.products);


    }
}
