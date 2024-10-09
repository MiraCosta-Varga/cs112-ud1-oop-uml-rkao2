import java.util.ArrayList;
import java.util.List;

public class GroceryPlanner { //concrete class

    private double balance;
    private List<Item> items;


    public GroceryPlanner(){ //default constructor
        this.balance = 291.0;
        this.items = new ArrayList<>();

    }

    public void addItem(String name, double price) {
        Item newItem = new Item(name, price);

        items.add(newItem);
        balance -= price;

    }
    
    public void printItem() {
        System.out.println("List of items:");
        for (Item item : items) {
            System.out.printf("- %s: $%.2f\n", item.getName(), item.getPrice());
        }
    }

    public double calculateRemainingBalance() {
        return balance;
    }



    public class Item { //inner class to represent the item
        private String name;
        private double price;

        public Item(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }




    }

    
}
