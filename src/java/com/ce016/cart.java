/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ce016;


/**
 *
 * @author abc
 */
public class cart {
    double price, stock, count;
    String productName, pDescription, pimage;
    
     public cart(double price, double stock, String productName,String pDescription,String pimage) {
        this.price = price;
        this.stock = stock;
        this.productName = productName;
        this.pDescription = pDescription;
        this.pimage = pimage;
    }

    //----------------------------- Getter methods------------------------
    public double getPrice() {
        return price;
    }

    public double getStock() {
        return stock;
    }

    public String getProductName() {
        return productName;
    }

    public String getpDescription() {
        return pDescription;
    }

    public String getPimage() {
        return pimage;
    }

    public double getCount() {
        return count;
    }
    
    
    
    
    
    //-------------------------------------- SETTER Methods ---------------------------------------

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setpDescription(String pDescription) {
        this.pDescription = pDescription;
    }

    public void setPimage(String pimage) {
        this.pimage = pimage;
    }

    public void setCount(double count) {
        this.count = count;
    }
    
    
    
}
