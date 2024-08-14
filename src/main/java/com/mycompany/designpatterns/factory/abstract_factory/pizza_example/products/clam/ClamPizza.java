package com.mycompany.designpatterns.factory.abstract_factory.pizza_example.products.clam;

import com.mycompany.designpatterns.factory.abstract_factory.pizza_example.creator.PizzaIngredientFactory;
import com.mycompany.designpatterns.factory.abstract_factory.pizza_example.products.Pizza;

public class ClamPizza extends Pizza {

    private PizzaIngredientFactory pizzaIngredientFactory;

    public ClamPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + getName());
        clam = pizzaIngredientFactory.createClam();
    }

}
