package com.company.home;

public class Producer implements Runnable{

    Store store;

    Producer (Store store){
        this.store = store;
    }

    public void run(){
        for (int i = 0; i < Product.MAX_PRODUCTS; i++) {
            Product p = new Product();
            //System.out.println("New product number " + p.getProductId());
            store.put(p);
        }
    }
}
