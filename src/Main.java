public class Main {

    public static void main(String[] args) {
//        demo1();
//       demo2();
//       demo3();

    }

    private static void demo1() {
        Sell selling1= new Sell();
        System.out.println("--Test for empty selling list--");
        try{
            selling1.totalSellingscount();
        } catch (EmptySellException e) {
            throw new RuntimeException(e);
        }
    }

    private static void demo2() {
        Sell selling2 = new Sell();
        System.out.println("--Test for no error on two element list--");

        selling2.addProduct(new Product("Pan", 1.2));
        selling2.addProduct(new Product("huevos", 2.4));

        try{
            selling2.totalSellingscount();
        } catch (EmptySellException e) {
            throw new RuntimeException(e);
        }

    }

    private static void demo3() {
        Sell selling2 = new Sell();
        System.out.println("--Test for error whe searching for an out of index element--");

        selling2.addProduct(new Product("Pan", 1.2));
        selling2.addProduct(new Product("huevos", 2.4));

        try{
            selling2.get(3);
        } catch (IndexOutOfBoundsException e) {
            throw new RuntimeException(e);
        }


    }
}
