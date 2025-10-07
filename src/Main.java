public class Main {

    public static void main(String[] args) {
        demo1();
        demo2();
        demo3();

    }

    private static void demo1() {
        Sale saleNoProducts = new Sale();
        System.out.println("--Test for empty selling list--");
        try {
            saleNoProducts.calculateTotal();
        } catch (EmptySaleException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void demo2() {
        Sale saleTwoProducts = new Sale();
        System.out.println("--Test for no error on two element list--");

        saleTwoProducts.addProduct(new Product("Bread", 1.2));
        saleTwoProducts.addProduct(new Product("Eggs", 2.4));

        try {
            double total = saleTwoProducts.calculateTotal();
            System.out.println("Total Sales: " + total + "€");
        } catch (EmptySaleException e) {
            System.out.println(e.getMessage());
        }

    }

    private static void demo3() {
        Sale saleForTestOutOfBound = new Sale();
        System.out.println("--Test for error when searching for an out of index element--");

        saleForTestOutOfBound.addProduct(new Product("Milk", 1.2));
        saleForTestOutOfBound.addProduct(new Product("Cookies", 2.4));

        try {
            saleForTestOutOfBound.getProducts().get(3);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());

            
        }


    }
}
