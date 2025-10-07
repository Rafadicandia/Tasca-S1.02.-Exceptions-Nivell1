import java.util.ArrayList;
import java.util.List;


public class Sale {
    List<Product> products;
    double totalSellings;

    public Sale() {
        this.products = new ArrayList<>();
        this.totalSellings = 0.0;
    }

    public void addProduct(Product p) {
        this.products.add(p);
    }

    public double totalSellingsCount() throws EmptySellException {
        if (this.products.isEmpty()) {
            throw new EmptySellException("To make a sale, first you have to add products.");
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
