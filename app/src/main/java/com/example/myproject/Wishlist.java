package com.example.myproject;
import java.util.ArrayList;
import java.util.List;
public class Wishlist {

    private List<Product> productsInWishlist;
    private final String userId;

    public Wishlist(String user_id) {
        this.userId = user_id;
        this.productsInWishlist = new ArrayList<>();
    }

    public String getUserId(){
        return userId;
    }

    public void  addProductInWishlist(Product product){
        productsInWishlist.add(product);
    }

    public void removeProductWishlist(Product product){
        productsInWishlist.remove(product);
    }

    public List<Product> getProductsInWishlist(){
        return productsInWishlist;
    }




}
