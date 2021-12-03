public class Item {
    private String name;
    private double price;
    private int index;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // GETTERS
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getIndex() {
        return index;
    }

    // SETTERS
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}