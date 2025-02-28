package com.example.app;

public class Counter {
    private int count;

    public void increment() {
        count++;
    }

    public void decrement() {
        count--;
    }

    public int getCount() {
        return count;
    }

    public void reset() {
        count = 0;
    }
}