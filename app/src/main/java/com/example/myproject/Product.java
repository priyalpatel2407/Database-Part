package com.example.myproject;

import java.util.List;

public class Product {

    protected String name ;
    protected String details;
    protected double price ;
    protected int quantity;


    public Product(String name , String details, double price , int quantity){
        this.name = name;
        this.details = details;
        this.price  = price ;
        this.quantity = quantity;

    }

    public Product()  {
        this.name = "null";
        this.details = "no Details Available";
        this.price = 0 ;
        this.quantity = 0 ;
    }


    public  String get_name() {
        return name;
    }

    public String get_Details() {
        return details;
    }


    public double get_price()  {
        return  price ;
    }


    public int get_quantity() {
        return quantity;
    }


    public void set_name(String name) {
        this.name = name;
    }


    public void set_Details(String details) {
        this.details = details;
    }


}
