package com.mycompany.designpatterns.factory.factory_method.pizza_example.Creator;

import com.mycompany.designpatterns.factory.factory_method.pizza_example.product.ChicagoStyleCheesePizza;
import com.mycompany.designpatterns.factory.factory_method.pizza_example.product.ChicagoStyleClamPizza;
import com.mycompany.designpatterns.factory.factory_method.pizza_example.product.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" ->
                new ChicagoStyleCheesePizza();
            case "clam" ->
                new ChicagoStyleClamPizza();
            default ->
                null;
        };
    }

}
