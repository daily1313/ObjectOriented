package ch5.coffee;

import ch5.menu.MenuItem;

public class Americano implements Coffee {

    private final String name;
    private final int price;
    private final int quantity;

    public Americano(final MenuItem menuItem, final int quantity) {
        this.name = menuItem.getName();
        this.price = menuItem.getPrice();
        this.quantity = quantity;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }
}
