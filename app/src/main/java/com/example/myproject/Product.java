package com.example.myproject;

public abstract class Product {
    protected double price ;
    protected int imgLocation;

    protected final long SKU;

    public Product(double price, int imgLocation , long Sku){
        this.price = price;
        this.imgLocation = imgLocation;
        this.SKU = Sku;
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






}
