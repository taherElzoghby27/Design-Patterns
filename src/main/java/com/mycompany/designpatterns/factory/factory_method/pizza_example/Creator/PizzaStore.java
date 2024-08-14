package com.mycompany.designpatterns.factory.factory_method.pizza_example.Creator;

import com.mycompany.designpatterns.factory.factory_method.pizza_example.product.Pizza;

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
