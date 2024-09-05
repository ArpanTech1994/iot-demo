import algorithms.CreditCardStrategy;
import algorithms.PaytmStrategy;
import model.Item;
import model.ShoppingCart;

public class ShoppingCartAppTest {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        Item item1 = new Item("Samsung M700",35000);
        Item item2 = new Item("Washing Machine",25000);
        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);
        //Payment through Credit Card
        shoppingCart.makePayment(new CreditCardStrategy("Arpan Chakraborty","1234567890",1234,"30/09/2024"));
        //Payment through Paytm
        shoppingCart.makePayment((new PaytmStrategy("arpan1234@gmail.com","12345678")));
    }
}