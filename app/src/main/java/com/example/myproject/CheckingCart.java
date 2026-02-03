package com.example.myproject;
import java.util.ArrayList;
import  java.util.List;
public class CheckingCart {
    private final String userId;
    private List<Product> productsInCart;
    private final int cartId;
    public CheckingCart(int cart_id, String user_id) {
        this.userId = user_id;
        this.cartId = cart_id;
        productsInCart = new ArrayList<>();
    }
    public String getUserId() {
        return userId;
    }
    public int getCartId(){
        return cartId;
    }
    public void addProductCheckingCart(Product product) {
        productsInCart.add(product);
    }

    public void removeProductCheckingCart(Product product) {
        productsInCart.remove(product);
    }

    public List<Product> getProductsInCart() {
        return productsInCart;
    }

}
