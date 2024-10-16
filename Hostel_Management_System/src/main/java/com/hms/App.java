package com.hms;


public class App {
    public static void main(String[] args) {
        System.out.println("==== Hostel Management System ====");
        MainOperation mainOperation = new MainOperation();
        mainOperation.onRun();  // Calls the main operation menu
    }
}

