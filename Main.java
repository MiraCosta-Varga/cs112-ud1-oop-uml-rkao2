
public class Main { //driver

    public static void main(String[] args) {
        
        GroceryPlanner planner = new GroceryPlanner();
        planner.addItem(null, 0);
        planner.addItem("apple", 5.32);
        planner.addItem("bannana", 4.50);

        planner.printItem();

        System.out.printf("Remaining balance: $%.2f\n", planner.calculateRemainingBalance());
    }

    
}