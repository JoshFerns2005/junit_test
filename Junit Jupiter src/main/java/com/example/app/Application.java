package com.example.app;

public class Application {

    private String status;

    public void start() {
        status = "Running";
        System.out.println("Application started.");
    }

    public void stop() {
        status = "Stopped";
        System.out.println("Application stopped.");
    }

    public String getStatus() {
        return status;
    }
}
