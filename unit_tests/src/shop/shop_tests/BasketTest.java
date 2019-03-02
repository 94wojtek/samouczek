package shop.shop_tests;

import org.junit.Before;
import org.junit.Test;
import shop.Basket;
import shop.Item;
import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.*;

public class BasketTest {
    private Basket basketTest;
    private Item bike = null;
    private Item bike2 = new Item("bike", 100);

    @Before
    public void setUp() {
        basketTest = new Basket(new HashMap<>());
    }

    //test should check if addItemsToBasket method adds values correctly to map
    @Test
    public void addItemsToBasketWithCorrectValues() {
        basketTest.addItem(bike2, 3);
        Map tmp = basketTest.getOrderedItems();

        Map<Item, Integer> tmp2 = new HashMap<>();
        tmp2.put(bike2, 3);

        assertEquals(tmp2.entrySet(), tmp.entrySet());
    }

    //check if method throw exception if Item is null
    @Test
    public void addItemsToBasketWithNullItem() {
        try {
            basketTest.addItem(bike, 2);
            fail("NullPointerException was not thrown.");
        }
        catch (NullPointerException e) {
            assertEquals("Choose item.", e.getMessage());
        }
    }

    //check if method throw exception if qty is less than 1
    @Test
    public void addItemsToBasketWithLessThanOneQty() {
        try {
            basketTest.addItem(bike2, -4);
            fail("IllegalArgumentException was not thrown.");
        }
        catch (IllegalArgumentException e) {
            assertEquals("Select at least one item.", e.getMessage());
        }
    }
}