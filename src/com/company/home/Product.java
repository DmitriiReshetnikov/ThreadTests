package com.company.home;

public class Product {
    static final int MAX_PRODUCTS = 1000;

    static private int nextId = 0;
    private final int productId;

    public Product() {
        this.productId = ++nextId;
    }

    public int getProductId() {
        return productId;
    }
}
