package com.pizzafactory;

public class PizzaFactory {
    public Pizza createPizza(String type) {
        if ("cheese".equals(type)) {
            return new CheesePizza();
        } else if ("greek".equals(type)) {
            return new GreekPizza();
        } else if ("pepperoni".equals(type)) {
            return new PepperoniPizza();
        } else if ("glutenfree".equals(type)) {
            return new GlutenFreePizza();
        } else {
            throw new IllegalArgumentException("Unknown pizza");
        }
    }
}

