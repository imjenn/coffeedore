import java.util.ArrayList;
public class Order {
    // MEMBER VARIABLES
    private String name;
    // private double total;
    private boolean ready;
    private ArrayList<Item> items;

    // CONSTRUCTOR
    public Order() {
        this.name = "Guest";
        this.items = new ArrayList<Item>();
    }

    // OVERLOADED CONSTRUCTOR
    public Order(String name) {
        this.name = name;
        this.items = new ArrayList<Item>();
    }

    // GETTERS
    public String getName(String name) {
        return this.name;
    }

    public boolean getReady() {
        return this.ready;
    }

    public ArrayList<Item> getItems() {
        return items;
    }
    

    // SETTERS
    public void setName(String name) {
        this.name = name;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    // ORDER METHODS
    public void addItem(Item item) {
        items.add(item);
    }

    public String getStatusMessage() {
        if(this.ready) {
            return "Your order is ready";
        }
        return "Thank you for waiting. Your order will be ready soon.";
    }

    public double getOrderTotal() {
        double total = 0.0;
        for(Item item : this.items) {
            total += item.getPrice();
        }
        return total;
    }

    public void display() {
        System.out.printf("Customer Name: %s", this.name + "\n");
        for(Item item : this.items) {
            System.out.println(item.getName() + " - " + item.getPrice());
        }
        System.out.println("Total: $" + this.getOrderTotal());
    }
  
}