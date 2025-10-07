public class Main {

    public static void main(String[] args) {
        demo1();
        demo2();
        demo3();

    }

    private static void demo1() {
        Sale selling1 = new Sale();
        System.out.println("--Test for empty selling list--");
        try {
            selling1.calculateTotal();
        } catch (EmptySaleException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void demo2() {
        Sale selling2 = new Sale();
        System.out.println("--Test for no error on two element list--");

        selling2.addProduct(new Product("Bread", 1.2));
        selling2.addProduct(new Product("Eggs", 2.4));

        try {
            double total = selling2.calculateTotal();
            System.out.println("Total Sales: " + total + "€");
        } catch (EmptySaleException e) {
            System.out.println(e.getMessage());
        }

    }

    private static void demo3() {
        Sale selling3 = new Sale();
        System.out.println("--Test for error whe searching for an out of index element--");

        selling3.addProduct(new Product("Milk", 1.2));
        selling3.addProduct(new Product("Cookies", 2.4));

        try {
            selling3.get(3);
        } catch (IndexOutOfBoundsException e) {
            throw new RuntimeException(e);
            
        }


    }
}
