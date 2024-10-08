package com.pizzafactory;

import org.junit.Test;
import static org.junit.Assert.*;

public class PizzaStoreTest {
    @Test
    public void OrderPizza() {
        PizzaFactory factory = new PizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        Pizza pizza = store.orderPizza("cheese");
        assertNotNull(pizza);
        assertTrue(pizza instanceof CheesePizza);
    }

    @Test(expected = IllegalArgumentException.class)
    public void UnknownPizza() {
        PizzaFactory factory = new PizzaFactory();
        PizzaStore store = new PizzaStore(factory);
        store.orderPizza("unknown");
    }
}
