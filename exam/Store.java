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

    // main method
    public static void main(final String[] args) {
        final Store lemonadeStand = new Store("Lemonade");
      lemonadeStand.advertise();
      lemonadeStand.advertise();
      lemonadeStand.advertise();
      
      
    }
  }