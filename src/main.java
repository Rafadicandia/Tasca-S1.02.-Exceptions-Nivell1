public class main {

    public static void main(String[] args) {

        Sell selling1= new Sell();
/*
        try{
            selling1.totalSellingscount();
        } catch (EmptySellException e) {
            throw new RuntimeException(e);
        }
*/
        Sell selling2 = new Sell();

        selling2.addProduct(new Product("Pan", 1.2));
        selling2.addProduct(new Product("huevos", 2.4));
/*
        try{
            selling2.totalSellingscount();
        } catch (EmptySellException e) {
            throw new RuntimeException(e);
        }

        try{
            selling2.get(3);
        } catch (IndexOutOfBoundsException e) {
            throw new RuntimeException(e);
        }
*/

    }
}
