package com.company.home;

public class Consumer implements Runnable {
    Store store;

    Consumer(Store store) {
        this.store = store;
    }

    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            store.get();
        }

    }
}
