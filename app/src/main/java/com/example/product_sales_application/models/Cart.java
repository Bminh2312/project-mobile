package com.example.product_sales_application.models;

import com.example.product_sales_application.models.Product;

import java.io.Serializable;
import java.util.ArrayList;

public class Cart implements Serializable {
    private ArrayList<Product> products;

    public Cart(ArrayList<Product> productList) {
       this.products = productList;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public boolean removeProduct(Product product) {
        if(product != null){
        products.remove(product);
        return  true;

        } else
            return false;
    }

    public int subtractProductQuantity(int index){
        Product product = products.get(index);
        int newQuantity = product.getNumProduct() - 1;
        if(newQuantity >  0){
            product.setNumProduct(newQuantity);
            return  newQuantity;
        } else {
            return -1;
        }
    }
    public int addProductQuantity(int index){
        Product product = products.get(index);
        int newQuantity = product.getNumProduct() + 1;
        if(newQuantity >  0){
            product.setNumProduct(newQuantity);
            return  newQuantity;
        } else {
            return -1;
        }
    }

    public double getTotalPrice() {
        double total = 0.0;
        for (Product p : products) {
            total += p.getPrice() * p.getQuantity();
        }
        return total;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void clearCart() {
        products.clear();
    }
}
