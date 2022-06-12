package FifnySklad.service.cart;

import FifnySklad.model.Product;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    private static Cart INSTANCE;

    public static Cart getInstance(){
        if(INSTANCE == null){
            INSTANCE = new Cart();
        }
        return INSTANCE;
    }

    private Map<String,CartEntry> entries;

    public Cart(){
        this.entries = new HashMap<>();
    }

//    public void addProduct(String productName){
//        CartEntry productEntry = entries.get(productName.toUpperCase());
//        if(productEntry!=null){
//            productEntry.increaseQuantity();
//        }else{
//            Product product = Product.valueOf(productName);
//            entries.put(productName.toUpperCase(),entry);
//        }
//    }
//
    public void removeProduct(String productName){
        CartEntry productEntry = entries.get(productName.toUpperCase());
        if(productEntry!=null){
            productEntry.decreaseQuantity();
        }
    }

    public int getQuantity(String productName){
        CartEntry entry = entries.get(productName.toUpperCase());
        if(entry!=null){
            return entry.getQuantity();
        }
        return  0;
    }

    public double calculateTotal(){
        double total = 0;
        for(CartEntry entry:entries.values()){
            double entryCost = entry.getProduct().getPrice()*entry.getQuantity();
            total = total + entryCost;
        }
        return total;
    }
}
