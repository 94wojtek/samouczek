package shop.shop_tests;

import org.junit.Test;
import org.junit.Before;
import shop.Item;

import static org.junit.Assert.*;

public class ItemTest {
    private Item bike1;
    private Item bike2;
    private Item ball;
    private Item bike3;

    @Before
    public void setUp() {
        bike1 = new Item("bike", 200);
        bike2 = new Item("bike", 200);
        ball = new Item("ball", 300);
        bike3 = null;
    }

    @Test
    public void shouldCheckIfItemsAreEquals() {
        assertTrue(bike1.equals(bike2));
        System.out.println("assertTrue pass");
    }

    @Test
    public void shouldCheckIfItemsAreNotEquals() {
        assertFalse("assertFalse fail", bike1.equals(ball));
        System.out.println("assertFalse pass");
    }

    @Test
    public void shouldCheckIfItemsAreNull() {
        try {
            assertFalse(bike1.equals(bike3));
        }
        catch(NullPointerException e) {
            assertEquals("Item is null.", e.getMessage());
            System.out.println("null check pass");
        }
    }

    @Test
    public void shouldCheckHashCode() {
        if (bike1.hashCode() == bike2.hashCode())
            System.out.println("hash pass");
    }
}