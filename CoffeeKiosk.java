import java.util.ArrayList;

public class CoffeeKiosk {
    // MEMBER VARS
    private ArrayList<Item> menu = new ArrayList<Item>();
    private ArrayList<Order> orders = new ArrayList<Order>();

    public CoffeeKiosk() {
        
    }

    public void addMenuItem(String name, double price) {
        // Create a new menu item obj
        Item newItem = new Item(name, price);
        // Add the obj to menu
        menu.add(newItem);
        // Assign an variable to access the index to the newly added item on the menu
        int index = menu.indexOf(newItem);
        // Set the index 
        newItem.setIndex(index);
    }

    public void displayMenu() {
        for(int i = 0; i < menu.size(); i++) {
            Item item = menu.get(i);
            System.out.println(item.getIndex() + " " + item.getName() + " -- $" + item.getPrice());
            System.out.println("--------------");
        }
    }

    public void newOrder() {
        // Shows the user a message prompt and then sets their input to a variable, name
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();

        // Create a new order with the given input string
        // Show the user the menu, so they can choose items to add.
        Order order = new Order(name);
        displayMenu();
        
        // Prompts the user to enter an item number
        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();
        
        // Write a while loop to collect all user's order items
        while(!itemNumber.equals("q")) {
            // Get the item object from the menu, and add the item to the order
            // Parse int because itemNumber is a string
            int index = Integer.parseInt(itemNumber);
            Item item = menu.get(index);
            System.out.println(item.getName());
            order.addItem(item);
            
            // Ask them to enter a new item index or q again, and take their input
            System.out.println("Please enter a menu item index or q to quit:");
            itemNumber = System.console().readLine();
        }
        // After you have collected their order, print the order details 
        // as the example below. You may use the order's display method.
        order.display();
        order.getOrderTotal();
    }

}