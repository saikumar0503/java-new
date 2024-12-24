package com.iaspvt.project_s;

public class App {

    // Method to be tested
    public boolean isTrue() {
        return true;
    }

    // Main method to run the application
    public static void main(String[] args) {
        App app = new App();
        System.out.println("Is true: " + app.isTrue());
    }
}
