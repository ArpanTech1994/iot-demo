package algorithms;

import interfaces.PaymentStrategy;

public class CreditCardStrategy implements PaymentStrategy {
    private String name;
    private String cardNo;
    private int cvv;
    private String expiryDate;

    public CreditCardStrategy(String n,String cnn,int cvv,String dateOfExpiry){
        this.name = n;
        this.cardNo = cnn;
        this.cvv = cvv;
        this.expiryDate = dateOfExpiry;
    }
    @Override
    public void payment(int amount) {
        System.out.println("Payment of amount :" + amount + "through Credit Card Successful");
    }
}
