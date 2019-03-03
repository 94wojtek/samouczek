package shop;

import java.util.*;

public class Basket {
    private Map<Item, Integer> orderedItems;

    public Basket(Map<Item, Integer> orderedItems) {
        this.orderedItems = orderedItems;
    }

    public Map<Item, Integer> getOrderedItems() {
        return orderedItems;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Basket)) {
            return false;
        }
        Basket basket = (Basket) o;
        return Objects.equals(orderedItems, basket.orderedItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderedItems);
    }

    @Override
    public String toString() {
        return "Basket content: " + orderedItems.keySet() +
                "; Quantity: " + computeTotalQty() +
                "; Total price: " + computeTotalPrice();
    }

    //computes total price of items in the basket
    public double computeTotalPrice() {
        double totalPrice = 0;

        for(Map.Entry<Item, Integer> tmp : orderedItems.entrySet()) {
            totalPrice += tmp.getKey().getPrice() * tmp.getValue();
        }

        return totalPrice;
    }

    //computes total quantity of items in the basket
    public int computeTotalQty() {
        int totalQty = 0;

        for(Map.Entry<Item, Integer> tmp : orderedItems.entrySet()) {
            totalQty += tmp.getValue();
        }

        return totalQty;
    }

    //add selected items to basket
    public void addItem(Item item) {
        orderedItems.put(item, 1);
    }

    //add pessed quantity of items to basket
    public void addItem(Item item, int quantity) {
        if (item == null) {
            throw new NullPointerException("Choose item.");
        }

        if (quantity < 1) {
            throw new IllegalArgumentException("Select at least one item.");
        }

        if (orderedItems.containsKey(item)) {
            quantity = orderedItems.get(item) + quantity;
        }
        orderedItems.put(item, quantity);
    }

    //delete passed quantity of items from baskets
    public void delete(Item item, Integer quantity) {
        if (item == null) {
            throw new NullPointerException("Select item.");
        }

        if (quantity < 1) {
            throw new IllegalArgumentException("Select quantity.");
        }

        if (orderedItems.containsKey(item)) {
            quantity = orderedItems.get(item) - quantity;
        }
        orderedItems.put(item, quantity);
    }

    //delete selected item from basket
    public void delete(Item item) {
        orderedItems.remove(item);
    }

    //delete all items from basket
    public void deleteAll() {        
        orderedItems.clear();
    }
}
