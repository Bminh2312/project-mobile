package com.example.product_sales_application.models;

import android.graphics.drawable.Drawable;

import java.io.Serializable;
import java.util.List;

public class Product implements Serializable {
    private String id;
    private String urlImg;
    private String productName;
    private String description;
    private String brand;
    private double productPrice;

    private int numProduct = 1;

    public Product(){
    }

    public Product(String urlImg, String productName, String description,String brand, double productPrice) {
        this.urlImg = urlImg;
        this.productName = productName;
        this.description = description;
        this.brand = brand;
        this.productPrice = productPrice;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getNumProduct() {
        return numProduct;
    }

    public void setNumProduct(int numProduct) {
        this.numProduct = numProduct;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrlImg() {
        return urlImg;
    }

    public void setUrlImg(String urlImg) {
        this.urlImg = urlImg;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

}
