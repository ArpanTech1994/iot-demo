package algorithms;

import interfaces.PaymentStrategy;

public class PaytmStrategy implements PaymentStrategy {

    private String emailId;
    private String passwd;

    public PaytmStrategy(String emailId, String passwd){
        this.emailId = emailId;
        this.passwd = passwd;
    }
    @Override
    public void payment(int amount) {
        System.out.println("Payment of amount " + amount + "successful through Paytm");
    }
}
