package com.mycompany.designpatterns.factory.factory_method.pizza_example.Creator;

import com.mycompany.designpatterns.factory.factory_method.pizza_example.product.NYStyleClamPizza;
import com.mycompany.designpatterns.factory.factory_method.pizza_example.product.NYStyleCheesePizza;
import com.mycompany.designpatterns.factory.factory_method.pizza_example.product.Pizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" ->
                new NYStyleCheesePizza();
            case "clam" ->
                new NYStyleClamPizza();
            default ->
                null;
        };
    }

}
