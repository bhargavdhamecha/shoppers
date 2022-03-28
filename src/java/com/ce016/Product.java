/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ce016;

import java.util.HashMap;

/**
 *
 * @author abc
 */
public class Product {
    double price, stock;
    String productName, pDescription, pimage;

    
    public Product(double price, double stock, String productName,String pDescription,String pimage) {
        this.price = price;
        this.stock = stock;
        this.productName = productName;
        this.pDescription = pDescription;
        this.pimage = pimage;
    }

    
//    GETTER METHODS ------------------------------------------------------------

    public double getPrice() {
        return price;
    }

    public double getStock() {
        return stock;
    }

    public String getProductName() {
        return productName;
    }

    public String getPdisc() {
        return pDescription;
    }

    public String getPimage() {
        return pimage;
    }

//    SETTER METHODS ----------------------------------------------------------------

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPdisc(String pDescription) {
        this.pDescription = pDescription;
    }

    public void setPimage(String pimage) {
        this.pimage = pimage;
    }
    
//    CONSTRUCT PRODUCT ARRRAY WITH GETPRODUCTS METHOD----------------------------------
    public static HashMap<Integer,Product> getProducts(){
        HashMap <Integer,Product> mapProduct = new HashMap<>();
        mapProduct.put(0, new Product(200, 10, "T-shirt", "Cool T-shirt", "images/cloth_1.jpg"));
        mapProduct.put(1, new Product(300, 20, "Shirt", "Awesome shirt", "images/cloth_2.jpg"));
        mapProduct.put(2, new Product(400, 10, "Shoes", "perfect shoes", "images/shoe_1.jpg"));
        mapProduct.put(3, new Product(500, 10, "T-shirt", "Cool T-shirt", "images/cloth_3.jpg"));
        mapProduct.put(4, new Product(600, 20, "Shirt", "Awesome shirt", "images/cloth_2.jpg"));
        mapProduct.put(5, new Product(700, 10, "Shoes", "perfect shoes", "images/shoe_1.jpg"));
        mapProduct.put(6, new Product(700, 10, "T-shirt", "Cool T-shirt", "images/cloth_1.jpg"));
        mapProduct.put(7, new Product(900, 20, "Shirt", "Awesome shirt", "images/shoe_1.jpg"));
        mapProduct.put(8, new Product(1000, 10, "Shoes", "perfect shoes", "images/cloth_3.jpg"));
        return mapProduct;
    }    
}
