package com.company.home;

import java.util.ArrayDeque;
import java.util.Deque;

public class Store {

    private static final int MAX_STORE = 5;

    Deque<Product> store = new ArrayDeque<>();

    public synchronized void get(){
        while (store.size() < 1) {
            try {
                wait();
            }
            catch (InterruptedException ex){
                //System.out.println(ex.getMessage());
            }
        }
        store.poll();
        System.out.println(Thread.currentThread().getName()+" Покупатель купил 1 товар. Товаров на складе " + store.size());
        notifyAll();
    }
    public synchronized void put(Product product){
        while (store.size() >= MAX_STORE){
            try {
                wait();
            }
            catch (InterruptedException ex) {
                //System.out.println(ex.getMessage());
            }
        }
        store.offer(product);
        System.out.println(Thread.currentThread().getName()+" Производитель добавил 1 товар. Товаров на складе " + store.size());
        notifyAll();
    }
}
