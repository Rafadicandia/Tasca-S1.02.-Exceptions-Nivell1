public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        if (name==(null)){
            throw new IllegalArgumentException("The name of the product can't be null");
        }

        if (name.isBlank()){
            throw new IllegalArgumentException("The name of the product can't be empty");
        }

        if (price<0){
            throw new IllegalArgumentException("Price can't be negative");
        }
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

}
