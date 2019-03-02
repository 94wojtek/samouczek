package shop.shop_tests;

import org.junit.Before;
import org.junit.Test;
import shop.Basket;
import shop.Item;

import java.util.HashMap;

import static org.junit.Assert.*;

public class BasketDeleteTest {
    private Basket basketTest;
    private Item bike = null;
    private Item bike2 = new Item("bike", 100);

    @Before
    public void setUp() {
        HashMap<Item, Integer> tmp = new HashMap<>();
        tmp.put(bike2, 8);

        basketTest = new Basket(tmp);
    }

    @Test
    public void checkIfMethodDeleteItems() {
        basketTest.delete(bike2, 8);

    }

    //check if method throws exception if Item is null
    @Test
    public void deleteNullItems() {
        try {
            basketTest.delete(bike, 2);
            fail("Exception was not thrown.");
        }
        catch (NullPointerException e) {
            assertEquals("Select item.", e.getMessage());
        }
    }

    //check if method throws exception if qty is < 1
    @Test
    public void deleteLessThanOneItems() {
        try {
            basketTest.delete(bike2, 0);
            fail("Exception was not thrown.");
        }
        catch (IllegalArgumentException e) {
            assertEquals("Select quantity.", e.getMessage());
        }
    }

    //check if method clears basket content
    @Test
    public void checkIfClearsBasket() {
        basketTest.deleteAll();
        assertFalse(basketTest.getOrderedItems().containsKey(bike2));
    }

    ////using deleteAll() method and checking if after deletion key to mapping exists
    @Test
    public void checkIfClearsBasket2() {
        basketTest.deleteAll();
        assertFalse(basketTest.getOrderedItems().containsValue(8)); //why not return true if 0 passed to containValue()?
    }

    //using deleteAll() method and checking if after deletion mapping to key still exists
    @Test
    public void checkIfQtyIsZeroAfterClear() {
        basketTest.deleteAll();
        assertFalse(basketTest.getOrderedItems().containsKey(bike2));
    }

    @Test
    public void checkIfCountRightQty() {
        assertEquals(8, basketTest.computeTotalQty());
    }

    @Test
    public void checkIfCountRightPrice() {
        assertEquals(800, basketTest.computeTotalPrice(), 0.001);
    }
}