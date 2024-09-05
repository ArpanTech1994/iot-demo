package model;

import interfaces.PaymentStrategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> itemList;

    public ShoppingCart(){
        this.itemList = new ArrayList<>();
    }

    public void addItem(Item item){
        this.itemList.add(item);
    }
    public void removeItem(Item item){
        this.itemList.remove(item);
    }
    public int totalCost(){
        int sum = 0;
        for(Item item:itemList){
            sum += item.getPrice();
        }
        return sum;
    }
    public void makePayment(PaymentStrategy paymentStrategy){
        int amount = totalCost();
        paymentStrategy.payment(amount);
    }
}
