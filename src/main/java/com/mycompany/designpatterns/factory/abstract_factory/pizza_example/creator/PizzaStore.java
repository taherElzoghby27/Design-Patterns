package com.mycompany.designpatterns.factory.abstract_factory.pizza_example.creator;

import com.mycompany.designpatterns.factory.abstract_factory.pizza_example.products.Pizza;

public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public abstract Pizza createPizza(String type);
}
