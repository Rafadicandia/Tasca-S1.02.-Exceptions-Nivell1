
import java.util.ArrayList;
import java.util.List;


public class Sell {
    List<Product> products;
    double totalSellings;

    public Sell(){
        this.products=new ArrayList<>();
        this.totalSellings=0.0;
    }

    public void addProduct(Product p) {
        this.products.add(p);
    }

    public double totalSellingscount() throws EmptySellException{
            if (this.products.isEmpty()){
                throw new EmptySellException("Per fer una venda primer has d’afegir productes");
            }
            this.totalSellings=0;

            for (Product p : this.products){
                totalSellings+= p.price;
        }
        System.out.println("Ventas totales: " + this.totalSellings + "€");
        return totalSellings;

    }

    public Product get(int i) {
        return products.get(i);
    }
}
