package com.example.exam;

public class Store {
    // instance fields
    String productType;
    
    // constructor method
    public Store(final String product) {
        productType = product;
    }

    // advertise method
    public void advertise() {
        System.out.println("Selling " + productType + "!");
        System.out.println("Come spend some money!");
    }
    public void greetCustomer(String customer){
    
        System.out.println("Welcome to the store, " + customer + "!");
        
      }
    // main method
    public static void main(final String[] args) {
        final Store lemonadeStand = new Store("Lemonade");
      lemonadeStand.advertise();
      lemonadeStand.advertise();
      lemonadeStand.advertise();
      
      lemonadeStand.advertise();
      lemonadeStand.advertise();
      lemonadeStand.advertise();
      lemonadeStand.greetCustomer("lulu");
    }
  }