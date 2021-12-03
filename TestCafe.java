import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestCafe {
    public static void main(String[] args) {
        CoffeeKiosk coffeeKiosk = new CoffeeKiosk();

        coffeeKiosk.addMenuItem("Latte", 3.5);
        coffeeKiosk.addMenuItem("Capuccino", 4.5);
        coffeeKiosk.addMenuItem("Drip Coffee", 1.5);
        coffeeKiosk.addMenuItem("Mocha", 3.5);
        coffeeKiosk.newOrder();
    }
}
