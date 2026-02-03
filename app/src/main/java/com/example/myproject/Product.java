package com.example.myproject;

public class Product {
    private double price ;
    private int imgLocation;

    private final long SKU;
    private final String description;

    public Product(double price, int imgLocation , long Sku,String description){
        this.price = price;
        this.imgLocation = imgLocation;
        this.SKU = Sku;
        this.description = description;
    }

    public long getSKU()  {
        return this.SKU;
    }

    public double getPrice() {
        return this.price;
    }

    public int getImgLocation()  {
        return this.imgLocation;
    }

    public  String getDescription() {
        return  this.description;
    }




}
