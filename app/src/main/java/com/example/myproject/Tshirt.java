package com.example.myproject;

import java.util.List;

public class Tshirt extends  Product{

    private List<Character> sizes ;
    private String type ;
    public Tshirt (String type, List<Character> sizes , int quantity, String details) {
        super();
        super.name = "Tshirt";
        super.details = details;
        super.quantity = quantity;
        this.sizes = sizes;
        this.type = type;
    }


    public String get_type()  {
        return type ;
    }

    public List<Character> get_sizes(){
        return sizes;
    }



}
