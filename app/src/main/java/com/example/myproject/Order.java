package com.example.myproject;
import  java.util.List;

public class Order {

    private final String orderId;
    private final List<Product> productsOrdered;
    private final String userId;
    public Order(String order_id, List<Product> productsOrdered, String user_id){
        this.orderId = order_id;
        this.productsOrdered = productsOrdered;
        this.userId = user_id;
    }


    public String getUseId(){
        return userId;
    }

    public List<Product> getProductsOrdered() {
        return productsOrdered;
    }

    public String getOrderId(){
        return orderId;
    }


}
