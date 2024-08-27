package com.julioluis;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MoneyTest {

    @Test
    public void testMultiplyDollars() {
        Money money = Dollar.getInstance(5);
        Money dollar = money.multiply(2);
        assertEquals(Dollar.getInstance(10), dollar);

        dollar = money.multiply(3);
        assertEquals(Dollar.getInstance(15), dollar);
    }

    @Test
    void testEqualityDollars() {
        assertEquals(Dollar.getInstance(5), Dollar.getInstance(5));
        assertNotEquals(Dollar.getInstance(5), Dollar.getInstance(6));
        assertNotEquals(Dollar.getInstance(5), Franc.getInstance(5));
    }

    @Test
    public void testMultiplyFranc() {
        Money money = Franc.getInstance(5);
        Money franc = money.multiply(2);
        assertEquals(Franc.getInstance(10), franc);

        franc = money.multiply(3);
        assertEquals(Franc.getInstance(15), franc);
    }

    @Test
    void testEqualityFranc() {
        assertEquals(Franc.getInstance(5), Franc.getInstance(5));
        assertNotEquals(Franc.getInstance(5), Franc.getInstance(6));
    }
}
