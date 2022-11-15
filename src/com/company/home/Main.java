package com.company.home;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    static final int MAX_STORE = 5;

    public static void main(String[] args) {

        //Queue<Product> store = new PriorityQueue<>();
        Store store = new Store();

        for (int i=0; i<5; i++){
        new Thread(new Producer(store),"name="+i ).start();
        }

        Consumer consumer = new Consumer(store);

        new Thread(consumer).start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
