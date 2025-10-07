import java.util.ArrayList;
import java.util.List;


public class Sale {
   private  List<Product> products;
    private double totalSellings;

    public Sale() {
        this.products = new ArrayList<>();
        this.totalSellings = 0.0;
    }

    public void addProduct(Product p) {
        this.products.add(p);
    }

    public double calculateTotal() throws EmptySaleException {
        if (this.products.isEmpty()) {
            throw new EmptySaleException("To make a sale, first you have to add products.");
        }
        this.totalSellings = 0;

        for (Product p : this.products) {
            totalSellings += p.price;
        }
        return totalSellings;

    }

    public Product get(int i) {
        return products.get(i);
    }
}
